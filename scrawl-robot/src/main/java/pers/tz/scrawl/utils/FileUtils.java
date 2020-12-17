package pers.tz.scrawl.utils;

import lombok.extern.slf4j.Slf4j;
import pers.tz.scrawl.exception.PersistentException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Optional;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc TODO
 */
@Slf4j
public class FileUtils {

    /**
     * file所在的目录不存在时，为其创建目录
     *
     * @param file
     */
    public static void createDir(File file) {
        if ((file.getAbsolutePath().split("/").length >= 3 || file.getAbsolutePath().split("\\\\").length >= 3)
                && !file.getParentFile().exists()) { // 存在目录
            file.getParentFile().mkdirs(); // 级联创建目录
        }
    }

    /**
     * 清空文件内容
     * 这里的Optional纯粹是为了用而用，不用在意
     *
     * @param diskPath
     */
    public static void refreshFile(String diskPath) {
        createDir(new File(diskPath));
        Optional<Writer> fwOptional = Optional.empty();
        try {
            fwOptional = Optional.of(new FileWriter(diskPath));
            fwOptional.get().write("");
            fwOptional.get().flush();
        } catch (IOException e) {
            throw new PersistentException(e.getMessage());
        } finally {
            if (fwOptional.isPresent()) {
                try {
                    fwOptional.get().close();
                } catch (IOException e) {
                    log.error("refresh file error", e.getMessage(), e);
                }
            }
        }
    }
}
