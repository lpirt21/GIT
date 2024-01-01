import acm.program.ConsoleProgram;

public class Assignment4 extends ConsoleProgram{

	public void run() {
		int n = readInt("Enter a number: ");
		allDivisors(n);
	}
	
	private void allDivisors(int n) {
		int a = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				a++;
				println("Divisor number " + a + ": "+ i);
			}
			
		}
	}
}
