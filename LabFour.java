package unit07.mySolutions;
// Reads command line, then prints in reverse
public class LabFour {
	 public static void main(String [] args) {
	      for(int index = args.length - 1; index >= 0; index--)
	         System.out.print(args[index] + " ");
	      System.out.println();  
	   }
	}