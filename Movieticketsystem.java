import java.util.*;


public class Movieticketsystem {
    public void ticket(){
        int a,b=0,age;  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number person");
         a= sc.nextInt(); 
         for(int i=0;i<=a;i++){
            System.out.println("enter age no= "+i+ " person");
            age= sc.nextInt();
            if(3<age &age<12){b=b+100;}
           
            if(age>12){b=b+150;}
         }
         System.out.println("total amount"+b+" rupay");
    }


    
    public static void main(String[] args) {  
        Movieticketsystem ss =new Movieticketsystem();
        ss.ticket();
     }    
}
