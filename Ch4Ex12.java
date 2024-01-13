//the art and science of java chapter 4 exercise 12

import acm.program.*;

public class Ch4Ex12 extends ConsoleProgram{
	
	private static final int SENTINEL = 0;
	
	public void run() {
		println("This program finds the largest integer in a list.");
		println("Enter values, one per line, using a" + SENTINEL + " to signal\n"
				+ "the end of the list.");
		int largest =0;
		while(true) {
			int value = readInt("? ");
			if(value==SENTINEL)break;
			if(value > largest) {
				largest =value;
			}
		}
		println("The largest value is " + largest);
	}
	
}