package unit09.mySolutions;

import unit09.solutions.Almanac;
import unit09.solutions.Book;
import unit09.solutions.Novel;
import unit09.solutions.Phone;

public class LabOne {
	   public static void main(String [] args) {
	      Book [] library = new Book [5];

	      library[0] = new Novel("Jaws", 300, 15);
	      library[1] = new Almanac("New World Almanac", 100, 50);
	      library[2] = new Novel("Animal Farm", 250, 9);
	      library[3] = new Phone("Princeton Area", 125, 275);

	      listBooks(library);
	   }

	   static void listBooks(Book [] library) {
	      for(int i = 0; library[i] != null; i++)
	         library[i].print(); 
	   }       
	}