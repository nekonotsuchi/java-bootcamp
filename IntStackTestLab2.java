package unit08.mySolutions;

import unit08.mySolutions.IntegerStack;

public class IntStackTestLab2 {

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
	       
	       if (test2.copyStack(test1))
	    	   test2.print();
	       else
	    	   System.err.println("Stack sizes !=");
	       
	     IntegerStack test3 = new IntegerStack(1);
			if (test3.copyStack(test1))
				test3.print();
			else
				System.err.println("Stack sizes !=");
	}

}
