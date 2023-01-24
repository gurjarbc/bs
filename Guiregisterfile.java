import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Guiregisterfile {
    public void register(){
        JFrame frame =new JFrame("Register");
        frame.setSize(700,600 );
        JLabel name=new JLabel("Email");
        JTextField tf=new JTextField(20);
        JLabel pass =new JLabel("Password");
        JLabel result = new JLabel();
        JPasswordField pf=new JPasswordField(20);
        JButton bt1=new JButton("submit");
        name.setBounds(100, 100, 100, 20);
        frame.add(name);
        tf.setBounds(100, 100, 200, 20);
        frame.add(tf);
        pass.setBounds(100,130 , 100, 20);
        frame.add(pass);
        pf.setBounds(100, 130, 200, 20); 
        frame.add(pf);
        bt1.setBounds(180, 170, 100, 30);
        frame.add(bt1);
        result.setBounds(100, 200, 700, 30);
        frame.add(result);
        frame.setVisible(true);
        ActionListener click =new ActionListener(){
        public void actionPerformed(ActionEvent e){
           String mail =tf.getText();
           String psw =pf.getText();
           try {
            File obj =new File("datasavefile.text");
            if(obj.createNewFile()){System.out.println("file created");}
            FileWriter wr=new FileWriter("datasavefile.text",true);
            Scanner sc1=new Scanner(obj);
            int flag=0;
            while(sc1.hasNext()){
                String st=sc1.nextLine();
                if(st.equals("Email"+mail)){
                    result.setText("Email is already eexit");
                    flag=1; break;
                }
            }
           sc1.close();
           if(flag==0){wr.write("Email"+mail+"\n");
           wr.write("password"+psw+"\n");
           wr.close();
           result.setText("registed succesfully");
           tf.setText("");
           pf.setText("");
        }
            
           } catch (Exception ee) {
           
           }  }
        };
    }
    
    public static void main(String[]args) {

Guiregisterfile obj2 =new Guiregisterfile();
obj2.register();


    }
}