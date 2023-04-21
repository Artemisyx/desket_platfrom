package tyut.selab.desktop.ui.tools.set.panelset.queryset;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName:QueryAllSet
 * Package:tools.set.panelset.queryset
 * Description:
 *
 * @Author:14亿少女的梦-苏信玮
 * @Create:2023/04/18 - 12:33
 * @Version:v1.0
 */
public class QueryAllSet extends JScrollPane {
    public QueryAllSet(){
        JTextArea jTextArea = new JTextArea(50, 20);
        // TODO: 2023/04/19 获取数据库中所有用户信息
        jTextArea.setText("Welcome");
        this.setViewportView(jTextArea);
        this.setBackground(Color.white);
    }
}
