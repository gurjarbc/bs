import java.net.*;
import java.util.*;
import java.io.*;

public class Emailserver {
    public  static void main(String[]args) {  
  try {
    String str="",str2="";
        ServerSocket bs =new ServerSocket(5003);
        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getLocalHost().getHostName());
        Scanner sc1=new Scanner(System.in);
        Random rr=new Random();

        File obj =new File("Emailclientdata.text");
        if(obj.createNewFile())
        {
            System.out.println("file create");}
            FileWriter writer=new FileWriter("Emailclientdata.text",true);
        while(true){
       System.out.println("Server Run");
       Socket s= bs.accept();
       InetSocketAddress socketAddress =(InetSocketAddress) s.getRemoteSocketAddress();
       System.out.println(socketAddress);
       String clienentIpAddress =socketAddress.getAddress().getHostAddress();
       System.out.println(clienentIpAddress);
       Scanner sc=new Scanner(s.getInputStream());
       PrintStream ps=new PrintStream(s.getOutputStream());
       while(true){
           str =sc.nextLine();
            writer.write("Name ="+str+"\n");
            System.out.println(str);
            str =sc.nextLine();
            writer.write("User Id ="+str+"\n");
            System.out.println(str);
            str =sc.nextLine();
            writer.write("User Department ="+str+"\n");
            System.out.println(str);
         
           System.out.println("Data succesfully created");
           long pass=rr.nextLong(99999);
           writer.write("password"+pass+"\n");
           ps.println("your data succesfully created");
            writer.close();
  if(str.equals("bye")){break;  }
 str2=sc.nextLine();
 System.out.println(str2);
 if(str2.equals("bye")){break;  }
 ps.flush();
      }
      s.close();
    }}
        catch (Exception e) {
          }
}
}
