//the art and science of java chapter 7 exercise 2

import acm.program.*;
import acm.util.*;

public class Ch7Ex2 extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
    
	public void run() {
		 println("This program reads in a list of integers representing exam scores and calculates the average.\n"
			  		+ "Use " + SENTINEL + " to signal the end of the list.");
		 
		 int numOfExams = 1;
		 int total =0;
		 double avg = 0;
		 while(true) {
		 String n1 = readLine("Enter number " + numOfExams + " exam score: ");
		 if(n1.equalsIgnoreCase(SENTINEL))break;
		 total +=Integer.parseInt(n1);
		 avg = (double)total/numOfExams;
		 numOfExams++;
		 }
		 println("The average is " + avg);
	}
	
	

	private static final String SENTINEL = "Quit";
}


