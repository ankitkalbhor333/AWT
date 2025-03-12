import java.awt .*;
import java.awt.event .*;

class Myframe extends Frame {
    Button B1,B2,B3,B4,B5,B6;
    public Myframe(){
        super("gridlayout  demo ");
        setLayout(new GridLayout(4,2));
        B1=new Button("Button 1"); 
        B2=new Button("Button 2");
        B3=new Button("Button 3");
        B4= new Button("Button 4");
        B5= new Button("Button 5");
        B6= new Button("Button 6");
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(B6);
        add(new Button("Button 7"));
    }
}
 public class gridlayout{
    public static void main(String args[]){
        Myframe f = new Myframe();
        f.setSize(400,400);
        f.setVisible(true);
        // f.addWindowListener(new WindowAdapter(){
        //     public void windowClosing(WindowEvent e){
        //         System.exit(0);
        //     }
        // });
    }

}