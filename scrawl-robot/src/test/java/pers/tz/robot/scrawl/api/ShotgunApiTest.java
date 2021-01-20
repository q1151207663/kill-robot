package pers.tz.robot.scrawl.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        shotgunApi.persistenceShotgunLevel(10);
        System.out.println("robot successful");
    }


    @Test
    public void testOnlineShotgunFire() {
        System.out.println(shotgunApi.onlineShotgunFire().getData());
    }



}
