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

    @Value("${common.font-size}")
    private Integer fontSize;

    @Value("${common.font-style}")
    private String fontStyle;

    @Value("${common.title.font-size}")
    private Integer titleFontSize;

    @Value("${common.btn.font-size}")
    private Integer btnFontSize;

}
