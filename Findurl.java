// url class define krna
import java.net.*;

public class Findurl {
    
    public static void main(String[]args){

        try {
            URL url= new URL("https://www.onlinegdb.com/edit/4Ys2mgmFV");
            

     System.out.println(url.getProtocol());
     System.out.println(url.getHost());
     System.out.println(url.getPort());
     System.out.println(url.getFile());
     System.out.println(url.getUserInfo());
            
        } catch (Exception e) {
          
        }
    }
}
