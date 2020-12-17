package pers.tz.scrawl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.tz.scrawl.constants.RequestHeaderType;
import us.codecraft.webmagic.Site;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 注入webmagic框架中一些共用的bean实例
 */
@Configuration
public class WebMagicBeanConfig {

    @Autowired
    private MagazineScrawlConfig magazineScrawlConfig;

    @Bean
    public Site magazineSite() {
        return Site.me()
                .addHeader(RequestHeaderType.ACCEPT.value, magazineScrawlConfig.getAccept())
                .addHeader(RequestHeaderType.REFERER.value, magazineScrawlConfig.getReferer())
                .addHeader(RequestHeaderType.SEC_FETCH_DEST.value, magazineScrawlConfig.getSecFetchDest())
                .addHeader(RequestHeaderType.SEC_FETCH_MODE.value, magazineScrawlConfig.getSecFetchMode())
                .addHeader(RequestHeaderType.SEC_FETCH_SITE.value, magazineScrawlConfig.getSecFetchSite())
                .addHeader(RequestHeaderType.X_REQUESTED_WITH.value, magazineScrawlConfig.getXRequestedWith())
                .setRetryTimes(magazineScrawlConfig.getRetryCount());
    }

}
