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
public class IndexConfig {

    @Value("${index.title}")
    private String title;

    @Value("${index.resizeable}")
    private Boolean resizeAble;

    @Value("${index.index.width}")
    private Integer indexWidth;

    @Value("${index.index.height}")
    private Integer indexHeight;

}
