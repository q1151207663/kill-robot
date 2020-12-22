package pers.tz.robot.scrawl.ui.config;

import lombok.AllArgsConstructor;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
public class BtnBeanConfig {

    private FireSetPanelConfig fireSetPanelConfig;
    private Font btnFont;

    @Bean
    public JButton fireBtn() {
        JButton fireBtn = new JButton(fireSetPanelConfig.getFireBtn());
        fireBtn.setBounds(35 * UIUnitsType.LOCATION_UNIT_10, 40 * UIUnitsType.LOCATION_UNIT_10,
                35 * UIUnitsType.LOCATION_UNIT_10, 10 * UIUnitsType.LOCATION_UNIT_10);
        fireBtn.setFont(btnFont);
        fireBtn.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        fireBtn.setForeground(Color.BLACK);

//        fireBtn.addActionListener(e -> {}); // 按钮事件 TODO
        return fireBtn;
    }

}
