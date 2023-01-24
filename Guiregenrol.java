import javax.swing.*;
import javax.swing.plaf.BorderUIResource;

import org.json.simple.JSONObject;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Guiregenrol {
    public void registerform(){
        JFrame frame =new JFrame("REGISTER");
        frame.setSize(200,320 );
        frame.setLayout(null);
       
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(6,3));
        p1.setBounds(10, 50, 210, 150);
    
        JLabel head=new JLabel("ENROLMENT FORM");
        head.setBounds(70, 10, 180, 30);
        frame.add(head);
        JLabel name =new JLabel("NAME  :");
        JLabel hq = new JLabel("HQ NAME :");
        JLabel rank =new JLabel("RANK :");
        JLabel office = new JLabel("OFFICE :");
        JLabel mob =new JLabel("MOBILE NO :");
        JLabel email = new JLabel("EMAIL :");
        JTextField j1=new JTextField();
        JTextField j2=new JTextField();
        JTextField j3=new JTextField();
        JTextField j4=new JTextField();
        JTextField j5=new JTextField();
        JTextField j6=new JTextField();
        
        p1.add(name);
        p1.add(j1);
        p1.add(hq);
        p1.add(j2);
        p1.add(rank);
        p1.add(j3);
        p1.add(office);
        p1.add(j4);
        p1.add(mob);
        p1.add(j5);
        p1.add(email);
        p1.add(j6);
        frame.add(p1);
       
        JButton sub1=new JButton("SUBMIT");
        sub1.setBounds(60, 230, 130, 20);
          frame.add(sub1);
          frame.setVisible(true);
         
        ActionListener click =new ActionListener(){
        public void actionPerformed(ActionEvent e){ 
           try {
            String nam =j1.getText();
            String hqq =j2.getText();
            String rk =j3.getText();
            String off =j4.getText();
            String mb =j5.getText();
            String em =j6.getText();
            File obj =new File("Enrol.json");
            Scanner scn=new Scanner(obj);
            String st=""; int flag=0;
            while (scn.hasNext()){st += scn.nextLine();}
            StringBuilder sbr=new StringBuilder(st);
            for(int i=0;i<sbr.length();i++){
                if(sbr.charAt(i)=='}'){flag++;}}
                String ne="\":{\""+((flag/2)+1)+"\":{\"name\":\":\""+nam+"\",\"hq\":\":\""+hqq+"\",\"rank\":\":\""+rk+"\",\"office\":\":\""+off+"\",\"mob\":\""+mb+"\",\"email\":\":\""+em+"\"}}";
               sbr.insert(st.length()-1,ne);
            FileWriter wtr =new FileWriter("Enrol.json",true);
            wtr.write(""+sbr);
            wtr.close();
            
                }
           catch (Exception ee) {
           }  
        }};
       sub1.addActionListener(click); 
        
    }
    public static void main(String[]args) {

        Guiregenrol obj2 =new Guiregenrol();
        obj2.registerform();
    }
}