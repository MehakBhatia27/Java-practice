import java.awt.*;
import javax.swing.*;
public class button extends Frame{
    Jframe f = new Jframe ("Welcome");
    Jbutton b = new Jbutton("Click here");
    b.setBounds(50,55,60,70);
    f.add(b);
    Jlabel name = new Jlabel("Name - Mehak Bhatia");
    name.setbounds(10,20,30,40);
    f.add(name);
    JTextArea JA = new JTextArea (200,200);
    JA.setbounds(80,90,100,100);
    f.add(JA);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
}
public static void main(String[] args) {
    button N = new button();
}