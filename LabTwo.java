package unit04.mySolutions;

import java.io.*;

public class LabTwo {
	public static void main(String[] args)
		throws IOException {
	
	int ch;

    System.out.print("Enter single character here: ");

    while((ch = System.in.read()) != -1) {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println((char)ch);
        else if(ch == '\n' || ch == '\r')
            continue;       
        else
            System.out.println("NOT LETTER");

        System.out.print("Enter character here: ");
    }
}
}