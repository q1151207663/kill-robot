package pers.tz.robot.scrawl.ui.config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.tz.robot.scrawl.ui.action.LinkMouseAction;
import pers.tz.robot.scrawl.ui.constants.UIUnitsType;

import javax.swing.*;
import java.awt.*;

/**
 * @Author twz
 * @Date 2020-12-23
 * @Desc TODO
 */
@Configuration
public class LabelBeanConfig {

    @Autowired
    private FireSetPanelConfig fireSetPanelConfig;
    @Autowired
    private LoadingSetPanelConfig loadingSetPanelConfig;
    @Autowired
    private CommonConfig commonConfig;
    @Autowired
    private Font commonFont;
    @Autowired
    private Font titleFont;
    @Autowired
    private Font linkFont;
    /**
     * 是否是装弹界面
     */
    private Boolean isLoadingPanel = false;

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
        fireSetPanelTitleLabel.setVisible(!isLoadingPanel);
        return fireSetPanelTitleLabel;
    }

    /**
     * 装弹界面title
     *
     * @return
     */
    @Bean
    public JLabel loadingSetPanelTitleLabel() {
        JLabel loadingSetPanelTitleLabel = new JLabel(loadingSetPanelConfig.getLoadingSetPanelTitle());
        loadingSetPanelTitleLabel.setFont(titleFont);
        loadingSetPanelTitleLabel.setForeground(Color.RED);
        loadingSetPanelTitleLabel.setBounds(50 * UIUnitsType.LOCATION_UNIT_10, 2 * UIUnitsType.LOCATION_UNIT_10,
                28 * UIUnitsType.LOCATION_UNIT_10, 3 * UIUnitsType.LOCATION_UNIT_10);
        loadingSetPanelTitleLabel.setVisible(isLoadingPanel);
        return loadingSetPanelTitleLabel;
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
     * 更新强弹药库
     *
     * @return
     */
    @Bean
    public JLabel updateShotgunLevelLabel() {
        JLabel label = new JLabel(loadingSetPanelConfig.getUpdateShotgunLevelText());
        label.setFont(commonFont);
        label.setForeground(Color.WHITE);
        label.setBounds(12 * UIUnitsType.LOCATION_UNIT_10, 15 * UIUnitsType.LOCATION_UNIT_10,
                11 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        label.setVisible(isLoadingPanel);
        return label;
    }


    /**
     * 强弹药库追加更新
     *
     * @return
     */
    public JLabel shotgunAppendUpdateLabel() {

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


    /**
     * 前往装弹配置
     *
     * @return
     */
    @Bean
    public JLabel toLoadingLabel() {
        JLabel toLoadingLabel = new JLabel(commonConfig.getToLoadingText());
        toLoadingLabel.setFont(linkFont);
        toLoadingLabel.setForeground(Color.WHITE);
        toLoadingLabel.setBounds(90 * UIUnitsType.LOCATION_UNIT_10, 50 * UIUnitsType.LOCATION_UNIT_10,
                10 * UIUnitsType.LOCATION_UNIT_10, 3 * UIUnitsType.LOCATION_UNIT_10);
        toLoadingLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // 鼠标样式
        toLoadingLabel.addMouseListener(new LinkMouseAction(toLoadingLabel, commonConfig));
        return toLoadingLabel;
    }


    /**
     * 前往开火配置
     * 起初隐藏
     *
     * @return
     */
    @Bean
    public JLabel toFireLabel() {
        JLabel toFireLabel = new JLabel(commonConfig.getToFireLoadingText());
        toFireLabel.setFont(linkFont);
        toFireLabel.setForeground(Color.WHITE);
        toFireLabel.setBounds(100 * UIUnitsType.LOCATION_UNIT_10, 50 * UIUnitsType.LOCATION_UNIT_10,
                10 * UIUnitsType.LOCATION_UNIT_10, 3 * UIUnitsType.LOCATION_UNIT_10);
        toFireLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // 鼠标样式
        toFireLabel.addMouseListener(new LinkMouseAction(toFireLabel, commonConfig));
        return toFireLabel;
    }


}
