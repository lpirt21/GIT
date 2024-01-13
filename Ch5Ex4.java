//the art and science of java chapter 5 exercise 4

import acm.program.*;

public class Ch5Ex4 extends ConsoleProgram {
	
	public void run() {
		int n =readInt("The number: ");
		println(countDigits(n));
	}
	
	private int countDigits(int n) {
		int res = 0;
		while(n>0) {
			n/=10;
			res++;
		}
		return res;
	}
}