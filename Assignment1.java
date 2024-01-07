
import acm.program.*;

public class Assignment1 extends ConsoleProgram{
	
	public void run() {
		double n1 = readDouble("Enter first number: ");
		double n2 = readDouble("Enter second number: ");
		String symbol = readLine("Enter a symbol: ");
		char ch = symbol.charAt(0);
		while(ch != '/' && ch != '*' && ch != '+' && ch!= '-') {
			println("Please choose one of these symbols(-, /, *, +,)");
			symbol = readLine("Enter a symbol: ");
			ch = symbol.charAt(0);
		}
		println(n1 + " " + symbol + " "+ n2 + " = " + res(ch,n1,n2));
	}
	
	private double res(char c,double n1,double n2) {
		switch(c) {
		case '+' : return n1+n2;
		case '*' : return n1*n2;
		case '-' : return n1-n2;
		case '/' : return n1/n2; 
		default : return 0;
		}
	}
}
