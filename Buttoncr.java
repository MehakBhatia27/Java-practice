import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class Buttoncr extends Frame{
    static JLabel L;
    static Frame Fr;    
    public static void main(String args[]){

        Frame f = new Frame("Welcome");
        TextField t1,t2,t3 ;
        t1 = new TextField("Firstname");
        t1.setBounds(50,100,200,30);
        t2 = new TextField("Last name");
        t2.setBounds(50,150,200,30);
        t3 = new TextField("D.O.B");
        t3.setBounds(50,200,200,50);
 
        Label name = new Label("Name: Mehak Bhatia");
        Label systemid = new Label("System Id : 2021351322");
        name.setBounds(10,30,200,10);
        systemid.setBounds(10,30,200,40);
        f.add(name);
        f.add(systemid);
        

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        Button b = new Button("submit");
        f.add(b);
        b.setBounds(125,300,80,30);

        JRadioButton j1 = new JRadioButton("male",true);
        j1.setBounds(200,350,100,30);
        JRadioButton j2 = new JRadioButton("female",false);
        j2.setBounds(50,350,100,30);
        ButtonGroup bg  =  new ButtonGroup();
        bg.add(j1);
        bg.add(j2);
        f.add(j1);
        f.add(j2);

    }   
}
