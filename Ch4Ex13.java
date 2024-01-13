//the art and science of java chapter 4 exercise 13

import acm.program.*;

public class Ch4Ex13 extends ConsoleProgram{
	
	private static final int SENTINEL = 0;
	
	public void run() {
		println("This program finds the largest integer in a list.");
		println("Enter values, one per line, using a" + SENTINEL + " to signal\n"
				+ "the end of the list.");
		int largest =0;
		int largest2=0;
		while(true) {
			int value = readInt("? ");
			if(value==SENTINEL)break;
			if(value > largest) {
				largest2 = largest;
				largest =value;
			}
			if(value > largest2 && value < largest) {
				largest2 = value;
			}
		}
		println("The largest value is " + largest);
		println("The second largest value is " + largest2);
	}
	
}
