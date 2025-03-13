import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class adapterdemo  extends Frame{
     adapterdemo(){
        super("adapter for window closing");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(  WindowEvent we){
                System.exit(0);
            }
        });
    }

        public static void main(String [] args )
{
    adapterdemo ad=new adapterdemo();
    ad.setVisible(true);
    ad.setSize(600,600);

}     
}
