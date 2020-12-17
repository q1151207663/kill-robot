package pers.tz.scrawl.api;

import lombok.AllArgsConstructor;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Component;
import pers.tz.scrawl.service.httpclient.ShotgunLevelService;
import pers.tz.scrawl.service.processor.ShotgunLevelProcessor;
import pers.tz.scrawl.vo.ApiResult;

/**
 * @Author twz
 * @Date 2020-12-11
 * @Desc 霰弹枪Api入口
 */
@Component
@AllArgsConstructor
public class ShotgunApi {

    private ShotgunLevelService shotgunLevelService;

    /**
     * 填充霰弹枪等级弹匣，持久化到本地
     *
     * @param number 弹匣数
     */
    public ApiResult persistenceShotgunLevel(Integer number) {
        shotgunLevelService.scrawlAndPersistent(number);
        return ApiResult.ok();
    }

    /**
     * 刷新并填充霰弹枪模式等级弹匣
     *
     * @param number
     * @return
     */
    public ApiResult refreshAndPersistenceShotgunLevel(Integer number) {
        shotgunLevelService.scrawlRefreshAndPersistent(number);
        return ApiResult.ok();
    }


    /**
     * 刷新霰弹枪模式等级弹匣
     *
     * @return
     */
    public ApiResult refreshWatergunLevel() {
        shotgunLevelService.refreshShotgunLevel();
        return ApiResult.ok();
    }

    /**
     * 在线获取子弹，不持久化到本地
     *
     */
    public ApiResult<String> onlineShotgunFire() {
        String result = shotgunLevelService.scrawl();
        return ApiResult.ok(result);
    }

}
