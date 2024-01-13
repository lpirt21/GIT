//the art and science of java chapter 3 exercise 7

import acm.program.*;

public class Ch3Ex7 extends ConsoleProgram{
	
	public void run() {
		println("This program converts kilograms to pounds adn ounces");
		double k = readDouble("Enter the value of kilograms: ");
		double pounds = (int)(k * POUNDS_PER_KILO);
		double totalOunces = pounds*OUNCE_PER_POUND;
		double ounces = totalOunces - pounds*OUNCE_PER_POUND;
		println(k + " kilos = " + pounds + " pounds and " + ounces + " ounces");
	}
	
	private static final double POUNDS_PER_KILO = 2.2;
	private static final double OUNCE_PER_POUND = 16;
}
