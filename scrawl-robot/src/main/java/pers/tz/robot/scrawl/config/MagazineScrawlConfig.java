package pers.tz.robot.scrawl.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author twz
 * @Date 2020-12-12
 * @Desc 弹药库爬虫配置
 */
@Component
@Data
public class MagazineScrawlConfig {

    /**
     * 霰弹枪弹匣仓库地址
     */
    @Value("${url.shotgun}")
    private String shotGunURL;

    /**
     * 水枪弹匣仓库地址
     */
    @Value("${url.watergun}")
    private String waterGunUrl;

    /**
     * 舔狗弹匣仓库地址
     */
    @Value("${url.lickDogUrl}")
    private String lickDogUrl;

    /**
     * 爬虫线程数量
     */
    @Value("${scrawl.thread.count}")
    private Integer threadCount;

    /**
     * 爬虫失败重复尝试次数
     */
    @Value("${scrawl.retry.count}")
    private Integer retryCount;

    /**
     * 请求头部分
     */
    @Value("${head.accept}")
    private String accept;
    @Value("${head.referer}")
    private String referer;
    @Value("${head.sec-fetch-dest}")
    private String secFetchDest;
    @Value("${head.sec-fetch-mode}")
    private String secFetchMode;
    @Value("${head.sec-fetch-site}")
    private String secFetchSite;
    @Value("${head.x-requested-with}")
    private String xRequestedWith;

    /**
     * 霰弹枪弹匣本地磁盘存放位置
     */
    @Value("${magazine.shotgun.diskpath}")
    private String shotgunDiskPath;

    /**
     * 水枪弹匣本地磁盘存放位置
     */
    @Value("${magazine.watergun.diskpath}")
    private String watergunDiskPath;

    /**
     * 舔狗弹匣本地磁盘存放位置
     */
    @Value("${magazine.lickdog.diskpath}")
    private String lickdogDiskPath;

    /**
     * 报错日志文件磁盘存放位置
     */
    @Value("${log.error.diskpath}")
    private String errorDiskpath;

}
