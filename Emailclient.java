import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Emailclient {
    public  static void main(String[]args) {
        try{
          String str="",str2="";
          while(true){
            Scanner sc1 = new Scanner(System.in);
            String ab=sc1.nextLine();
          System.out.println(ab);
          if(ab.equals("on"))
          { 
            Socket s=new Socket("localhost",5003);
            System.out.println("Client Server Active");
          Scanner bc= new Scanner(s.getInputStream());
          PrintStream ps =new PrintStream(s.getOutputStream());   
while(true){
  System.out.println("Enter your name");
  String name=sc1.nextLine();
  ps.println(name);
  System.out.println("Enter your id");
  int id=sc1.nextInt();
  ps.println(id);
  System.out.println("Enter department");
  String dep=sc1.next();
  ps.println(dep);
  System.out.println("Enter password");
  Long pass=sc1.nextLong();
  ps.print(pass);
  System.out.println("Wait...");
str2 =bc.nextLine();
System.out.println(str2);

if(str2.equals("bye")){break;}
ps.flush();
break;
}
s.close();}
}}
catch(Exception e){
}
}
}
