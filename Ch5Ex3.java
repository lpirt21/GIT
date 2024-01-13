//the art and science of java chapter 5 exercise 3

import acm.program.*;

public class Ch5Ex3 extends ConsoleProgram {

	
	public void run() {
		int n =readInt("The number: ");
		int p = readInt("The power: ");
		for(int i =0; i < p; i++) {
		println(n + " powered " + i + " is " + raiseToPower(n,i));
		}
	}
	
	private int raiseToPower(int k, int n) {
		int res = 1;
		for(int i=0; i<=n; i++) {
			res*=k;
		}
		if(n==0) {
			return 1;
		}
		return res;
	}

}

