
import acm.program.*;

public class Assignment3 extends ConsoleProgram{
		
	public void run() {
		int n = readInt("Enter a number n: ");
		int command = readInt("if you want to know amount of divisors for this number enter 1\n"
				+ "if you want to know the sum of all numbers from one to n enter 2: ");
		while(command!=1 && command!=2) {
			command = readInt("Please enter one or two: ");
		}
		if(command == 1) {
			println("The amount of divisors for this numbers is " + divisors(n));
		}else{
			println("the sum of all numbers from one to this one is " + theSum(n));
		}
		
	}
	
	
	private int theSum(int n) {
		int result = 0;
		while(n>0) {
			result+=n;
			n--;
		}
		return result;
	}
	private int divisors(int n) {
		int result =0;
		int d = 1;
		while(d<=n) {
			if(n%d ==0)result++;
			d++;
		}
		return result;
	}
	
}
