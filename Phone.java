package unit09.mySolutions;

import unit09.solutions.Book;

/*
Extends the Book class and tracks the number of both the yellow
and white pages.
*/

public class Phone extends Book {
    private int yellowPages;
    private int whitePages;
    
    public Phone(String title, int yellowPages, int whitePages) {
        super(title, yellowPages + whitePages);
        this.yellowPages = yellowPages;
        this.whitePages = whitePages;
    }
    
 // Prints the number of yellow and white pages
    public void print() {
        super.print();
        System.out.println(yellowPages + " yellow pages and "
                                     + whitePages + " white pages");
    }
}
