//the art and science of java chapter 4 exercise 3

import acm.program.*;

public class Ch4Ex3 extends ConsoleProgram{
	
	public void run() {
		println("This progrma calculates the sum of odd integers starting from 1");
		int n = readInt("Enter how many odd numbers you want added up: ");
		int total = 0;
		for(int i = 1; i < 2*n; i+=2) {
			total+=i;
		}
		println("The sum of first " + n + " odd integers is " + total +".");
	}
}
