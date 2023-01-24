import java.io.*;
import java.util.*;
public class Filehandling
{  
	static void create(){ 
	    	try{
	File ab =new File("registration.txt");
 
	 if(ab.createNewFile())
	{
	    System.out.println("file created");}
	
	else {
	    System.out.println("already file exit");
	}}
	
	catch(Exception e){
	    
	    System.out.println(e);
	}}
	
	static void write1(String data){
	   try{
	   FileWriter writer =new FileWriter("registration.txt",true);
	   writer.write(data);
	   writer.close();
	     System.out.println("succesfull write");}
	    catch(Exception f){
	       System.out.println(f);
	   }
	}
	static void read(){
	    try{
	 File obj =new File("registration.txt");
	 Scanner read= new Scanner(obj);
	 while(read.hasNext()){
	     String data =read.nextLine();
	     System.out.println(data);}
	 }
	 catch(Exception e){
	     System.out.println(e);
	 }
	}
	
	public static void main(String[] args) {
	//   Scanner scn =new Scanner(System.in);
	//     System.out.println("enter your name");
	//    String name=scn.nextLine();
	//     System.out.println("enter your password");
	//    String password=scn.nextLine(); 
 		//create();
 	    //write1(name+" "+password+"\n");
	   read();
	}
}
