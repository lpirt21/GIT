

import acm.program.*;

public class MidtermPractice16 extends ConsoleProgram{

	public void run() {
		int n = readInt("Enter n: ");
		int a = readInt("Enter a: ");
		int q = readInt("Enter q: ");
		println(progression(n,a,q));
	}
	
	private int progression(int n,int a,int q) {
		int res = a;
		int multiplier = q;
		for(int i = 1; i < n; i++) {
			res = a*multiplier;
			multiplier*=q;
		}
		return res;
	}
}

