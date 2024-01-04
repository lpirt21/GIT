

import acm.program.*;

public class MidtermPractice15 extends ConsoleProgram{

	public void run() {
		int n = readInt("Enter a number: ");
		println("F" + n + " = " + fibonacci(n));
	}
	
	private int fibonacci(int n) {
		int f1 = 0;
		int f2 = 1;
		int fi = 0;
		for(int i = 0; i < n; i++) {
			fi = f1 + f2;
			f1 = f2;
			f2 = fi;
		}
		return f1;
	}
}

