package tyut.selab.desktop.ui.tools.buttons.query;

import tyut.selab.desktop.ui.tools.utils.SwitchPanel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * ClassName:QueryById
 * Package:tools.buttons.query
 * Description:
 *
 * @Author:14亿少女的梦-苏信玮
 * @Create:2023/04/18 - 12:20
 * @Version:v1.0
 */
public class QueryById extends JButton {
    public QueryById(JPanel panel, JPanel switchPanel) {
        this.setText("查询个人");
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchPanel.switchPanel(panel, switchPanel);
            }
        });
    }
}

