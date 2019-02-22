package unit10.mySolutions;

import unit10.solutions.NumberHighException;
import unit10.solutions.NumberLowException;
import unit10.solutions.NumberNegativeException;
import unit10.solutions.Verify;

public class LabOne {
public static void main(String [] args) {
   int number = 0;

   Verify ok = new Verify();

   if(args.length != 1) {
      System.err.println("Need single integer arg");
      System.exit(1);
   }

   try {
      number = Integer.parseInt(args[0]);
   }

   // check to make sure argument was an integer
   catch(NumberFormatException e) {
      System.err.println("Argument must be integer");
      System.exit(2);
   }

   try {
      ok.verifyNumber(number);
   }
   
   // Catches exceptions in main method
   catch(NumberHighException e) {
      System.out.println("NumberHigh: " + e.getMessage());
   }
   catch(NumberLowException e) {
   
      if(e instanceof NumberLowException)
         System.out.print("NumberLowException: ");       
                 
      if(e instanceof NumberNegativeException)
         System.out.print("NumberNegativeException: ");

      System.out.println(e.getMessage());
   } finally {
      System.out.println("Number from finally " + number);
   }       
}
}
