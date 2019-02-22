package unit09.mySolutions;

/*
Maintains the information within a hypothetical customer's
bank account.  
*/

public class BankAccount {    
private double balance;

public BankAccount(String name, double balance) { 
   this.balance = balance;
}

// Calls first constructor and creates account with 0 balance
public BankAccount(String name) {
   this(name, 0.0); 
}

// Adds a deposit amount
public void deposit(double amount) {
   balance += amount;
}

// Subtracts the withdrawal amount and ensures that balance is
// sufficient and withdrawal amount is positive
public boolean withdraw(double amount) {
   if(amount < 0)
      return false;
   else if(balance < amount)
      return false;
   else {
      balance -= amount; 
      return true;
   }
}

// Returns balance
public double getBalance() {
   return balance;
}

// Prints current balance
public void printStatement() {
   System.out.println("Account balance is: " + balance);
}
}