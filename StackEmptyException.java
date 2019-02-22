package unit10.mySolutions;

@SuppressWarnings("serial")
public class StackEmptyException extends Exception {
   public StackEmptyException() {}
   public StackEmptyException(String message) { super(message); }
   public String toString() { return "StackEmptyException"; }
}