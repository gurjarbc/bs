// value insert to server
import java.net.*;
import java.util.*;
import java.io.*;

public class Server {
    public  static void main(String[]args) {  
  try {
    String str="",str2="";
        ServerSocket bs =new ServerSocket(5001);
        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getLocalHost().getHostName());
        Scanner sc1=new Scanner(System.in);
        while(true){
     
       System.out.println("conection reset");
       Socket s= bs.accept();
       InetSocketAddress socketAddress =(InetSocketAddress) s.getRemoteSocketAddress();
       System.out.println(socketAddress);
       String clienentIpAddress =socketAddress.getAddress().getHostAddress();
       System.out.println(clienentIpAddress);
       Scanner sc=new Scanner(s.getInputStream());
       PrintStream ps=new PrintStream(s.getOutputStream());
  
     
       while(true){
       str =sc1.nextLine();
     ps.println(str);
    
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
