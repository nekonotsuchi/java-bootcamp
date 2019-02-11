package unit08.mySolutions;

public class IntStackTestLab3 {

	public static void main(String[] args) {
		IntegerStack test1 = new IntegerStack();
		IntegerStack test2 = new IntegerStack();
	       
	       test1.push(90);
	       test1.push(3);
	       test1.push(243);
	       test1.push(15);
	       test1.push(57);
	       test1.push(305);
	       test1.print();
	       test2.print();
	       
	       // Tests to see if copy stack is too small
	       if(test2.copyStack(test1, 4))
	          test2.print();
	       else
	          System.err.println("Stack too small");

	       // Tests to see if target stack is too small
	       if(test2.copyStack(test1, 6))
	    	   test2.print();
	       else
	          System.err.println("Target stack too small");

	       // Tests if source stack is too small
	       if(test2.copyStack(test1, 8))
	    	   test2.print();
	       else
	          System.err.println("Source stack too small");

	}

}
