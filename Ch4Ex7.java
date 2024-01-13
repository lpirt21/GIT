//the art and science of java chapter 4 exercise 7

import acm.program.*;

public class Ch4Ex7 extends ConsoleProgram{
	
	
	public void run() {
		println("This program calculates the digital root of a number.");
		int n = readInt("Enter a positive integer: ");
		int f = n;
		int total =0;
		while(n>0) {
			total += (n%10);
			n/=10;
			if(n == 0 && (total/10 >0)) {
				n = total;
				total = 0;
			}
		}
		println("The digital root of " + f + " is " +total);
	}
	
}