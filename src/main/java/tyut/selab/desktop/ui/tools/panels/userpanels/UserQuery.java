package tyut.selab.desktop.ui.tools.panels.userpanels;

import tyut.selab.desktop.ui.tools.set.panelset.queryset.UserQuerySet;

import javax.swing.*;

/**
 * ClassName:UserQuerySet
 * Package:tools.panels.userpanels
 * Description:
 *
 * @Author:14亿少女的梦-苏信玮
 * @Create:2023/04/16 - 17:00
 * @Version:v1.0
 */
public class UserQuery {
    public static JScrollPane getQueryPanel() {
        return new UserQuerySet();
    }
}
