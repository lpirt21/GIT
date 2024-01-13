//the art and science of java chapter 5 exercise 12

import acm.program.*;

public class Ch5Ex12 extends ConsoleProgram {

	
	public void run() {
		int n = readInt("Enter the number you want to know is a perfect or not: ");
		if(isPerfect(n)) {
			println("This number is perfect.");
		}else{
			println("This number is not perfect");
		}
	}
	
	private boolean isPerfect(int n) {
		int res = 0;
		for(int i=1; i<n; i++) {
			if(n%i ==0) {
				res+=i;
			}
		}
		return (res==n);
	}
}
