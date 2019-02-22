package unit11.mySolutions;

// Reads file containing ints and writes numbers as chars

import java.io.*;

public class LabTwo {  
   public static void main(String [] args) throws IOException {
      DataInputStream in = null;
      PrintWriter out = null;
      int num;

      if(args.length != 2) {
         System.err.println("Need input/output file names");
         System.exit(1);
      } 

      try {
         in = new DataInputStream(new FileInputStream(args[0]));
      }
      catch(IOException e) {
         System.err.println("Cannot open input file: " + args[0]);
         System.exit(2);
      }

      out = new PrintWriter(new FileOutputStream(args[1]));
      if(out.checkError()) {
         System.err.println("Cannot open output file: " + args[1]);
         System.exit(3);
      }
      
      try {
         while(true) {
            num = in.readInt();
            out.println("Number: " + num);
         }
      }
// Throws EOFException on end of file
      catch(EOFException e) {
         System.out.println("End of file");
      }
      in.close();
      out.close();
   }
}