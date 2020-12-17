package pers.tz.scrawl;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc TODO
 */
public class Temp {

    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .build();
        HttpGet httpGet = new HttpGet("https://zuanbsdsot.com/api.php?lang=zh_cn");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        System.out.println("response = " + response);
    }
}