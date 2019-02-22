package unit09.mySolutions;

import unit09.solutions.SavingsAccount;

public class LabTwo {
	   public static void main(String [] args) {
	      SavingsAccount savings =
	            new SavingsAccount("Savings",1000.00, 0.05);

	      // Prints account statement
	      savings.printStatement();

	      // Makes deposit and prints new balance
	      savings.deposit(500.00);
	      savings.printStatement();

// Makes withdrawal and prints account statement
// Prints error message if insufficient funds 
	      if(savings.withdraw(200.00) == false)
	         System.err.println("Insufficient funds");
	      else
	         savings.printStatement(); 

// Posts interest and prints account statement
	      savings.postInterest();
	      savings.printStatement();

// Makes withdrawal and prints account statement
// Prints error message if insufficient funds 
	      if(savings.withdraw(5000.00) == false)
	         System.err.println("Insufficient funds");
	      else
	         savings.printStatement();            
	   }       
	}