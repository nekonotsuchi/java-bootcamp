package unit10.mySolutions;

import unit10.solutions.IntegerStack;
import unit10.solutions.StackEmptyException;
import unit10.solutions.StackFullException;

public class LabTwo {
	   public static void main(String [] args) {
	      IntegerStack myStack = new IntegerStack(5);

	      // Tests empty stack
	      try {
	         myStack.print();
	      } catch(StackEmptyException e) {
	         System.err.println(e.getMessage() + " nothing to print");
	      }

	      try {
	         myStack.push(90);
	         myStack.push(3);
	         myStack.push(243);
	         myStack.push(15);
	         myStack.push(57);
	         myStack.push(305);  // test full stack
	      } catch(StackFullException e) {
	         System.err.println(e.getMessage() + " ignoring push");
	      } finally {
	         try {
	            myStack.print();
	         }

	         catch(StackEmptyException e) {
	            System.err.println(e.getMessage() +  " nothing to print");
	         }
	      }
	   }
	}