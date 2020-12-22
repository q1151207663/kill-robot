package pers.tz.robot.scrawl.service.httpclient;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import pers.tz.robot.common.exception.PersistentException;
import pers.tz.robot.common.vo.ResponseVo;

import java.io.IOException;

/**
 * @Author twz
 * @Date 2020-12-17
 * @Desc TODO
 */
@Slf4j
public abstract class HttpClientBaseService {

    protected ResponseVo download(CloseableHttpClient httpClient, HttpRequestBase httpRequestBase) {
        ResponseVo responseVo = null;
        try {
            responseVo = new ResponseVo(EntityUtils.toString(httpClient.execute(httpRequestBase).getEntity()));
        } catch (Exception e) {
            if (!isIgnoreException(e)){
                throw new PersistentException(e.getMessage());
            }
            log.error("happen can't ignore exception in HttpClientBaseService", e.getMessage(), e);
        }
        return responseVo;
    }

    protected ResponseVo download(CloseableHttpClient httpClient, HttpRequestBase httpRequestBase, int retry) {
        ResponseVo responseVo = null;
        for (int i = 0; i < retry; i++) {
            responseVo = download(httpClient, httpRequestBase);
            if (responseVo == null) {
                sleep(100);
                continue;
            }
            break;
        }
        return responseVo;
    }

    /**
     * 判断异常是否是指定异常的子异常或该异常本身
     *
     * @param e
     * @return
     */
    private boolean isIgnoreException(Exception e) {
        return e.getClass().isAssignableFrom(IOException.class);
    }

    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
