
import acm.program.*;

public class Assignment2 extends ConsoleProgram{
	
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
		double result =0;
		switch(ch) {
		case '+' : result = add(n1,n2);break;
		case '*' : result = multiply(n1,n2);break;
		case '-' : result = subtract(n1,n2);break;
		case '/' : result = devide(n1,n2);break;
		}
		println(n1 + " " + symbol + " "+ n2 + " = " + result);
	}
	
	private double add(double n1,double n2) {
		return n1+n2;
	}
	
	private double devide(double n1,double n2) {
		return n1/n2;
	}
	
	private double multiply(double n1,double n2) {
		return n1*n2;
	}
	
	private double subtract(double n1,double n2) {
		return n1-n2;
	}
}
