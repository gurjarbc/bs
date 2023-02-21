import java.io.BufferedReader;         
import java.io.*;
import java.net.*;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Weatherallcityfull {
    public static void main(String[] args) throws Exception {
        System.out.println(" Weather Of All City Of India\n");
        Scanner scn = new Scanner(System.in);
        System.out.println(" City Name :- ");
        String city = scn.nextLine();
        System.out.println(" State Name :- ");
        String state = scn.nextLine();
    
            URL url = new URL("http://api.openweathermap.org/geo/1.0/direct?q="+city+","+state+",IN&limit=1&appid=4e6b97f81c45018ce121d32b8f5ef4df");
            HttpURLConnection dat = (HttpURLConnection) url.openConnection();
            dat.setRequestMethod("GET");                    
            InputStreamReader in = new InputStreamReader(dat.getInputStream());            
            BufferedReader in2 = new BufferedReader(in);
            String st ="";     
           while(in2.ready()){   st +=  in2.readLine(); }
//         System.out.println(st);
           JSONParser par = new JSONParser();
           JSONArray arr = (JSONArray) par.parse(st);
           JSONObject obj = (JSONObject) arr.get(0);
           double lat = (double) obj.get("lat");
           double lon = (double) obj.get("lon");
    //       System.out.println(lat);
    //       System.out.println(lon);

           URL url2 = new URL("https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid=4e6b97f81c45018ce121d32b8f5ef4df");
            HttpURLConnection dat2 = (HttpURLConnection) url2.openConnection();
            dat2.setRequestMethod("GET");
            InputStreamReader in3 = new InputStreamReader(dat2.getInputStream());
            BufferedReader in4 = new BufferedReader(in3);
            String st2 = "";            
           while(in4.ready()){   st2 +=  in4.readLine(); }
    //       System.out.println(st2);   
           JSONObject obj2 = (JSONObject) par.parse(st2);
           JSONObject obj3 = (JSONObject) obj2.get("main");
           JSONObject obj4 = (JSONObject) obj2.get("wind");
           double tem = (double) obj3.get("temp");
           long psr = (long) obj3.get("pressure");
           long hmd = (long) obj3.get("humidity");
           long vis = (long) obj2.get("visibility");
           double wind = (double) obj4.get("speed");

           System.out.println("Weather Of "+city+" is  :-\n Temperature = "+(tem-273.15)+" C\n Pressure = "+psr+"\n Humidity = "+hmd+"\n Visibility = "+vis+"\n Wind Speed = "+wind);


    }
} 
