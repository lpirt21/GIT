//the art and science of java chapter 3 exercise 4

import acm.program.*;

public class Ch3Ex4 extends ConsoleProgram{
	
	public void run() {
		println("This program calculates the area of a circle with the radius you enter");
		double r = readDouble("Enter the radius: ");
		double area = pi * r * r;
		println("The area of a circle with radius " + r + " is " + area);
		
	}
	private static final double pi = 3.14159265;
}
