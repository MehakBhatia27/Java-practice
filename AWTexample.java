import java.awt.*;
import javax.swing.JLabel;
public class AWTexample extends Frame{
    AWTexample(){
        Button b = new Button ("Click Here");
        b.setBounds(30,100,80,30);
        add (b);
        Label name = new Label("KRITIKA AGGARWAL, 2021316854");
        name.setBounds(20, 30, 200, 20);
        add (name);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }
    public static void main (String args[]){
        AWTexample f1 = new AWTexample();
    }
}