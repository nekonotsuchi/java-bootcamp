package unit11.mySolutions;

//Reads numbers from keyboard and writes integers into file

import java.io.*;

public class LabOne {  
   public static void main(String [] args) throws IOException {
      BufferedReader in = null;
      DataOutputStream out = null;
      int num;
      String s;

      if(args.length != 1) {
         System.err.println("Output file name needed");
         System.exit(1);
      } 

      in = new BufferedReader(new InputStreamReader(System.in)); 
      
      try {
         out = new DataOutputStream(new FileOutputStream(args[0]));
      }
      catch(IOException e) {
         System.err.println("Cannot open output file: " + args[0]);
         System.exit(2);
      }
      
 // Enter ^Z or ^D for EOF
      for(System.out.print("Enter integer: ");
         (s = in.readLine()) != null;
          System.out.print("Enter integer: ")) {
         try {
            num = Integer.parseInt(s); 
         }
         catch(NumberFormatException e) {
            System.err.println("Enter integers only\n");
            continue;
         }
         out.writeInt(num);
      }

      in.close();
      out.close();   
   }
}