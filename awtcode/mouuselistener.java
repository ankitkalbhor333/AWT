import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class mouuselistener extends Frame implements MouseListener,MouseMotionListener {
    Label l1,l2,l3,l4,l5,l6,l7;
    mouuselistener(){
        super("Handling MOUSE Event Demo");
        setLayout(new FlowLayout());
        l1 = new Label("");
        l2 = new Label("");
      
    
        add(l1);
        add(l2);
       
        
                setLayout(null);
        l1.setBounds(30, 40, 100, 20);
       

        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void	mouseClicked(MouseEvent e){
     l1.setText("mouse is clicked ");
    }
    public void mouseEntered(MouseEvent e){
        l1.setText("mouse is entered");
    }
    public void mouseExited(MouseEvent e){
        l1.setText("mouse is exited ");

    }
    public void mousePressed(MouseEvent e){
        l1.setText("mouse is pressed");
    }
    public void mouseReleased(MouseEvent e){
        l1.setText("mouse is released");
    }
 
    public void mouseDragged(MouseEvent e){
        l1.setText("mouse is dragged");
    }
    public void mouseMoved(MouseEvent e){
        l1.setText("mouse is moved");
        l2.setText("("+e.getX()+","+e.getY()+")");
    }


    public static void main(String args[]){
        mouuselistener f = new mouuselistener();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
