//the art and science of java chapter 4 exercise 6

import acm.program.*;

public class Ch4Ex6  extends ConsoleProgram{
	
	public void run() {
		println("This program reverses the digits in an integer.");
		int n = readInt("Enter a positive integer: ");
		int rev = 0;
		while(n>0) {
			int last = n % 10;
			rev = rev*10 +last;
			n/=10;
		}
		println("The reversed number is "+ rev);
	}
	
}
