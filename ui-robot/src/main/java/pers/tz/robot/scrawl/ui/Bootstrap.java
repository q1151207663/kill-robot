package pers.tz.robot.scrawl.ui;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import pers.tz.robot.common.exception.PersistentException;
import pers.tz.robot.scrawl.ui.main.IndexUI;

/**
 * @Author twz
 * @Date 2020-12-22
 * @Desc TODO
 */
@SpringBootApplication
@Slf4j
public class Bootstrap {

    @Autowired
    public Bootstrap(IndexUI indexUI) {
        indexUI.init();
    }

    public static void main(String[] args) {
        try {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            log.info("awt init error", e.getMessage(), e);
            throw new PersistentException(e.getMessage());
        }

        /*
            1:
                自定义SpringApplication对象
                SpringApplication springApplication = new SpringApplication(Bootstrap.class);
                springApplication.setHeadless(false);
                springApplication.run(args);
         */

        /*
            2:
                下面这种方式是Spring Boot2.x提供的流式编程语法
         */
        new SpringApplicationBuilder(Bootstrap.class)
                .headless(false) // awt程序需要设置这个
                .run(args);
    }

}
