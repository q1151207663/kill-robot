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
public class FireSetPanelConfig {

    @Value("${fire-set-panel.title}")
    private String fireSetPanelTitle;

    @Value("${fire-set-panel.speed-label.text}")
    private String speedLabelText;

    @Value("${fire-set-panel.number-label.text}")
    private String numberLabelText;

    @Value("${fire-set-panel.fire-strategy.text}")
    private String fireStrategyText;

    @Value("${fire-set-panel.input-strategy.text}")
    private String inputStrategyText;

    @Value("${fire-set-panel.level.text}")
    private String levelLabelText;

    @Value("${fire-set-panel.advance-press-enter.text}")
    private String advancePressEnterText;

    @Value("${fire-set-panel.lick-dog.text}")
    private String lickDogLabelText;

    @Value("${fire-set-panel.cloud-fire.text}")
    private String cloudFireLabelText;

    @Value("${fire-set-panel.btn.text}")
    private String fireBtn;
}
