import java.io.*;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.net.*;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Weathermapfind {
   static  void Weatherfind(){
        File read =new File("Weatherfile.json");
        try {
      Scanner scn=new Scanner(read);
        String st="";
        while(scn.hasNext()){st += scn.nextLine();}
        JSONParser par=new JSONParser();
        JSONObject obj1=(JSONObject) par.parse(st);
           //System.out.println(obj1.get("weather"));
            JSONObject obj2 =(JSONObject) obj1.get("coord");
            System.out.println(obj2.get("lat"));
           JSONArray arr = (JSONArray) obj1.get("weather");
           JSONObject obj3 =(JSONObject) arr.get(0);
           System.out.println(obj3.get("description"));
           JSONObject obj4 =(JSONObject) obj1.get("main");
            System.out.println(obj4.get("humidity"));
   
        } catch (Exception e) {
          
        }
    }

    
    public static void main(String[]args){
    Weathermapfind wj=new Weathermapfind();
       wj.Weatherfind();
       
    } 
}