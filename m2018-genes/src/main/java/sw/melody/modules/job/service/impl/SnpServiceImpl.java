package sw.melody.modules.job.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sw.melody.modules.job.dao.SnpDao;
import sw.melody.modules.job.dao.SnpFormatDao;
import sw.melody.modules.job.dao.SnpInfoDao;
import sw.melody.modules.job.entity.SnpEntity;
import sw.melody.modules.job.entity.SnpFormatEntity;
import sw.melody.modules.job.entity.SnpInfoEntity;
import sw.melody.modules.job.service.SnpService;

import java.util.List;
import java.util.Map;

/***
 * Created by ping on 2018/6/22
 */
@Service
public class SnpServiceImpl implements SnpService {
    @Autowired
    private SnpDao snpDao;
    @Autowired
    private SnpFormatDao snpFormatDao;
    @Autowired
    private SnpInfoDao snpInfoDao;

    @Override
    public SnpEntity queryObject(Integer id) {
        return snpDao.queryObject(id);
    }

    @Override
    public List<SnpEntity> queryList(Map<String, Object> map) {
        return snpDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return snpDao.queryTotal(map);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SnpEntity snpEntity, SnpInfoEntity infoEntity, List<SnpFormatEntity> list) {
        snpDao.save(snpEntity);
        list.forEach(item -> item.setSnpId(snpEntity.getId()));
        infoEntity.setSnpId(snpEntity.getId());
        snpInfoDao.save(infoEntity);
        snpFormatDao.saveBatch(list);
    }
}
