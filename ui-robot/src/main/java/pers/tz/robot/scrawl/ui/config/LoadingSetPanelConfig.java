package pers.tz.robot.scrawl.ui.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author twz
 * @Date 2020-12-25
 * @Desc TODO
 */
@Component
@Data
public class LoadingSetPanelConfig {

    /**
     * 标题
     */
    @Value("${loading-set-panel.title}")
    private String loadingSetPanelTitle;

    /**
     * 更新强弹药库
     */
    @Value("${loading-set-panel.update-shotgun-level.text}")
    private String updateShotgunLevelText;

    /**
     * 更新中等弹药库
     */
    @Value("${loading-set-panel.update-watergun-level.text}")
    private String updateWatergunLevelText;

    /**
     * 更新舔狗弹药库
     */
    @Value("${loading-set-panel.update-lickdog-level.text}")
    private String updateLickdogLevelText;

}
