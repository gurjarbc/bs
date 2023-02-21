// package Swing_Awt_ui_ux;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calcul{
    float total=0,last=0;
    static String tot="";
    static JTextField ta;
    static JTextField ta1;
    void calculater(){
        
        JFrame frame = new JFrame("CALCULATOR");
        
        
        frame.setSize(310,445);
        frame.setLayout(null);
        ta = new JTextField();
        ta.setBounds(0,0,300,50);
        frame.add(ta);
        ta1 = new JTextField();
        ta1.setBounds(0,50,300,50);
        frame.add(ta1);
        
       
        frame.getContentPane().setBackground(Color.pink);
        JPanel jp1 = new JPanel(new GridLayout(4,4));
        frame.add(jp1);
        jp1.setBounds(0,105,295,300);
        JButton bt = new JButton("1");
        JButton bt1 = new JButton("2");
        JButton bt2 = new JButton("3");
        JButton bt3 = new JButton("+");
        JButton bt4 = new JButton("4");
        JButton bt5 = new JButton("5");
        JButton bt6 = new JButton("6");
        JButton bt7 = new JButton("-");
        JButton bt8 = new JButton("7");
        JButton bt9 = new JButton("8");
        JButton bt10 = new JButton("9");
        JButton bt11 = new JButton("*");
        JButton bt12 = new JButton("=");
        JButton bt13 = new JButton(".");
        JButton bt14 = new JButton("0");
        JButton bt15 = new JButton("/");

        jp1.add(bt);
        jp1.add(bt1);
        jp1.add(bt2);
        jp1.add(bt3);
        jp1.add(bt4);
        jp1.add(bt5);
        jp1.add(bt6);
        jp1.add(bt7);
        jp1.add(bt8);
        jp1.add(bt9);
        jp1.add(bt10);
        jp1.add(bt11);
        jp1.add(bt12);
        jp1.add(bt13);
        jp1.add(bt14);
        jp1.add(bt15);
       
        frame.setVisible(true);
        System.out.println();
        
        ActionListener butt = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                tot+="1";
                ta.setText(ta.getText()+"1"); 
            }
        };bt.addActionListener(butt);
        ActionListener butt1 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                tot+="2";
                ta.setText(ta.getText()+"2");
            }
        };bt1.addActionListener(butt1);
        ActionListener butt2 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                tot+="3";
                ta.setText(ta.getText()+"3");
            }
        };bt2.addActionListener(butt2);
        ActionListener butt3 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta.getText().length()>0){
                char check=ta.getText().charAt(ta.getText().length()-1);
                
                if(check=='+'||check=='-'||check=='*'||check=='/'){
                    ta.setText(String.valueOf(last)+"+");
                }else{
                if(ta.getText().contains("+")){
                    total=Float.valueOf(tot);
                    last+=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"+");


                }else if(ta.getText().contains("-")){
                    total=Float.valueOf(tot);
                    last-=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"+");
                }else if(ta.getText().contains("*")){
                    total=Float.valueOf(tot);
                    last*=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"+");
                }else if(ta.getText().contains("/")){
                    total=Float.valueOf(tot);
                    last/=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"+");
                }else{
                    last=Float.valueOf(ta.getText());
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"+");
                }
            }

            }else{
                ta.setText("+");
            }
                
            }
        };
        bt3.addActionListener(butt3);
        ActionListener butt4 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                tot+="4";
                ta.setText(ta.getText()+"4");
            }};bt4.addActionListener(butt4);
        ActionListener butt5 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                tot+="5";
                ta.setText(ta.getText()+"5");
            }
        };bt5.addActionListener(butt5);
        ActionListener butt6 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                tot+="6";
                ta.setText(ta.getText()+"6");
            }
        };bt6.addActionListener(butt6);
        ActionListener butt7 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta.getText().length()>0){
                    char check=ta.getText().charAt(ta.getText().length()-1);
                    
                    if(check=='+'||check=='-'||check=='*'||check=='/'){
                        ta.setText(String.valueOf(last)+"-");
                    }else{
                if(ta.getText().contains("+")){
                    total=Float.valueOf(tot);
                    last+=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"-");


                }else if(ta.getText().contains("-")){
                    total=Float.valueOf(tot);
                    last-=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"-");
                }else if(ta.getText().contains("*")){
                    total=Float.valueOf(tot);
                    last*=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"-");
                }else if(ta.getText().contains("/")){
                    total=Float.valueOf(tot);
                    last/=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"-");
                }else{
                    last=Float.valueOf(ta.getText());
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"-");
                }
            }
        }else{
            ta.setText(String.valueOf(last)+"-");
        }
    }
        };
        bt7.addActionListener(butt7);
        ActionListener butt8 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                tot+="7";
                ta.setText(ta.getText()+"7");
            }};bt8.addActionListener(butt8);
        ActionListener butt9 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                tot+="8";
                ta.setText(ta.getText()+"8");
            }
        };bt9.addActionListener(butt9);
        ActionListener butt10 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                tot+="9";
                ta.setText(ta.getText()+"9");
            }
        };bt10.addActionListener(butt10);
        ActionListener butt11 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta.getText().length()>0){
                    char check=ta.getText().charAt(ta.getText().length()-1);
                    
                    if(check=='+'||check=='-'||check=='*'||check=='/'){
                        ta.setText(String.valueOf(last)+"*");
                    }else{
                
                if(ta.getText().contains("+")){
                    total=Float.valueOf(tot);
                    last+=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"*");
                }else if(ta.getText().contains("*")){
                    total=Float.valueOf(tot);
                    last*=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"*");
                }else if(ta.getText().contains("/")){
                    total=Float.valueOf(tot);
                    last/=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"*");
                }else if(ta.getText().contains("-")){
                    total=Float.valueOf(tot);
                    last-=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"*");
                }else{
                    last=Float.valueOf(ta.getText());
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"*");
                }
            }
        }else{
            ta.setText(String.valueOf(last)+"*");
        }
            }
        };
        bt11.addActionListener(butt11);
        ActionListener butt12 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta.getText().length()>0){
                    char check=ta.getText().charAt(ta.getText().length()-1);
                    
                    if(check=='+'||check=='-'||check=='*'||check=='/'){
                        ta1.setText(String.valueOf(last));
                    }else if(!tot.equals("")){
                        float equl=Float.valueOf(tot);
                if(equl>=0){
                if(ta.getText().contains("+")){
                    total=Float.valueOf(tot);
                    last+=total;
                    ta1.setText(String.valueOf(last));
                    ta.setText(String.valueOf(last));
                    total=0;
                    tot="";
                    last=0;


                }else if(ta.getText().contains("-")){
                    total=Float.valueOf(tot);
                    last-=total;
                    ta1.setText(String.valueOf(last));
                    ta.setText(String.valueOf(last));
                    total=0;
                    tot="";
                    last=0;
                }else if(ta.getText().contains("*")){
                    total=Float.valueOf(tot);
                    last*=total;
                    ta1.setText(String.valueOf(last));
                    ta.setText(String.valueOf(last));
                    total=0;
                    tot="";
                    last=0;
                }else if(ta.getText().contains("/")){
                    if(Float.valueOf(tot)==0){
                        ta1.setText("");
                        ta.setText("");
                    }else{
                    total=Float.valueOf(tot);
                    last/=total;
                    ta1.setText(String.valueOf(last));
                    ta.setText(String.valueOf(last));
                    total=0;
                    tot="";
                    last=0;
                    }
                }else{
                    total=Float.valueOf(tot);
                    last+=total;
                    ta1.setText(String.valueOf(last));
                    ta.setText(String.valueOf(last));
                    total=0;
                    tot="";
                    last=0;
                }
            }
        }
            }else{
                ta1.setText(String.valueOf(last));
                ta.setText(String.valueOf(last));
            }
            }};bt12.addActionListener(butt12);
        ActionListener butt13 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tot.contains(".")){

                }else if(!tot.equals("")){
                    tot=tot+".";
                    ta.setText(ta.getText()+".");
                }else{
                    tot=tot+"0.";
                    ta.setText(ta.getText()+"0.");   
                }
            }
        };bt13.addActionListener(butt13);
        ActionListener butt14 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tot.equals("0")){

                }else{
                tot=tot+"0";
                ta.setText(ta.getText()+"0");
                }
            }
        };bt14.addActionListener(butt14);
        ActionListener butt15 = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta.getText().length()>0){
                    char check=ta.getText().charAt(ta.getText().length()-1);
                    
                    if(check=='+'||check=='-'||check=='*'||check=='/'){
                        ta.setText(String.valueOf(last)+"/");
                    }else{
                if(Float.valueOf(tot)==0){
                    ta.setText("");
                 }
                else if(ta.getText().contains("+")){
                    total=Float.valueOf(tot);
                    last+=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"/");
                }else if(ta.getText().contains("*")){
                    total=Float.valueOf(tot);
                    last*=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"/");
                }else if(ta.getText().contains("/")){
                    total=Float.valueOf(tot);
                    last/=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"/");
                }else if(ta.getText().contains("-")){
                    total=Float.valueOf(tot);
                    last-=total;
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"/");
                }else{
                    last=Float.valueOf(ta.getText());
                    total=0;
                    tot="";
                    ta.setText(String.valueOf(last)+"/");
                }
            }
        }else{
            ta.setText(String.valueOf(last)+"/");
        }
            }
        };
        bt15.addActionListener(butt15);



    }
}
public class Calculater {
    public static void main(String[] args) {
        Calcul cl = new Calcul();
        cl.calculater();
    }
}