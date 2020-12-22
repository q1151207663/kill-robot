package pers.tz.robot.scrawl.api;

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
public class LickDoggunApiTest {

    @Autowired
    private LickDoggunApi lickDoggunApi;

    @Test
    public void testScrawlShotgunLevel() {
        lickDoggunApi.persistenceLickDoggunLevel(5);
    }

    @Test
    public void testOnlineLickDoggunFire() {
        String data = lickDoggunApi.onlineLickDoggunFire().getData();
        System.out.println(data);
    }

}
