//the art and science of java chapter 2 exercise 2

import acm.program.*;

public class Ch2Ex2 extends ConsoleProgram{
	public void run() {
		println("This program multiplies two numbers on each other and divides result by two.");
		double n1 = readDouble("Enter n1: ");
		double n2 = readDouble("Enter n2: ");
		double total = (n1 * n2)/2;
		println("The result is " + total + ".");
	}

}
