package pers.tz.robot.scrawl.ui.action;

import pers.tz.robot.scrawl.ui.config.CommonConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Optional;

/**
 * @Author twz
 * @Date 2020-12-23
 * @Desc TODO
 */
public class LinkMouseAction extends MouseAdapter {

    private JLabel jLabel;
    private CommonConfig commonConfig;

    public LinkMouseAction(JLabel jLabel, CommonConfig commonConfig) {
        this.jLabel = jLabel;
        this.commonConfig = commonConfig;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jLabel.setForeground(Color.RED);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        jLabel.setForeground(Color.WHITE);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        String toWhere = Optional.ofNullable(jLabel.getText()).orElse("error");
        if (toWhere.equals(commonConfig.getToLoadingText())) {  // 去装弹界面
            System.out.println("loading");
            return;
        }


        jLabel.setForeground(Color.BLACK);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        jLabel.setForeground(Color.RED);
    }

}
