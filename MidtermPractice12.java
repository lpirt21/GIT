

import acm.program.*;
import acm.util.RandomGenerator;

public class MidtermPractice12 extends ConsoleProgram{

	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int n = readInt("Enter a number: ");
		int k = readInt("Enter a base: ");
		println(n+ " wtih the base " + k + " is " +changeTheBase(n,k));
		println("The sum of all numbers of " + n+ " wtih the base " + k + " is " +theSum(n,k));
	}
	
	
	private int theSum(int n, int k) {
		int dec=0;
		int b=0;
		while(n>0) {
			b = n%k;
			dec+=b;
			n/=k;
		}
		
		return dec;
	}
	

	private String changeTheBase(int n, int k) {
		String num="";
		String res = "";
		int b=0;
		while(n>0) {
			b = n%k;
			num+=""+b;
			n/=k;
		}
		for(int i= num.length()-1; i>=0; i--) {
			res+=num.charAt(i);
		}
		return res;
	}
}

