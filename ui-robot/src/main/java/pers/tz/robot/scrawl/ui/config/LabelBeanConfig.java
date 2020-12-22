package pers.tz.robot.scrawl.ui.config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pers.tz.robot.scrawl.ui.constants.UIUnitsType;

import javax.swing.*;
import java.awt.*;

/**
 * @Author twz
 * @Date 2020-12-23
 * @Desc TODO
 */
@Configuration
@AllArgsConstructor
public class LabelBeanConfig {

    private FireSetPanelConfig fireSetPanelConfig;
    private Font commonFont;
    private Font titleFont;


    /**
     * 开火设置界面title
     *
     * @return
     */
    @Bean
    public JLabel fireSetPanelTitleLabel() {
        JLabel fireSetPanelTitleLabel = new JLabel(fireSetPanelConfig.getFireSetPanelTitle());
        fireSetPanelTitleLabel.setFont(titleFont);
        fireSetPanelTitleLabel.setForeground(Color.RED);
        fireSetPanelTitleLabel.setBounds(50 * UIUnitsType.LOCATION_UNIT_10, 2 * UIUnitsType.LOCATION_UNIT_10,
                28 * UIUnitsType.LOCATION_UNIT_10, 3 * UIUnitsType.LOCATION_UNIT_10);
        return fireSetPanelTitleLabel;
    }


    /**
     * 调节速度label
     *
     * @return
     */
    @Bean
    public JLabel speedLabel() {
        JLabel speedLabel = new JLabel(fireSetPanelConfig.getSpeedLabelText());
        speedLabel.setFont(commonFont);
        speedLabel.setForeground(Color.WHITE);
        speedLabel.setBounds(12 * UIUnitsType.LOCATION_UNIT_10, 15 * UIUnitsType.LOCATION_UNIT_10,
                11 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return speedLabel;
    }

    /**
     * 调节数量label
     *
     * @return
     */
    @Bean
    public JLabel numberLabel() {
        JLabel numberLabel = new JLabel(fireSetPanelConfig.getNumberLabelText());
        numberLabel.setFont(commonFont);
        numberLabel.setForeground(Color.WHITE);
        numberLabel.setBounds(72 * UIUnitsType.LOCATION_UNIT_10, 15 * UIUnitsType.LOCATION_UNIT_10,
                11 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return numberLabel;
    }


    /**
     * 开火策略
     *
     * @return
     */
    @Bean
    public JLabel fireStrategyLabel() {
        JLabel fireStrategyLabel = new JLabel(fireSetPanelConfig.getFireStrategyText());
        fireStrategyLabel.setFont(commonFont);
        fireStrategyLabel.setForeground(Color.WHITE);
        fireStrategyLabel.setBounds(12 * UIUnitsType.LOCATION_UNIT_10, 20 * UIUnitsType.LOCATION_UNIT_10,
                11 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return fireStrategyLabel;
    }


    /**
     * 输入策略
     *
     * @return
     */
    @Bean
    public JLabel inputStrategyLabel() {
        JLabel inputStrategyLabel = new JLabel(fireSetPanelConfig.getInputStrategyText());
        inputStrategyLabel.setFont(commonFont);
        inputStrategyLabel.setForeground(Color.WHITE);
        inputStrategyLabel.setBounds(72 * UIUnitsType.LOCATION_UNIT_10, 20 * UIUnitsType.LOCATION_UNIT_10,
                11 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return inputStrategyLabel;
    }

    /**
     * 强度调节
     *
     * @return
     */
    @Bean
    public JLabel levelLabel() {
        JLabel levelLabel = new JLabel(fireSetPanelConfig.getLevelLabelText());
        levelLabel.setFont(commonFont);
        levelLabel.setForeground(Color.WHITE);
        levelLabel.setBounds(12 * UIUnitsType.LOCATION_UNIT_10, 25 * UIUnitsType.LOCATION_UNIT_10,
                11 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return levelLabel;
    }


    /**
     * 预按回车
     *
     * @return
     */
    @Bean
    public JLabel advancePressEnterLabel() {
        JLabel advancePressEnterLabel = new JLabel(fireSetPanelConfig.getAdvancePressEnterText());
        advancePressEnterLabel.setFont(commonFont);
        advancePressEnterLabel.setForeground(Color.WHITE);
        advancePressEnterLabel.setBounds(72 * UIUnitsType.LOCATION_UNIT_10, 25 * UIUnitsType.LOCATION_UNIT_10,
                11 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return advancePressEnterLabel;
    }

    /**
     * 舔狗模式
     *
     * @return
     */
    @Bean
    public JLabel lickDogLabel() {
        JLabel lickDogLabel = new JLabel(fireSetPanelConfig.getLickDogLabelText());
        lickDogLabel.setFont(commonFont);
        lickDogLabel.setForeground(Color.WHITE);
        lickDogLabel.setBounds(12 * UIUnitsType.LOCATION_UNIT_10, 30 * UIUnitsType.LOCATION_UNIT_10,
                11 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return lickDogLabel;
    }


    /**
     * 云开火
     *
     * @return
     */
    @Bean
    public JLabel cloudFireLabel() {
        JLabel cloudFireLabel = new JLabel(fireSetPanelConfig.getCloudFireLabelText());
        cloudFireLabel.setFont(commonFont);
        cloudFireLabel.setForeground(Color.WHITE);
        cloudFireLabel.setBounds(72 * UIUnitsType.LOCATION_UNIT_10, 30 * UIUnitsType.LOCATION_UNIT_10,
                11 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return cloudFireLabel;
    }

}
