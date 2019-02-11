package unit06.mySolutions;
/*
 * Converts temperature from Centigrade to Fahrenheit and
 * Fahrenheit to Centigrade.
*/ 
public class Temperature {
// Default is 0 degrees Fahrenheit
	private char scale = 'F';
	private double degrees = 0.0;
	
public boolean set(double d, char s) {
	 if ((s != 'F') && (s != 'C'))
	     return false;
	 scale = s;
	 degrees = d;
         return true;
}
//Prints temperature with degrees and scale
public void print() {
     System.out.println(degrees + " degrees " + scale);
}
//Converts to Centigrade if scale is F
//Converts to Fahrenheit if scale is C
//Returns converted temperature object
public Temperature convert() {
	
	Temperature temp = new Temperature();
	
     if (scale == 'F')
    	temp.set ((degrees - 32) * (5.0 / 9.0), 'C');
     else
    	temp.set (degrees * (9.0 / 5.0) + 32, 'F'); 
     return temp;
}

}