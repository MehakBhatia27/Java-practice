import java.awt.*;
import javax.swing.JLabel;
public class buttoncreation extends Frame{
    buttoncreation(){
        Button b = new Button("Click Here");
        b.setBounds(10,200,70,60);
        add(b);
        Label name = new Label("Name: Mehak Bhatia");
        Label systemid = new Label("System Id : 2021351322");
        name.setBounds(10,30,200,10);
        systemid.setBounds(10,40,200,30);
        add(name);
        add(systemid);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        
    }
    public static void main(String args[]){
        buttoncreation f1 = new buttoncreation();        
    }
} 