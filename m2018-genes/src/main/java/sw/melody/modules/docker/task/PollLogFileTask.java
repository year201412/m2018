package sw.melody.modules.docker.task;

import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import sw.melody.common.utils.Constant.SampleStatus;
import sw.melody.modules.docker.entity.SampleEntity;
import sw.melody.modules.docker.service.SampleService;
import sw.melody.modules.docker.util.MoreLogUtil;
import sw.melody.modules.docker.util.SaveFile;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author ping
 * @create 2018-12-29 8:57
 **/
@Component
public class PollLogFileTask extends Thread implements ApplicationContextAware, InitializingBean {

    private static final Logger log = LoggerFactory.getLogger(PollLogFileTask.class);
    private static final LinkedBlockingQueue<Long> triggerDeque = new LinkedBlockingQueue <>();
    private static final String success = SampleStatus.Success.getStatus();
    private static final String running = SampleStatus.Running.getStatus();
    private static final String successMsg = "##########全部执行完成";
    private static SampleService sampleService;

    @Override
    public void run() {
        while (true) {
            try {
                Long sickId = triggerDeque.poll(10, TimeUnit.SECONDS);
                if (sickId != null) {
                    List<SampleEntity> entityList = sampleService.queryListSickId(sickId);
                    if (CollectionUtils.isEmpty(entityList)) {
                        log.error("病人：{} 的样本记录为null", sickId);
                        break;
                    }
                    SampleEntity entity = entityList.get(0);
                    if (success.equals(entity.getUploadStatus())
                            && StringUtils.isNotBlank(entity.getTriggerStatus())
                            && running.equals(entity.getTriggerStatus())) {

                        String logFileName = SaveFile.linkFileSeparator(entity.getLocation()).concat(entity.getOriginName()).concat(".out");
                        File logFile = new File(logFileName);
                        if (!logFile.exists()) {
                            log.error("日志文件：{} 暂未生成，继续轮询", logFileName);
                            pushReq(sickId);
                            continue;
                        }
                        String logResult = MoreLogUtil.getLastLine(logFileName);
                        log.info("最后一行数据：{}", logResult);

                        if (logResult.startsWith(successMsg)) {
                            entity.setTriggerFinishTime(new Date());
                            entity.setTriggerStatus(success);
                            sampleService.update(entity);
                            log.info("病人：{} 的样本解析完成", sickId);

                            StoreResultTask.pushReq(entity.getId());
                        } else {
                            pushReq(sickId);
                        }
                    } else {
                        log.error("病人记录不符合监控条件, json = {}", new Gson().toJson(entity));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }


    public static void pushReq(Long sickId) {
        if (triggerDeque.contains(sickId)) {
            log.error("该病人样本已加入请求队列中：sickId = {}", sickId);
            return;
        }
        triggerDeque.add(sickId);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        sampleService = applicationContext.getBean(SampleService.class);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.setName("poll-log-task");
        this.start();
    }
}
