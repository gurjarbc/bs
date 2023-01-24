import java.net.*;

public class urlconection {
    public static void main(String[]args){

        try {
            URL url= new URL("https://www.google.com/search?q=amazon&oq=&aqs=");
          URLConnection ab =  url.openConnection();

     System.out.println(url.getProtocol());
     System.out.println(url.getHost());
     System.out.println(url.getPort());
     System.out.println(url.getFile());
     System.out.println(url.getUserInfo());
     System.out.println(url.getDefaultPort());
     System.out.println(url.getContent());
            
        } catch (Exception e) {
          
        }
    }
    
}
