

import acm.program.*;

public class MidtermPractice13 extends ConsoleProgram{

	public void run() {
		int n = readInt("Enter a number: ");
		println(probability(n));
	}
	

	
	
	private boolean probability(int n) {
		int first = 0;
		int second = 0;
		boolean flag = false;
		for(int i=0; i<n;i++) {
			first = i*i;
			for(int j =0; j<n; j++) {
				second = j*j;
				if(first+second ==n) {
					println(i+"^2 + " + j + "^2 = "+ n);
					flag = true;
				}
			}
		}
		return flag;	
	}
}

