package sw.melody.modules.docker.util;


import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @author wange
 */
public class IsAllUploaded {

    private final static List<UploadInfo> uploadInfoList = new ArrayList<>();

    /**
     * @param md5
     * @param chunks
     * @return
     */
    public static boolean isAllUploaded(@NotNull final String md5,
                                        @NotNull final String chunks) {
        synchronized (uploadInfoList) {
            int size = uploadInfoList.stream()
                    .filter(item -> item.getMd5().equals(md5))
                    .distinct()
                    .collect(Collectors.toList())
                    .size();
            boolean bool = (size == Integer.parseInt(chunks));
            if (bool) {
                uploadInfoList.removeIf(item -> Objects.equals(item.getMd5(), md5));
            }
            return bool;
        }
    }

    public static boolean isAllUploadedGuid(@NotNull final String guid, @NotNull final String chunks) {
        synchronized (uploadInfoList) {
            int size = uploadInfoList.stream()
                    .filter(item -> item.getGuid().equals(guid))
                    .distinct()
                    .collect(Collectors.toList())
                    .size();
            boolean bool = (size == Integer.parseInt(chunks));
            if (bool) {
                uploadInfoList.removeIf(item -> Objects.equals(item.getGuid(), guid));
            }
            return bool;
        }
    }

    public static boolean uploadedAll(@NotNull final String guid,
                                      @NotNull final String chunk,
                                      @NotNull final String chunks,
                                      @NotNull final String uploadFolderPath,
                                      @NotNull final String fileName,
                                      @NotNull final String ext)
            throws Exception {
        synchronized (uploadInfoList) {
            uploadInfoList.add(new UploadInfo(null, chunks, chunk, uploadFolderPath, fileName, ext, guid));
        }
        boolean allUploaded = isAllUploadedGuid(guid, chunks);
        if (allUploaded) {
            return true;
        }
        return false;
    }

    /**
     * @param md5         MD5
     * @param guid        随机生成的文件名
     * @param chunk       文件分块序号
     * @param chunks      文件分块数
     * @param fileName    文件名
     * @param ext         文件后缀名
     */
    public static boolean uploadedAll(@NotNull final String md5,
                                @NotNull final String guid,
                                @NotNull final String chunk,
                                @NotNull final String chunks,
                                @NotNull final String uploadFolderPath,
                                @NotNull final String fileName,
                                @NotNull final String ext)
            throws Exception {
        synchronized (uploadInfoList) {
            uploadInfoList.add(new UploadInfo(md5, chunks, chunk, uploadFolderPath, fileName, ext));
        }
        boolean allUploaded = isAllUploaded(md5, chunks);
        if (allUploaded) {
            return true;
        }
        return false;
    }
}



