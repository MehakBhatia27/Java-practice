import java.awt.*;
public class form{
    public static void main (Sring args[]){
        
        Label name = new Label("Name: Mehak Bhatia");
        Label systemid = new Label("System Id : 2021351322");
        name.setBounds(10,30,200,10);
        systemid.setBounds(10,30,200,40);
        f.add(name);
        f.add(systemid);
        Frame f = new Frame("Welcome");
        TextField t1,t2,t3 ;
        t1 = new TextField("Firstname");
        t1.setBounds(50,100,200,30);
        t2 = new TextField("Last name");
        t2.setBounds(50,150,200,30);
        t3 = new TextField("D.O.B");
        t3.setBounds(50,200,200,150);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}