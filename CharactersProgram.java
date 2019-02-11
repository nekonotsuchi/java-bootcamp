package unit04.mySolutions;

import java.io.*;

public class CharactersProgram {
    public static void main(String [] args)
        throws IOException {
        int count = 0;

        System.out.println("Enter characters: ");
 
        while(System.in.read() != -1)
            count++;

        System.out.println("Number of characters entered: " + count);
    }
}
