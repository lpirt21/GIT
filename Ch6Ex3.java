//the art and science of java chapter 6 exercise 3

import acm.program.*;
import acm.util.*;

public class Ch6Ex3 extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();	
	
	public void run() {
		int insideCircle = 0;
		double pi = 0;
        for(int i = 0; i < AMOUNT_THROWN; i++) {
			double x = rgen.nextDouble(-1,1);
			double y = rgen.nextDouble(-1,1);
			if(x*x + y*y < 1) {
				insideCircle ++;
			}
		}
        pi = 4.0 * insideCircle/AMOUNT_THROWN;
        println(pi);
      
	}
	private static final int AMOUNT_THROWN = 100000 ;
}

