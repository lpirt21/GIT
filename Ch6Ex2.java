//the art and science of java chapter 6 exercise 2

import acm.program.*;
import acm.util.*;

public class Ch6Ex2 extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int n = 0; //number of flips
		int h = 0; //counts amount of heads in a row
		String m = "";
		while (true) {
			m = rgen.nextBoolean() ? "Heads" : "Tails";
			println(m);
			if(m.equals("Heads")) {
				h++;
			}else if(m.equals("Tails")) {
					h =0;
			}
			n++;
			if(h == AMOUNT)break;
		}
		println("It took " + n + " flips to get " + AMOUNT + " heads.");
		
	}
	
	private static final int AMOUNT =3;
}
