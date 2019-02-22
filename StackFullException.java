package unit10.mySolutions;

@SuppressWarnings("serial")
public class StackFullException extends Exception {
   public StackFullException() {}
   public StackFullException(String message) { super(message); }
   public String toString() { return "StackFullException"; }
}
