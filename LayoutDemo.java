

import java.awt.*;
import java.awt.event.*;



        

public class LayoutDemo   extends Frame implements ItemListener
{
    Button b1,b2,b3;
    
    TextField t1,t2,t3;
    
    Panel p1;
    Panel p2;
    Panel cp;
    
    Panel mainp;
    
    Checkbox c1,c2;
    
    CardLayout cl;
    
    public LayoutDemo()
    {
        super("LayoutDemo Demo");
        
        CheckboxGroup cg=new CheckboxGroup();
        
        
        c1=new Checkbox("One",false,cg);
        c2=new Checkbox("Two",false,cg);
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        
        
        
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        
        cp=new Panel();
        cp.add(c1);
        cp.add(c2);
        
        p1=new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        
        p2=new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);
 
        mainp=new Panel();
        cl=new CardLayout();
        mainp.setLayout(cl);
        
        mainp.add("One",p1);
        mainp.add("Two",p2);
        
        add(cp,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);
        
        
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        if(c1.getState())
            cl.first(mainp);
        else
            cl.last(mainp);
            
    }
    public static void main(String[] args) 
    {
        LayoutDemo f=new LayoutDemo();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}