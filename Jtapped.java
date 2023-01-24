import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.GenericDeclaration;

public class Jtapped {
  static void Jtap(){
    JFrame frame =new JFrame("CCTNS");
    frame.setSize(400, 400);
    
      JButton bt1=new JButton("Welcome"); 
      
        JPanel jp1=new JPanel();  
        jp1.add(bt1); 
        JButton bt2=new JButton("Bhagchand"); 
        JPanel jp2=new JPanel();
        jp2.add(bt2);
        JButton bt3=new JButton("Gurjar");  
        JPanel jp3=new JPanel();  
        jp3.add(bt3);
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(50,50,800,500);  
        tp.add("FIRST",jp1);  
        tp.add("SECOND",jp2);  
        tp.add("THIRD",jp3);    
        frame.add(tp);  
        
        frame.setLayout(null);  
        frame.setVisible(true);  
  }
    
    public static void main(String[]args) {
Jtapped jt=new Jtapped();
jt.Jtap();

}  
    }
