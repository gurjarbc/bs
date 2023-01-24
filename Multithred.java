import java.io.*;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.net.*;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
class First extends Thread{
    public void run(){
   for(int i=0;i<=5;i++){
System.out.println(i);
   }
    }
}
class Second extends Thread{
    public void run(){
        for(int j=10;j<=15;j++){
            System.out.println(j);
               }     
    }
}
public class Multithred {
   
    public static void main(String[]args){
  
  First f=new First();
  Second s=new Second();
  f.start();
  s.start();
    } 
}

