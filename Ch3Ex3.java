//the art and science of java chapter 3 exercise 3

import acm.program.*;

public class Ch3Ex3 extends ConsoleProgram{
	
	public void run() {
		println("Interest calculation program");
		double balance = readDouble("Enter starting balance: ");
		double air = readDouble("Enter annual interest rate: ");
		double result  = balance + balance*air/100;
		double result2 = result + result*air/100;
		println("Balance after one year = " + result);
		println("Balance after two years = " + result2);
	}
	
}