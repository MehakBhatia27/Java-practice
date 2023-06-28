import javax.swing.*;
public class swing2{
    swing2(){
        JFrame f = new JFrame();
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
        f.setLayout(new BorderLayout());
        f.add(b1,"North");
        f.setVisible(true);

    }
    
    public static void main(String args[]){
        swing2 s = new swing2();
    }
}