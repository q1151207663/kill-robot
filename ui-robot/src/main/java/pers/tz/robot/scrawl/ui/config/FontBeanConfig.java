package pers.tz.robot.scrawl.ui.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

/**
 * @Author twz
 * @Date 2020-12-23
 * @Desc TODO
 */
@Configuration
public class FontBeanConfig {

    @Autowired
    private CommonConfig commonConfig;

    /**
     * 共用字体
     *
     * @return
     */
    @Bean
    public Font commonFont() {
        return new Font(commonConfig.getFontStyle(), Font.BOLD, commonConfig.getFontSize());
    }

    /**
     * 标题字体
     *
     * @return
     */
    @Bean
    public Font titleFont() {
        return new Font(commonConfig.getFontStyle(), Font.BOLD, commonConfig.getTitleFontSize());
    }


    /**
     * 按钮字体
     *
     * @return
     */
    @Bean
    public Font btnFont() {
        return new Font(commonConfig.getFontStyle(), Font.BOLD, commonConfig.getBtnFontSize());
    }

    /**
     * 超链接字体
     *
     * @return
     */
    @Bean
    public Font linkFont() {
        return new Font(commonConfig.getFontStyle(), Font.PLAIN, commonConfig.getLinkFontSize());
    }
}
