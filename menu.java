import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.MenuItem;
import java.out.event.*;
import java.awt.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
public class menu implements ActionListen{
    menu(){
        JFrame f = new JFrame();

        JButton b1 = new JButton("Click Here to continue");
        b1.setBounds(500,500,200,100);
        f.add(b1);
        JButton b2 = new JButton(" ");
        b2.setBounds(100,200,200,100);
        f.add(b2);
        JRadioButton J1 =  new JRadioButton("Male");
        JRadioButton J2 =  new JRadioButton("Female");
        J1.setBounds(500,100,100,200);
        J2.setBounds(700,100,100,200);
        ButtonGroup bg = new ButtonGroup();
        bg.add(J1);
        bg.add(J2);
        f.add(J1);
        f.add(J2);
        Label Gender = new Label("Gender");
        Gender.setBounds(400,150,100,100);
        f.add(Gender);
        JTextArea JA = new JTextArea(200,200);
        JA.setBounds(400,300,500,100);
        f.add(JA);
        f.setSize(1000,1000);
        f.setLayout(new BorderLayout());
        f.add(b2,"North");
        f.setVisible(true);

    }
   public static void main(String args[]){
        menu s = new menu();
    }
}