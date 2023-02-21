import javax.swing.*;
import java.util.*;   // chat box client
import java.net.*;
import java.io.*;                                       //GUI COMPLETE KARNA HAI
import java.awt.*;
import java.awt.event.*;
 
class Read1 extends Thread{
    @Override
    public void run(){
        try {
            Scanner sc1 = new Scanner(GuiClientChatBot.r.getInputStream());
        while(true)
                {
                    String data = sc1.nextLine();
                    System.out.println(data);
                    GuiClientChatBot.msg.setText(data);
                    if(data.equals("bye")){break;}
                }
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }
} 

class Write1 extends Thread{
    @Override
    public void run(){
        try {
       // Scanner sc = new Scanner(System.in);
        PrintStream ps = new PrintStream(GuiClientChatBot.r.getOutputStream());
        
                    ActionListener click = new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                      // String val = sc.nextLine();
                    String val = GuiClientChatBot.ta.getText();
                    GuiClientChatBot.msg1.setText(val);
                    System.out.println(val);
                    ps.println(val);
                    }};
                    GuiClientChatBot.send.addActionListener(click);                    
                
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }
}
 
public class GuiClientChatBot extends Thread{
    static Socket r;
    static JTextArea ta;
    static JButton send;
    static JLabel msg;
    static JLabel msg1;

    public static void gui(){                  // Chatbot ka gui banana     GUI STARTED FROM HERE
        JFrame fr = new JFrame("Chat Room Client");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        ta = new JTextArea();
        send = new JButton("SEND");
        msg = new JLabel();
        msg1 = new JLabel();

        fr.setSize(510, 600);
        fr.setLayout(null);
        p1.setLayout(new GridLayout(13,1));
        p2.setLayout(new GridLayout(13,1));

        ta.setBounds(10,500,370,40);
        p1.setBounds(0,100,240,390);
        p1.setBackground(Color.lightGray);
        p2.setBounds(250,100,240,390);
        p2.setBackground(Color.LIGHT_GRAY);
        send.setBounds(380,500,110,40);

        fr.add(ta);
        
        fr.add(send);
        p1.add(msg);
        p2.add(msg1);
        fr.add(p1);
        fr.add(p2);
       
        fr.setVisible(true);        
    }

    public static void main(String[] args) {
        
        try {
            r= new Socket("10.68.98.139",5001);
            System.out.println("connected to server");
                Write1 wr = new Write1();
                Read1 re = new Read1();
                gui();
                // while(true){
                    wr.start();
                    re.start();//}
                // r.close();
        } catch (Exception e) {            
        }
    }
}
 