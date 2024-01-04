

import acm.program.*;

public class MidtermPractice14 extends ConsoleProgram{

	public void run() {
		printAllPrime();
	}
	
	private void printAllPrime() {
		for(int i=0; i<=MAX_NUM; i++) {
			if(probability(i))println(i);
		}
	}

	
	
	private boolean probability(int n) {
		int m = 0;
		for(int i=1; i<=n;i++) {
			if(n%i ==0)m++;
		}
		return m==2;
	}
	
	private static final int MAX_NUM = 10000;
}

