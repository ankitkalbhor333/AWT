import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class windowlistener extends Frame implements WindowListener {
    Label l1,l2;
    windowlistener(){
        super("Handling window Event Demo");
        setLayout(new FlowLayout());
        l1 = new Label("");
        l2 = new Label("");
      
    
        add(l1);
        add(l2);
       
        
                
        

        addWindowListener(this);
    }
    public void windowActivated(WindowEvent e){
     l1.setText("window is activated  ");
    }
    public void windowClosing(WindowEvent e) {
        l1.setText("window is closing ");
    }
    public void windowClosed(WindowEvent e){
        l1.setText("window is closed ");

    }
    public void windowDeactivated(WindowEvent e){
        l1.setText("window is deactivated");
    }
    public void windowDeiconified(WindowEvent e){
        l1.setText("window is deiconified ");
    }
 
    public void 
    windowIconified(WindowEvent e){
        l1.setText(" window is iconified");
    }
    public void windowOpened(WindowEvent e){
        l1.setText("window is opened ");
        
    }


    public static void main(String args[]){
        windowlistener f = new  windowlistener();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
