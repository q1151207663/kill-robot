package pers.tz.robot.scrawl.ui.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.tz.robot.scrawl.ui.constants.UIUnitsType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @Author twz
 * @Date 2020-12-23
 * @Desc 下拉框bean
 */
@Configuration
public class ComboBoxBeanConfig {

    @Autowired
    private Font commonFont;

    /**
     * 开火速度下拉框
     *
     * @return
     */
    @Bean
    public JComboBox<Integer> speedSelect() {
        JComboBox<Integer> speedSelect = new JComboBox<>();
        speedSelect.addItem(100);
        speedSelect.addItem(50);
        speedSelect.addItem(20);
        speedSelect.addItem(1);
        speedSelect.setFont(commonFont);
        speedSelect.setEditable(true);
        speedSelect.setBounds(24 * UIUnitsType.LOCATION_UNIT_10, 15 * UIUnitsType.LOCATION_UNIT_10,
                20 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return speedSelect;
    }


    /**
     * 调节数量select框
     *
     * @return
     */
    @Bean
    public JComboBox<Integer> numberSelect() {
        JComboBox<Integer> numberSelect = new JComboBox<>();
        numberSelect.addItem(100);
        numberSelect.addItem(1000);
        numberSelect.addItem(2000);
        numberSelect.addItem(5000);
        numberSelect.addItem(10000);
        numberSelect.setFont(commonFont);
        numberSelect.setEditable(true);
        numberSelect.setBounds(84 * UIUnitsType.LOCATION_UNIT_10, 15 * UIUnitsType.LOCATION_UNIT_10,
                20 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return numberSelect;
    }


    /**
     * 开火策略select框
     *
     * @return
     */
    @Bean
    public JComboBox<String> fireStrategySelect() {
        JComboBox<String> fireStrategySelect= new JComboBox<>();
        fireStrategySelect.addItem("随机开火");
        fireStrategySelect.addItem("顺序开火");
        fireStrategySelect.setFont(commonFont);
        fireStrategySelect.setEditable(false);
        fireStrategySelect.setBounds(24 * UIUnitsType.LOCATION_UNIT_10, 20 * UIUnitsType.LOCATION_UNIT_10,
                20 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return fireStrategySelect;
    }


    /**
     * 输入策略select框
     *
     * @return
     */
    @Bean
    public JComboBox<String> inputStrategySelect() {
        JComboBox<String> inputStrategySelect = new JComboBox<>();
        inputStrategySelect.addItem("五笔输入");
        inputStrategySelect.addItem("拼音输入");
        inputStrategySelect.addItem("English");
        inputStrategySelect.setFont(commonFont);
        inputStrategySelect.setEditable(false);
        inputStrategySelect.setBounds(84 * UIUnitsType.LOCATION_UNIT_10, 20 * UIUnitsType.LOCATION_UNIT_10,
                20 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return inputStrategySelect;
    }

    /**
     * 开火策略select框
     *
     * @return
     */
    @Bean
    public JComboBox<String> levelSelect() {
        JComboBox<String> levelSelect= new JComboBox<>();
        levelSelect.addItem("强");
        levelSelect.addItem("一般");
        levelSelect.setFont(commonFont);
        levelSelect.setEditable(false);
        levelSelect.setBounds(24 * UIUnitsType.LOCATION_UNIT_10, 25 * UIUnitsType.LOCATION_UNIT_10,
                20 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return levelSelect;
    }


    /**
     * 预按回车select框
     *
     * @return
     */
    @Bean
    public JComboBox<String> advancePressEnterSelect() {
        JComboBox<String> advancePressEnterSelect= new JComboBox<>();
        advancePressEnterSelect.addItem("否");
        advancePressEnterSelect.addItem("是");
        advancePressEnterSelect.setFont(commonFont);
        advancePressEnterSelect.setEditable(false);
        advancePressEnterSelect.setBounds(84 * UIUnitsType.LOCATION_UNIT_10, 25 * UIUnitsType.LOCATION_UNIT_10,
                20 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return advancePressEnterSelect;
    }


    /**
     * 舔狗模式select框
     *
     * @return
     */
    @Bean
    public JComboBox<String> lickDogSelect() {
        JComboBox<String> lickDogSelect= new JComboBox<>();
        lickDogSelect.addItem("关闭");
        lickDogSelect.addItem("开启");
        lickDogSelect.setFont(commonFont);
        lickDogSelect.setEditable(false);
        lickDogSelect.setBounds(24 * UIUnitsType.LOCATION_UNIT_10, 30 * UIUnitsType.LOCATION_UNIT_10,
                20 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return lickDogSelect;
    }

    /**
     * 预按回车select框
     *
     * @return
     */
    @Bean
    public JComboBox<String> cloudFireSelect() {
        JComboBox<String> cloudFireSelect= new JComboBox<>();
        cloudFireSelect.addItem("关闭");
        cloudFireSelect.addItem("开启");
        cloudFireSelect.setFont(commonFont);
        cloudFireSelect.setEditable(false);
        cloudFireSelect.setBounds(84 * UIUnitsType.LOCATION_UNIT_10, 30 * UIUnitsType.LOCATION_UNIT_10,
                20 * UIUnitsType.LOCATION_UNIT_10, 4 * UIUnitsType.LOCATION_UNIT_10);
        return cloudFireSelect;
    }

}
