package pers.tz.scrawl.config;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.tz.scrawl.constants.RequestHeaderType;

import java.util.*;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 注入httpclient框架中一些共用的bean实例
 */
@Configuration
public class HttpClientBeanConfig {

    @Autowired
    private MagazineScrawlConfig magazineScrawlConfig;

    @Bean
    public List<Header> requestHeaders() {
        return Arrays.asList(new BasicHeader(RequestHeaderType.ACCEPT.value, magazineScrawlConfig.getAccept()),
                new BasicHeader(RequestHeaderType.REFERER.value, magazineScrawlConfig.getReferer()),
                new BasicHeader(RequestHeaderType.SEC_FETCH_DEST.value, magazineScrawlConfig.getSecFetchDest()),
                new BasicHeader(RequestHeaderType.SEC_FETCH_MODE.value, magazineScrawlConfig.getSecFetchMode()),
                new BasicHeader(RequestHeaderType.SEC_FETCH_SITE.value, magazineScrawlConfig.getSecFetchSite()),
                new BasicHeader(RequestHeaderType.X_REQUESTED_WITH.value, magazineScrawlConfig.getXRequestedWith()));
    }

    @Bean
    public CloseableHttpClient magazineHttpClient(List<Header> requestHeaders) {
        return HttpClientBuilder.create()
                .setDefaultHeaders(requestHeaders) // httpclient请求失败重试这个逻辑需要自己写
                .build();
    }

    @Bean
    public HttpGet shotgunHttpGet() {
        return new HttpGet(magazineScrawlConfig.getShotGunURL());
    }

    @Bean
    public HttpGet watergunHttpGet() {
        return new HttpGet(magazineScrawlConfig.getWaterGunUrl());
    }

    @Bean
    public HttpGet lickDoggunHttpGet() {
        return new HttpGet(magazineScrawlConfig.getLickDogUrl());
    }

}
