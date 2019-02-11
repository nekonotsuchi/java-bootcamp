package unit08.mySolutions;

// Tests the IntegerStack class

import unit08.labStartingCode.IntegerStack;

public class IntStackMain {
    public static void main(String [] args) {
       IntegerStack myStack = new IntegerStack(5);
       
       myStack.print(); //Tests empty stack
       
       myStack.push(90);
       myStack.push(3);
       myStack.push(243);
       myStack.push(15);
       myStack.push(57);
       myStack.push(305); //Tests full stack

       myStack.print();
    }
}