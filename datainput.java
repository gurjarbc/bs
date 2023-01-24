import java.io.*;
public class datainput {

   public static void main(String args[])throws IOException {

      
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("E:\\file.txt"));
      dataOut.writeUTF("hello");

      DataInputStream dataIn = new DataInputStream(new FileInputStream("E:\\file.txt"));

     
         String k = dataIn.readUTF();
         System.out.print(k+" ");
      }
   }
