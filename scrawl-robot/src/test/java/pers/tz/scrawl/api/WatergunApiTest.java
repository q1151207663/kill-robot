package pers.tz.scrawl.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WatergunApiTest {

    @Autowired
    private WatergunApi watergunApi;

    @Test
    public void testScrawlShotgunLevel() {
        watergunApi.persistenceWatergunLevel(5);
    }

    @Test
    public void testOnlineWatergunFire() {
        System.out.println(watergunApi.onlineWatergunFire().getData());
    }

}
