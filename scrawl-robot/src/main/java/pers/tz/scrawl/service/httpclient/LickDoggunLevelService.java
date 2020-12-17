package pers.tz.scrawl.service.httpclient;

import lombok.AllArgsConstructor;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Component;
import pers.tz.scrawl.config.MagazineScrawlConfig;
import pers.tz.scrawl.service.processor.LickDoggunLevelProcessor;
import pers.tz.scrawl.utils.FileUtils;

/**
 * @Author twz
 * @Date 2020-12-17
 * @Desc TODO
 */
@Component
@AllArgsConstructor
public class LickDoggunLevelService extends HttpClientBaseService{

    private MagazineScrawlConfig magazineScrawlConfig;
    private CloseableHttpClient magazineHttpClient;
    private HttpGet lickDoggunHttpGet;
    private LickDoggunLevelProcessor lickDoggunLevelProcessor;

    public String scrawl() {
        return download(magazineHttpClient, lickDoggunHttpGet, magazineScrawlConfig.getRetryCount()).getEntity();
    }

    public void scrawlAndPersistent(int number) {
        for (int i = 0; i < number; i++)
            lickDoggunLevelProcessor.start();
    }

    public void scrawlRefreshAndPersistent(Integer number) {
        refreshLickDoggunLevel();
        scrawlAndPersistent(number);
    }

    public void refreshLickDoggunLevel() {
        FileUtils.refreshFile(magazineScrawlConfig.getLickdogDiskPath());
    }
}
