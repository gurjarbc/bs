import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Currancy{
    void converter(){
        JFrame frame = new JFrame("Currancy Convert");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        JTextField first  = new JTextField();
        first.setBounds(250,30,70,30);
        frame.add(first);
        JTextField second = new JTextField();
        second.setBounds(250,80,70,30);
        frame.add(second);
        JButton convert = new JButton("Convert");
        convert.setBounds(80,150,200,50);
        convert.setBackground(Color.YELLOW);
        convert.setForeground(Color.DARK_GRAY);
        frame.add(convert);
        String[] Type={"IND","USD","Euro","sol"};
        JComboBox combo = new JComboBox<>();
        JComboBox combo1 = new JComboBox<>();
        combo.setBackground(Color.CYAN);
        combo.setForeground(Color.BLUE);
        combo1.setBackground(Color.LIGHT_GRAY);
        combo1.setForeground(Color.RED);
        combo.setBounds(30,30,150,30);
        frame.add(combo);
        combo1.setBounds(30,80,150,30);
        frame.add(combo1);
        for(int i=0;i<Type.length;i++){
        combo.addItem(Type[i]);
        combo1.addItem(Type[i]);
        }
        ActionListener action = new   ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(combo.getSelectedIndex()==0){
                    if(combo1.getSelectedIndex()==0){
                        second.setText(first.getText());
                    }else if(combo1.getSelectedIndex()==1){
                        Double input=Double.parseDouble(first.getText());
                        input*=.012;
                        second.setText(Double.toString(input));

                    }else if(combo1.getSelectedIndex()==2){
                        Double input=Double.parseDouble(first.getText());
                        input*=.011;
                        second.setText(Double.toString(input));

                    }else if(combo1.getSelectedIndex()==3){
                        Double input=Double.parseDouble(first.getText());
                        input*=.047;
                        second.setText(Double.toString(input));

                    }
                }else  if(combo.getSelectedIndex()==1){
                    if(combo1.getSelectedIndex()==0){
                        Double input=Double.parseDouble(first.getText());
                        input*=81.51;
                        second.setText(Double.toString(input));
                    }else if(combo1.getSelectedIndex()==1){
                        second.setText(first.getText());
                    }else if(combo1.getSelectedIndex()==2){
                        Double input=Double.parseDouble(first.getText());
                        input*=.92;
                        second.setText(Double.toString(input));

                    }else if(combo1.getSelectedIndex()==3){
                        Double input=Double.parseDouble(first.getText());
                        input*=3.84;
                        second.setText(Double.toString(input));

                    }
                }else  if(combo.getSelectedIndex()==2){
                    if(combo1.getSelectedIndex()==0){
                        Double input=Double.parseDouble(first.getText());
                        input*=88.89;
                        second.setText(Double.toString(input));
                        


                    }else if(combo1.getSelectedIndex()==1){
                        Double input=Double.parseDouble(first.getText());
                        input*=1.09;
                        second.setText(Double.toString(input));

                    }else if(combo1.getSelectedIndex()==2){
                        second.setText(first.getText());
                    }else if(combo1.getSelectedIndex()==3){
                        Double input=Double.parseDouble(first.getText());
                        input*=4.18;
                        second.setText(Double.toString(input));

                    }
                }else  if(combo.getSelectedIndex()==3){
                    if(combo1.getSelectedIndex()==0){
                        Double input=Double.parseDouble(first.getText());
                        input*=21.26;
                        second.setText(Double.toString(input));
                    }else if(combo1.getSelectedIndex()==1){
                        Double input=Double.parseDouble(first.getText());
                        input*=.26;
                        second.setText(Double.toString(input));

                    }else if(combo1.getSelectedIndex()==2){
                        Double input=Double.parseDouble(first.getText());
                        input*=.24;
                        second.setText(Double.toString(input));

                    }else if(combo1.getSelectedIndex()==3){
                        second.setText(first.getText());  

                    }
                }

            }
        };convert.addActionListener(action);

    }
}
public class CurrancyConverter {
    public static void main(String[] args) {
        Currancy cu = new Currancy();
        cu.converter();
    }
}