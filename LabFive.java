package unit07.mySolutions;
/*
Reads command line, then prints in reverse order
with characters reversed.
*/

import unit07.solutions.FlipString;

public class LabFive {
 public static void main(String [] args) {
    FlipString reverse = new FlipString();

    for(int count = args.length - 1; count >= 0; count--)
       System.out.print(reverse.flipIt(args[count]) + " ");
    System.out.println();  
 }
}
