//the art and science of java chapter 3 exercise 5

import acm.program.*;

public class Ch3Ex5 extends ConsoleProgram{
	
	public void run() {
		println("This program cnverts Fahrenheit to Celsius.");
		double f = readDouble("Enter Fahrenheit temperature: ");
		double c = 5.0/9 *(f-32);
		println("Celsius equivalent " + c);
	}
	
}
