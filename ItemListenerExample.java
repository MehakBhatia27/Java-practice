import java.awt.*;
import java.awt.event.*;
public class ItemListenerExample extends Frame implements ItemListener{
    Checkbox checkbox1 , checkbox2 ;
    Label label ;
    ItemListenerExample(){
        Frame f = new Frame ("Item Listerner");
        label = new label ();
        label.setAlignment(label.CENTER);
        label.setSize(400,400);
        checkbox1 = new Checkbox ("C++");
        checkbox2 = new Checkbox ("Java");
        checkbox1.setBounds(50,60,70,80);
        checkbox2.setBounds(60,70,80,90);
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(label);
        checkbox1.addItemListerner(this);
        checkbox2.addItemListerner(this);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource == checkbox1){
            label.setText("C++ Checkbox :" + e.getStateChange() == 1 ? "Checked" : "Unchecked");
        }
        if(e.getSource == checkbox2){
            label.setText("Java Checkbox :" + e.getStateChange() == 1 ? "Checked" : "Unchecked");
        }
    }
    public static void main(String args[]){
        new ItemListenerExample();
    }
}