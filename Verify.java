package unit10.mySolutions;

import unit10.solutions.NumberHighException;
import unit10.solutions.NumberLowException;
import unit10.solutions.NumberNegativeException;

//Re-throws exceptions in Verify class and catches them in main method.

public class Verify {
int number = 0;

  public void verifyNumber(int n) throws  
       NumberHighException, NumberLowException, NumberNegativeException { 
   checkNumber(n);
}

public void checkNumber(int n) 
		   throws NumberHighException, NumberLowException {
   checkHighLow(n);
}

public void checkHighLow(int n)
            throws NumberLowException, NumberHighException {
   if(n < 0)
      throw new NumberNegativeException("number < 0");
   else if(n < 10)
      throw new NumberLowException("number < 10");
   else if(n > 100)
      throw new NumberHighException("number > 100");
   else
      number = n;
}
}
