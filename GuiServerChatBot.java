import java.util.*;   //  server
import javax.swing.*;                    //GUI COMPLETE KARNA HAI
import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;

class Read extends Thread{
    @Override
    public void run(){
        try {
            Scanner sc1 = new Scanner(GuiServerChatBot.s.getInputStream());
        while(true)
                { 
                    String data = sc1.nextLine();
                    GuiServerChatBot.msg.setText(data);
                    System.out.println(data);
                    if(data.equals("bye")){break;}
                }
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }
}

class Write extends Thread{
    @Override
    public void run(){
        try {
       // Scanner sc = new Scanner(System.in);
        PrintStream ps = new PrintStream(GuiServerChatBot.s.getOutputStream());
       
                    ActionListener click1 = new ActionListener(){
                        public void actionPerformed(ActionEvent ee){
                      //  String val = sc.nextLine();
                    String val = GuiServerChatBot.ta.getText();
                    GuiServerChatBot.msg1.setText(val);
                    System.out.println(val);
                    ps.println(val);
                    }};
                    GuiServerChatBot.send.addActionListener(click1);                  
                
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }
}

public class GuiServerChatBot extends Thread{
    static Socket s;
    static JTextArea ta;
    static JButton send;
    static JLabel msg;
    static JLabel msg1;
    static ServerSocket ss;

    public static void gui(){                  // Chatbot ka gui banana    
        JFrame fr = new JFrame("Chat Room Server");
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
            
            ss= new ServerSocket(5001);
            System.out.println(InetAddress.getLocalHost());
            System.out.println("server is running...");
                s = ss.accept();
                System.out.println("connected..."); 
                Write wr = new Write();
                Read re = new Read();
                gui();
                // while(true){
                    wr.start();
                    re.start();//}
               // s.close();
        } catch (Exception e) {            
        }
    }
}
 