package tyut.selab.desktop.ui.tools.set.panelset.queryset;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:UserQuerySet
 * Package:tools.set.panelset.queryset
 * Description:
 *
 * @Author:14亿少女的梦-苏信玮
 * @Create:2023/04/17 - 9:28
 * @Version:v1.0
 */
public class UserQuerySet extends JScrollPane {
    public UserQuerySet() {
        JTextArea jTextArea = new JTextArea(50, 20);
        // TODO: 2023/04/19 根据用户信息获取数据库中对应的数据
        jTextArea.setText("Welcome");
        this.setViewportView(jTextArea);
        this.setBackground(Color.white);
    }
}
