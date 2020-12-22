package pers.tz.robot.scrawl.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.tz.robot.common.exception.PersistentException;
import pers.tz.robot.common.utils.FileUtils;

import java.io.*;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 用于持久化的IO相关Bean
 */
@Configuration
@Slf4j
public class IOBeanConfig {

    @Autowired
    private MagazineScrawlConfig magazineScrawlConfig;

    @Bean
    public File shotgunFile() {
        return new File(magazineScrawlConfig.getShotgunDiskPath());
    }

    @Bean
    public File watergunFile() {
        return new File(magazineScrawlConfig.getWatergunDiskPath());
    }

    @Bean
    public File lockGodgunFile() {
        return new File(magazineScrawlConfig.getLickdogDiskPath());
    }

    @Bean
    public File persistentLogFile() {
        return new File(magazineScrawlConfig.getErrorDiskpath());
    }


    /**
     * 霰弹枪弹匣持久化IOBean
     *
     * @return
     */
    @Bean
    public BufferedWriter bwShotgunWriter(File shotgunFile) {
        try {
            FileUtils.createDir(shotgunFile);
            return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(shotgunFile, true)));
        } catch (FileNotFoundException e) {
            throw new PersistentException(e.getMessage());
        }
    }


    /**
     * 水枪弹匣持久化IOBean
     *
     * @return
     */
    @Bean
    public BufferedWriter bwWatergunWriter(File watergunFile) {
        try {
            FileUtils.createDir(watergunFile);
            return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(watergunFile, true)));
        } catch (FileNotFoundException e) {
            throw new PersistentException(e.getMessage());
        }
    }


    /**
     * 舔狗弹匣持久化IOBean
     *
     * @return
     */
    @Bean
    public BufferedWriter bwLockDogWriter(File lockGodgunFile) {
        try {
            FileUtils.createDir(lockGodgunFile);
            return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(lockGodgunFile, true)));
        } catch (FileNotFoundException e) {
            throw new PersistentException(e.getMessage());
        }
    }


    /**
     * 异常日志持久化IOBean
     *
     * @param persistentLogFile
     * @return
     */
    @Bean
    public OutputStream persistentLogOutputStream(File persistentLogFile) {
        try {
            FileUtils.createDir(persistentLogFile);
            return new FileOutputStream(persistentLogFile, true);
        } catch (FileNotFoundException e) {
            log.error("create persistent log out put stream failure", e.getMessage(), e);
        }
        return null;
    }

}
