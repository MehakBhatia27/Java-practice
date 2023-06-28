import javax.swing.*;
import java.awt.dimensions;

public class MainFrame extends JFrame{
    public void initialize(){
        setTitle("Welcome");
        setSize(500,600);
        label l1 = new label("Java Class");
        l1.setText("Advance Java");
        Firstname = new JTextField();
        Firstname.setFont("Mehak");
        LastName = new JTextField();
        LastName.setFont("Bhatia");

    }
    public static void main(String args[]){
        MainFrame myFrame = MainFrame();
        myFrame.initialize();
    }
}