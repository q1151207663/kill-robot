package pers.tz.scrawl.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.tz.scrawl.config.MagazineScrawlConfig;

/**
 * @Author twz
 * @Date 2020-12-12
 * @Desc TODO shotgun
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShotgunApiTest {

    @Autowired
    private ShotgunApi shotgunApi;

    @Test
    public void testScrawlShotgunLevel() {
        // todo 清空弹匣文件
        shotgunApi.persistenceShotgunLevel(5);
        System.out.println("scrawl successful");
    }


    @Test
    public void testOnlineShotgunFire() {
        System.out.println(shotgunApi.onlineShotgunFire().getData());
    }



}
