import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.lang.reflect.GenericDeclaration;

public class GridLayoutin {
    public static void main(String[]args) {
        JFrame frame=new JFrame("gurjar");
      
        JButton ab=new JButton("Button 1");
        JButton ab1=new JButton("Button 2");
        JButton ab2=new JButton("Button 3");
        JButton ab3=new JButton("Button 4");
        frame.setLayout(new GridLayout(0,4));
       

     frame.add(ab);
     frame.add(ab1);
     frame.add(ab2);
     frame.add(ab3);
      


        frame.setSize(1400,400);
        
            frame.setVisible(true);
    
    
    }
}