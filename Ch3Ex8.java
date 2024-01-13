//the art and science of java chapter 3 exercise 8

import acm.program.*;

public class Ch3Ex8 extends ConsoleProgram{
	
	public void run() {
		println("This program calculates average of four integers");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int n3 = readInt("Enter n3: ");
		int n4 = readInt("Enter n4: ");
		double avg = (double)(n1+n2+n3+n4)/4;
		println("The average is " + avg);
	}
	
}