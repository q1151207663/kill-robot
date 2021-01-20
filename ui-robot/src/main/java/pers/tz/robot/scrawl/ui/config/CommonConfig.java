package pers.tz.robot.scrawl.ui.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author twz
 * @Date 2020-12-23
 * @Desc TODO
 */
@Component
@Data
public class CommonConfig {

    @Value("${common.font-style}")
    private String fontStyle;

    @Value("${common.font-size}")
    private Integer fontSize;

    @Value("${common.link.font-size}")
    private Integer linkFontSize;

    @Value("${common.title.font-size}")
    private Integer titleFontSize;

    @Value("${common.btn.font-size}")
    private Integer btnFontSize;

    /**
     * 前往装弹设置界面
     */
    @Value("${to-loading.label.text}")
    private String toLoadingText;

    /**
     * 前往开火设置界面
     */
    @Value("${to-fire.label.text}")
    private String toFireLoadingText;
}
