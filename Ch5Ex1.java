//the art and science of java chapter 5 exercise 1

import acm.program.*;

public class Ch5Ex1 extends ConsoleProgram {

	
	public void run() {
		println("Enter coefficients for the quadratic equation: ");
		double a  = readDouble("a: ");
		double b = readDouble("b: ");
	    double c = readDouble("c: ");
		println("The first solution is " + sol1(a,b,c));
		println("The second solution is " + sol2(a,b,c));		
	}
	
	private double sol1(double a, double b, double c) {
	   double res = (-b + Math.sqrt((b*b - 4*a*c)))/2*a;
	   return res;
	}
	
	private double sol2(double a, double b, double c) {
		   double res = (-b - Math.sqrt((b*b - 4*a*c)))/2*a;
		   return res;
		}
}
