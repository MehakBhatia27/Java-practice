import javax.swing.*;
import java.awt.*;
class MenuExample{
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5, i6;
    MenuExample(){
        JFrame f = new JFrame("Menu Example");

        JLabel name = new JLabel("Name: Mehak Bhatia");
        JLabel systemid = new JLabel("System Id : 2021351322");
        name.setBounds(300,300,200,10);
        systemid.setBounds(300,300,200,40);
        f.add(name);
        f.add(systemid);

        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("Item 1"); \
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        i6 = new JMenuItem("Item 6");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menu.add(submenu);
        submenu.add(i6);
        mb.add(menu);
        f.setJMenuBar(mb);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        MenuExample me = new MenuExample();
    }
} 