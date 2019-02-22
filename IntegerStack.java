package unit10.mySolutions;

import unit10.solutions.StackEmptyException;
import unit10.solutions.StackFullException;

// Push method throws exception if stack is full. Print 
// method throws exception if the stack is empty.

public class IntegerStack {
 private int entries;
 private int [] stack;

 public IntegerStack(int size) {
     entries = 0;
     stack = new int[size];
 }

 public IntegerStack() {
     this(10);
 }

 // Throws exception
 public void push(int num) throws StackFullException {
    if(stackFull())
       throw new StackFullException("Stack is full");
    else
       stack[entries++] = num;
 }

 // Throws exception
 public void print() throws StackEmptyException  {
    if(stackEmpty())
       throw new StackEmptyException("Stack is empty");
    else
       for(int i = 0; i < entries; i++)
          System.out.println(stack[i]);
 }
 
 private boolean stackFull() {
     return (entries == stack.length) ? true : false;
 }

 private boolean stackEmpty() {
     return (entries == 0) ? true : false;
 }
}
