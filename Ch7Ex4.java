//the art and science of java chapter 7 exercise 3

import acm.program.*;
import acm.util.*;

public class Ch7Ex4  extends ConsoleProgram{
	public void run() {
		println("Allocating " + ALLOCATING_NUM + " Rational objects.");
		for(int i = 0; i<ALLOCATING_NUM; i++) {
			new Rational();
		}
		Runtime myRuntime = Runtime.getRuntime();
		long memory1 = myRuntime.freeMemory();
		myRuntime.gc();
		long memory2 = myRuntime.freeMemory();
		long freed = memory2 - memory1;
	    println("Garbage coolection freed " + freed + " bytes");
	}
	
	private static final int ALLOCATING_NUM = 10000;
}


