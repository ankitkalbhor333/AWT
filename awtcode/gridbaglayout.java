import java.awt .*;
import java.awt.event .*;

class Myframe extends Frame {
    Button B1,B2,B3,B4,B5,B6;
    public Myframe(){
        super("gridbaglayout  demo ");
        GridBagLayout gbl=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        setLayout(gbl);
        
        B1=new Button(" Button 1"); 
        B2=new Button("Button 2");
        B3=new Button("Button 3");
        B4= new Button("Button 4");
        B5= new Button("Button 5");
        B6= new Button("Button 6");
        gbc.gridx=1;
        gbc.gridy=2;
        add(B1,gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        add(B2,gbc);
        gbc.gridx=3;
        gbc.gridy=1;
        add(B3,gbc);
        gbc.gridx=3;
        gbc.gridy=3;
        add(B4,gbc);
        gbc.gridx=4;
        gbc.gridy=2;
        add(B5,gbc);
        gbc.gridx=5;
        gbc.gridy=1;
        add(B6,gbc);
        
    }
}
 public class gridbaglayout{
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