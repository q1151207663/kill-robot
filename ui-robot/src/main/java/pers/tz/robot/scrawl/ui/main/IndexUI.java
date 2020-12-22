package pers.tz.robot.scrawl.ui.main;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.tz.robot.scrawl.ui.config.CommonConfig;
import pers.tz.robot.scrawl.ui.config.IndexConfig;

import javax.swing.*;
import java.awt.*;

/**
 * @Author twz
 * @Date 2020-12-22
 * @Desc TODO
 */
@Component
@AllArgsConstructor
public class IndexUI extends JFrame {

    private IndexConfig indexConfig;
    private JPanel fireSetPanel;

    private JLabel fireSetPanelTitleLabel;
    private JLabel speedLabel;
    private JLabel numberLabel;
    private JLabel fireStrategyLabel;
    private JLabel inputStrategyLabel;
    private JLabel levelLabel;
    private JLabel advancePressEnterLabel;
    private JLabel lickDogLabel;
    private JLabel cloudFireLabel;

    private JComboBox<Integer> speedSelect;
    private JComboBox<Integer> numberSelect;
    private JComboBox<String> fireStrategySelect;
    private JComboBox<String> inputStrategySelect;
    private JComboBox<String> levelSelect;
    private JComboBox<String> advancePressEnterSelect;
    private JComboBox<String> lickDogSelect;
    private JComboBox<String> cloudFireSelect;

    private JButton fireBtn;

    public void init() {
        this.setTitle(indexConfig.getTitle());
        this.setResizable(indexConfig.getResizeAble());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(indexConfig.getIndexWidth(), indexConfig.getIndexHeight()); // 窗口大小
        this.setLocationRelativeTo(null); // 窗口居中
        this.setVisible(true);

        fireSetPanel.add(fireSetPanelTitleLabel); // 面板标题

        fireSetPanel.add(speedLabel); // 面板添加调节速度label
        fireSetPanel.add(numberLabel); // 调节数量label
        fireSetPanel.add(fireStrategyLabel); // 开火策略label
        fireSetPanel.add(inputStrategyLabel); // 输入策略label
        fireSetPanel.add(levelLabel); // 强度label
        fireSetPanel.add(advancePressEnterLabel); // 预按回车label
        fireSetPanel.add(lickDogLabel); // 舔狗模式label
        fireSetPanel.add(cloudFireLabel); // 云开火label

        fireSetPanel.add(speedSelect); // 速度select
        fireSetPanel.add(numberSelect); // 数量select
        fireSetPanel.add(fireStrategySelect); // 开火策略select
        fireSetPanel.add(inputStrategySelect); // 输入策略select
        fireSetPanel.add(levelSelect); // 输入策略select
        fireSetPanel.add(lickDogSelect); // 输入策略select
        fireSetPanel.add(advancePressEnterSelect); // 舔狗模式select
        fireSetPanel.add(cloudFireSelect); // 云开火select

        fireSetPanel.add(fireBtn); // 开火按钮

        this.setContentPane(fireSetPanel); // 开火设置面板
    }

}
