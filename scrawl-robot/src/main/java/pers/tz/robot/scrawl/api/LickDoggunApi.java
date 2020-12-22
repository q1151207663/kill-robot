package pers.tz.robot.scrawl.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pers.tz.robot.scrawl.service.httpclient.LickDoggunLevelService;
import pers.tz.robot.common.vo.ApiResult;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 舔狗模式Api入口
 */
@Component
@AllArgsConstructor
public class LickDoggunApi {

    private LickDoggunLevelService lickDoggunLevelService;

    /**
     * 填充舔狗模式等级弹匣
     *
     * @param number
     */
    public ApiResult persistenceLickDoggunLevel(Integer number) {
        lickDoggunLevelService.scrawlAndPersistent(number);
        return ApiResult.ok();
    }


    /**
     * 刷新并填充舔狗模式等级弹匣
     *
     * @param number
     * @return
     */
    public ApiResult refreshAndPersistenceLickDoggunLevel(Integer number) {
        lickDoggunLevelService.scrawlRefreshAndPersistent(number);
        return ApiResult.ok();
    }


    /**
     * 刷新舔狗模式等级弹匣
     *
     * @return
     */
    public ApiResult refreshLickDoggunLevel() {
        lickDoggunLevelService.refreshLickDoggunLevel();
        return ApiResult.ok();
    }

    /**
     * 在线获取子弹，不持久化到本地
     *
     * @return
     */
    public ApiResult<String> onlineLickDoggunFire() {
        String result = lickDoggunLevelService.scrawl();
        return ApiResult.ok(result);
    }
}