package pers.tz.scrawl.service.httpclient;

import lombok.AllArgsConstructor;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Component;
import pers.tz.scrawl.config.MagazineScrawlConfig;
import pers.tz.scrawl.service.processor.WatergunLevelProcessor;
import pers.tz.scrawl.utils.FileUtils;

/**
 * @Author twz
 * @Date 2020-12-17
 * @Desc TODO
 */
@Component
@AllArgsConstructor
public class WatergunLevelService extends HttpClientBaseService{

    private MagazineScrawlConfig magazineScrawlConfig;
    private CloseableHttpClient magazineHttpClient;
    private HttpGet watergunHttpGet;
    private WatergunLevelProcessor watergunLevelProcessor;

    public String scrawl() {
        return download(magazineHttpClient, watergunHttpGet, magazineScrawlConfig.getRetryCount()).getEntity();
    }

    public void scrawlAndPersistent(Integer number) {
        for (Integer i = 0; i < number; i++)
            watergunLevelProcessor.start();
    }

    public void scrawlRefreshAndPersistent(Integer number) {
        refreshWatergunLevel();
        scrawlAndPersistent(number);
    }

    public void refreshWatergunLevel() {
        FileUtils.refreshFile(magazineScrawlConfig.getWatergunDiskPath());
    }
}
