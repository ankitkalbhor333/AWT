import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class handlingeventdemo extends Frame implements KeyListener{
    Label l1,l2,l3,l4,l5;
    handlingeventdemo(){
        super("Handling Event Demo");
        setLayout(new FlowLayout());
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label(" ");
        l4 = new Label(" ");
        l5 = new Label("");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        setLayout(null);
        l1.setBounds(30, 40, 100, 20);
        l2.setBounds(30, 60, 100, 20);
        l3.setBounds(30, 96, 100, 20);
        l4.setBounds(30, 150, 100, 20);
        l5.setBounds(30, 180, 100, 20);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){
     l1.setText("key is pressed");
    }
    public void keyReleased(KeyEvent e){
        l2.setText("key is released");
    }
    public void keyTyped(KeyEvent e){
        l3.setText("key is typed");

    }

    public static void main(String args[]){
        handlingeventdemo f = new handlingeventdemo();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
