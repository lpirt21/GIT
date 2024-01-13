//the art and science of java chapter 6 exercise 4

import acm.program.*;
import acm.util.*;

public class Ch6Ex4 extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int atoms1 = 10000;
		int atoms2=0;
		int atoms3 = 10000;
		int year = 0;
		println("There are " + atoms1 + " atoms initally");
		while(atoms1!=0) {
		atoms3 = atoms1;
		for(int i = 0; i < atoms3; i++) {
			if(rgen.nextBoolean()) {
				atoms2 = atoms1-1;
			}else {
				atoms2 = atoms1;
			}
			atoms1 = atoms2;
		}
		year++;
		println("There are " + atoms2 + " atoms at the end of year "+ year);
		}
	}
}

