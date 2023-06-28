import javax.swing.*;
public class swing1{
    swing1(){
        JFrame f = new JFrame();

        JLabel name = new JLabel("Name: Mehak Bhatia");
        JLabel systemid = new JLabel("System Id : 2021351322");
        name.setBounds(10,20,200,10);
        systemid.setBounds(20,30,200,40);
        f.add(name);
        f.add(systemid);

        JButton b1 = new JButton("Click Here to continue");
        b1.setBounds(500,100,200,100);
        f.add(b1);
        JRadioButton J1 =  new JRadioButton("Male");
        JRadioButton J2 =  new JRadioButton("Female");
        J1.setBounds(400,200,100,200);
        J2.setBounds(700,200,100,200);
        ButtonGroup bg = new ButtonGroup();
        bg.add(J1);
        bg.add(J2);
        f.add(J1);
        f.add(J2);
        JTextArea JA = new JTextArea(200,200);
        JA.setBounds(400,400,500,100);
        f.add(JA);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);

    }
    
    public static void main(String args[]){
        swing1 s = new swing1();
    }
}