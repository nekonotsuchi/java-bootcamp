package unit07.mySolutions;

public class LabThree {
	   public static void main(String [] args) {
	      int value, option;
	      
	      for(option = 0, value = 0; value < args.length; value++) {
	         // check String for "-" sign
	    	  
	         if(args[value].charAt(0) == '-') {
	            // print String without "-"
	            System.out.println(args[value].substring(1));
	            option++;
	         }
	      }

	      System.out.println("Number of arguments = " + value);
	      System.out.println("Number of options = " + option);   
	   }
	}