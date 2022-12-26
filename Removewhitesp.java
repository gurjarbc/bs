import java.util.Scanner;

public class Removewhitesp {
    public void remove(){ 
        Scanner scn = new Scanner(System.in);
        System.out.println("enter string");
         String a= scn.nextLine();    
        char[] charArray=a.toCharArray();
        String b="";
        for(int i=0;i< charArray.length;i++){
            if( charArray[i]!=' '){b=b+charArray[i];}
        }  
       System.out.println("befor="+a);
       System.out.println("after="+b);           
    }
        public static void main(String[] args) {    
           Removewhitesp bs =new Removewhitesp();
           bs.remove(); 
        }    
    }    
    

