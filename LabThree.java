package unit04.mySolutions;

/*
   Checks to see if letter entered is a vowel or if integer
   entered is odd or even, then counts instances of each
*/

import java.io.*;

public class LabThree {
    public static void main (String [] args)
        throws IOException  {
        int ch;
        int upper = 0, lower = 0, odd = 0, even = 0, other = 0;

        System.out.println("Enter characters: ");
        while((ch = System.in.read()) != -1) {
            switch(ch) {
                case 'A': case 'E': case 'I':
                case 'O': case 'U':
                          upper++;
                          break;
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                          lower++;
                          break;
                case '1': case '3': case '5':
                case '7': case '9':
                          odd++;
                          break;
                case '0': case '2': case '4':
                case '6': case '8':
                          even++;
                          break;
                case '\n': case '\r':
                          continue;
                default:
                          other++;
                          break;
             }
        }        
        System.out.println("\n\nCapital vowel #: " + upper);
        System.out.println("Lower case vowel #: " + lower); 
        System.out.println("Odd integer #: " + odd);
        System.out.println("Even integer #: " + even);
        System.out.println("Others: " + other);          
    }
}
