package unit06.mySolutions;

/* 
 * Validates month and day within setDate method so that
 * invalid dates are returned false with error print text
 * "Invalid date" and valid dates are returned as "true".
 */

public class LabOne {
	   private int month, day, year;

	   private static final String [] monthName = {
	                "January", "February", "March",
	                "April",   "May",      "June",
	                "July",    "August",   "September",
	                "October", "November", "December"
	              };

	   private static final int [] monthSize = {
	                31, 28, 31, 30, 31, 30,
	                31, 31, 30, 31, 30, 31
	              };

	   private boolean isLeapyear() {
	      return(year % 4 == 0);
	   }

	   @SuppressWarnings("unused")
	   private int monthLength() {
	     if(month != 2)
	        return(monthSize[month - 1]);
	     else
	        return(isLeapyear() ? 29 : 28);
	   }

	   public boolean setDate(int m, int d, int y) {
	      if ((m > 1) || (m < 12))
		     return false;
	      else
		     month = m;
	         year = y;
	         
	      if ((d > 1) || (d < monthLength()))
			 return false;
		  else
			     day = d;
	      
	         return true;
	   }

	   public int getMonth() { return(month); }

	   public int getDay()   { return(day);   }

	   public int getYear()  { return(year);  }

	   public void printDate() {
	         System.out.println(monthName[month - 1] + " " 
	                            + day + ", " + year);
	   }
	}
