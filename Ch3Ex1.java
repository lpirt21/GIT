//the art and science of java chapter 3 exercise 1

import acm.program.*;

public class Ch3Ex1 extends ConsoleProgram{
	
	public void run() {
		println("This program converts feet and inches to centimeters");
		int feet = readInt("Enter number of feet: ");
		int inches = readInt("Enter number of inches: ");
		int totalInches = feet*INCHES_PER_FOOT + inches;
		double cm = totalInches * CENTIMETERS_PER_INCH;
		println(feet + "ft " + inches + "in = " + cm + "cm");
	}
	
	private static final int INCHES_PER_FOOT = 12;
	private static final double CENTIMETERS_PER_INCH =2.54;
}
