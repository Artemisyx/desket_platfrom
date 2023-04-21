package tyut.selab.desktop.ui.tools.buttons.query;

import tyut.selab.desktop.ui.tools.jtextfield.IdText;
import tyut.selab.desktop.ui.tools.jtextfield.IdText;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * ClassName:Ensure
 * Package:tools.buttons.query
 * Description:
 *
 * @Author:14亿少女的梦-苏信玮
 * @Create:2023/04/18 - 16:31
 * @Version:v1.0
 */
public class Ensure extends JButton {
    public Ensure(){
        this.setText("确定");
        this.setFont(new Font("华文行楷",Font.BOLD,15));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO: 2023/04/19 传输用户id给DAO层
                System.out.println(IdText.id);
            }
        });
    }
}
