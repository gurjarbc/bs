import java.io.*;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.net.*;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;





public class Weathermap {
    public void valuemap(){
        try {
            URL url= new URL("https://api.openweathermap.org/data/2.5/weather?lat=26.958302&lon=75.743347&appid=de3b1919f41679573d44979203f0a2fb");
        HttpURLConnection bs=(HttpURLConnection)url.openConnection();
        bs.setRequestMethod("GET");

        InputStreamReader ab=new InputStreamReader(bs.getInputStream());
        BufferedReader bf=new BufferedReader(ab);
     
        String st="";
        File obj =new File("Weatherfile.json");
        if(obj.createNewFile())
        {
            System.out.println("file create");}
            FileWriter writer=new FileWriter("Weatherfile.json",true);
            while(st!=null){
                st=bf.readLine();
                writer.write(st);
                writer.close();
                JSONParser par=new JSONParser();
              JSONArray arr=(JSONArray) par.parse(st);
              for(int i=0;i<arr.size();i++){
                JSONObject obj1 =(JSONObject) arr.get(i);
                System.out.println(obj1);
            }
  
        } }
        catch (Exception e) {
          
        }

    }
    public static void main(String[]args){
        Weathermap wm=new Weathermap();
        wm.valuemap();

       
    }}
    
