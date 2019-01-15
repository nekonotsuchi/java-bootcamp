package unit02.mySolutions;

public class FullName {
	   @SuppressWarnings("unused")
	   public static void main(String [] args) {
	      String firstName  = "Alexandra";
	      String middleName = "Elizabeth"; 
	      String lastName   = "Massam";
	      String fullName   = "Peter Francis Smith";
	      String makeCompleteName  = (firstName + " " + middleName + " " + lastName); 
	   
	      System.out.println ("Full name is " + fullName);
	      System.out.println ("Full name is now " + makeCompleteName);
	   }
	}

