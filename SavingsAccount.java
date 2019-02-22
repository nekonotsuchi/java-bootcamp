package unit09.mySolutions;
import unit09.solutions.BankAccount;

//Creates a savings account type of bank account
public class SavingsAccount extends BankAccount {
 private double interestRate = 0.0;

 public SavingsAccount(String name, double balance, double rate) {
    super(name, balance);  
    interestRate = rate;
 }

 public SavingsAccount(String name, double rate) {
    super(name);
    interestRate = rate;
 }

 public SavingsAccount(String name) {
 // Calls SavingsAccount constructor using default interest rate of 0
    this(name, 0.0);
 }

 // Posts monthly interest by multiplying current balance by
 // current interest rate divided by 12 and then adding 
 // result to balance by making deposit
 public void postInterest() {
    deposit(getBalance() * (interestRate / 12));
 }

 // Prints bank statement including customer name and current balance
 // and prints interest rate
 public void printStatement() {
    super.printStatement();
    System.out.println(interestRate + "% current rate of interest\n");
 }    
}
