

import acm.program.*;

public class MidtermPractice10 extends ConsoleProgram{

	public void run() {
		int n =readInt("Enter a number: ");
		println(countTheOdds(n)==countTheEvens(n));
	}
	
	private int countTheOdds(int n) {
		int m=10;
		int sum1=0;
		while(n>0) {
			n/=m;
			sum1+=(n%10);
			m=100;
		}
		return sum1;
	}
	
	private int countTheEvens(int n) {
		int f = 1;
		int sum2=0;
		while(n>0) {
			sum2+=(n%10);
			f=100;
			n/=f;
		}
		return sum2;
	}
	
	
}

