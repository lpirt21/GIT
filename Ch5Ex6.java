//the art and science of java chapter 5 exercise 11

import acm.program.*;

public class Ch5Ex6 extends ConsoleProgram {

	
	public void run() {
		int n = readInt("Enter the number you want to know is a prime or not: ");
		if(isPrime(n)) {
			println("This number is prime.");
		}else{
			println("This number is not prime");
		}

	}
	
	private boolean isPrime(int n) {
		int res = 0;
		for(int i=1; i<=n; i++) {
			if(n%i ==0) {
				res++;
			}
		}
		return (res==2);
	}
}
