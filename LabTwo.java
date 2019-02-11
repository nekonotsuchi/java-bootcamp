package unit06.mySolutions;

public class LabTwo {

public static void main(String[] args) {
	Temperature states = new Temperature();
	Temperature elsewhere;

    if(states.set(0.0, 'F'))
       states.print();

    elsewhere = states.convert();
    elsewhere.print();

    if(elsewhere.set(0.0, 'C'))
    elsewhere.print();

    states = elsewhere.convert();
    states.print();
	
	}

}
