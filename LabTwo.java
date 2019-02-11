package unit07.mySolutions;

/*
Reads input from terminal, populates array with input,
then reverses input and prints result.
*/

import java.io.*;

public class LabTwo {
	
  public static void main(String[] args) 
  throws IOException {
	  
      int array = 0;
      char [] line = new char[120];
      int ch;

      System.out.println("Enter text (^Z to end):");

      while((ch = System.in.read()) != -1) {
    	  
          if(array >= line.length) {
              System.err.println("Please enter > 120 characters");
          break;
          }
          
          if(ch == '\n') {
              while(array > 0)
                  System.out.print(line[--array]);
              System.out.println("\n");
          }
          
          else
              line[array++] = (char)ch;
      }
   }
}
