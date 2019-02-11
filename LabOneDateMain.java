package unit06.mySolutions;

import unit06.mySolutions.LabOne;

public class LabOneDateMain {
	
	public static void main(String[] args) {
		// create two Date objects
		LabOne today = new LabOne();
		LabOne tomorrow = new LabOne();

		int month, day, year;

		if (today.setDate(2, 3, 2018))
		    today.printDate();
	    else
	         System.err.println("Invalid date");

		today.printDate();

		month = today.getMonth();
		day = today.getDay();
		year = today.getYear();

		if (tomorrow.setDate(month, day + 1, year))
		   tomorrow.printDate();
		else
		   System.err.println("Invalid date");	 
		
	}
}
