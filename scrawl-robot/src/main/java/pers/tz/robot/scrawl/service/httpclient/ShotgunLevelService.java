package pers.tz.robot.scrawl.service.httpclient;

import lombok.AllArgsConstructor;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Component;
import pers.tz.robot.scrawl.config.MagazineScrawlConfig;
import pers.tz.robot.scrawl.service.processor.ShotgunLevelProcessor;
import pers.tz.robot.common.utils.FileUtils;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc TODO
 */
@Component
@AllArgsConstructor
public class ShotgunLevelService extends HttpClientBaseService{

    private MagazineScrawlConfig magazineScrawlConfig;
    private CloseableHttpClient magazineHttpClient;
    private HttpGet shotgunHttpGet;
    private ShotgunLevelProcessor shotgunLevelProcessor;


    public String scrawl() {
        return download(magazineHttpClient, shotgunHttpGet, magazineScrawlConfig.getRetryCount()).getEntity();
    }

    public void scrawlAndPersistent(Integer number) {
        for (Integer i = 0; i < number; i++)
            shotgunLevelProcessor.start();
    }

    public void scrawlRefreshAndPersistent(Integer number) {
        refreshShotgunLevel();
        scrawlAndPersistent(number);
    }

    public void refreshShotgunLevel() {
        FileUtils.refreshFile(magazineScrawlConfig.getShotgunDiskPath());
    }
}
