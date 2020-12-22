package pers.tz.robot.scrawl.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pers.tz.robot.scrawl.service.httpclient.WatergunLevelService;
import pers.tz.robot.common.vo.ApiResult;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 水枪Api入口
 */
@Component
@AllArgsConstructor
public class WatergunApi {

    private WatergunLevelService watergunLevelService;

    /**
     * 填充水枪等级弹匣，持久化到本地
     *
     * @param number 子弹数量
     * @return
     */
    public ApiResult persistenceWatergunLevel(Integer number) {
        watergunLevelService.scrawlAndPersistent(number);
        return ApiResult.ok();
    }

    /**
     * 刷新并填充水枪模式等级弹匣
     *
     * @param number
     * @return
     */
    public ApiResult refreshAndPersistenceWatergunLevel(Integer number) {
        watergunLevelService.scrawlRefreshAndPersistent(number);
        return ApiResult.ok();
    }


    /**
     * 刷新水枪模式等级弹匣
     *
     * @return
     */
    public ApiResult refreshWatergunLevel() {
        watergunLevelService.refreshWatergunLevel();
        return ApiResult.ok();
    }

    /**
     * 在线获取子弹，不持久化到本地
     *
     * @return
     */
    public ApiResult<String> onlineWatergunFire() {
        String result = watergunLevelService.scrawl();
        return ApiResult.ok(result);
    }
}
