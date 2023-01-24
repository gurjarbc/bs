import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.*;

public class Httpsurl {
    static void create(){

    }
    public static void main(String[]args){

        try {
            URL url= new URL("https://www.google.com/");
        HttpURLConnection bs=(HttpURLConnection)url.openConnection();
        bs.setRequestMethod("GET");

        InputStreamReader ab=new InputStreamReader(bs.getInputStream());
        BufferedReader bf=new BufferedReader(ab);
      
        String st="";
        File obj =new File("Httpsurlfile.text");
        if(obj.createNewFile())
        {
            System.out.println("file create");}
        
      
        while(st!=null){
            st=bf.readLine();
            
            FileWriter writer=new FileWriter("Httpsurlfile.text",true);
            writer.write(st);
            writer.close();
            System.out.println(st);
             
        }
        bf.close();
        } catch (Exception e) {
          
        }
    }
    
}