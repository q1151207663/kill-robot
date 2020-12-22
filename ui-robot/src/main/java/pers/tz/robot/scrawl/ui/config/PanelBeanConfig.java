package pers.tz.robot.scrawl.ui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;

/**
 * @Author twz
 * @Date 2020-12-23
 * @Desc TODO
 */
@Configuration
public class PanelBeanConfig {

    @Bean
    public JPanel fireSetPanel() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBackground(Color.BLACK);
        return jPanel;
    }

}
