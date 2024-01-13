//the art and science of java chapter 5 exercise 2

import acm.program.*;

public class Ch5Ex2 extends ConsoleProgram {

	
	public void run() {
		int n =readInt("Which Fibonacci number do you want: ");
		println("f" + n + " = " + fibonacci(n));		
	}
	
	private int fibonacci(int n) {
		int f0 = 0;
		int f1 = 1;
	    for(int i =1; i<n; i++) {
	    	int fi = f0+f1;
	    	f0=f1;
	    	f1 = fi;
	    }
	    return f1;
	}
	
}