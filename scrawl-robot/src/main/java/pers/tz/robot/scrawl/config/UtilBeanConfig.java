package pers.tz.robot.scrawl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 各种工具Bean
 */
@Configuration
public class UtilBeanConfig {

    @Bean
    public BASE64Encoder encoder() {
        return new BASE64Encoder();
    }

    @Bean
    public BASE64Decoder decoder() {
        return new BASE64Decoder();
    }

}
