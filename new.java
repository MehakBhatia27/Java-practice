import java.awt.*;
public class new extends Frame{
    new(){
        Button b = new Button("Click Here");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        Button f1 = new Button();        
    }
}