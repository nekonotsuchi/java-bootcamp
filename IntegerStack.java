package unit08.mySolutions;

public class IntegerStack {
	   private int entries;
	   private int [] stack;

	   // constructor to create stack of specified size
	   public IntegerStack(int size) {
	       entries = 0;
	       stack = new int[size];
	   }

	   // constructor to create stack of default size
	   public IntegerStack() {
	       this(10);
	   }
	 
	   // Puts an integer on the stack until stack is full
	   // Prints error if stack is full
	   public void push(int num) {
	       if(stackFull()) 
	           stack[entries++] = num;
	       else
	           System.err.println("Stack full");
	   }
	   // Tests to see if stack is full
	   private boolean stackFull () {
		   return(entries == stack.length) ? true:false;

	   }
	   // Tests to see if stack is empty
	   private boolean stackEmpty() {
		   return(entries == 0) ? true : false;
	   }
	   //If stacks are not the same length, returns false
	   //If stacks are same length, copies stack and returns
	   //true
	   public boolean copyStack(IntegerStack source) {
		   if (source.stack.length != stack.length)  
			   return false;
		   else {
			   copyStack(source, source.entries); 
		   return true;   
	   }
	       }
	   //Method overload that specifies the # of integers
	   //that should be copied onto the stack
	   public boolean copyStack(IntegerStack source, int howMany) {
		   if (stack.length < howMany || source.stack.length < howMany)
			   return false;
	         entries = 0;
	         for(int i = 0; i < howMany; i++) 
	            push(source.stack[i]);
	         return true;
		   
	   }
	   // Checks if stack is empty, and prints error if so.
	   // If not, prints the stack of integers
	   public void print() {
		   if (stackEmpty())
			   System.err.println("Stack empty");
		   else
		   for (int i = 0; i < entries; i++)
	           System.out.println(stack[i]);
	   }
	}