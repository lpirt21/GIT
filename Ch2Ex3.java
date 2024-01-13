//the art and science of java chapter 2 exercise 3

import acm.program.*;

public class Ch2Ex3 extends ConsoleProgram{

	public void run() {
		println("This program multiplies two adds three integers.");
		int n1 = readInt("Enter n1: ");
	    int n2 = readInt("Enter n2: ");
		int n3 = readInt("Enter n3: ");
		int total = n1 + n2 + n3;
		println("The total is " + total + ".");
	}
}
