import acm.program.*;


public class Assignment8 extends ConsoleProgram{

	public void run() {
		int n1 = readInt("Enter number 1: ");
		int n2 = readInt("Enter number 2:");
		println("gcd of " + n1 + " and " + n2 + " is " + euclidianGCD(n1,n2));
	}
	
	private int euclidianGCD(int x, int y) {
		int r = x%y;
		while(r!=0) {
			x = y;
			y = r;
			r = x%y;
		}
		return y;
	}
}
