//the art and science of java chapter 12 exercise 6

import acm.program.*;

public class Ch12Ex6 extends ConsoleProgram {
	
	private double[] arr = new double[] {23.5,19.5,9.2,19.8,54.9,2,19.8,9.2,9.2,9.2,6.7,20,2.5,2.1,6.4,19.8,19.8,75,3.6};
	public void run(){
		println(mode(arr));
	}
	
	private double mode(double[] array) {
		int n1 =0;
		int n2 =0;
		double result = 0;
		for(int i =0; i<array.length; i++) {
			n1 = countAmount(array, array[i]);
			if(n1>n2) {
				result = array[i];
				n2=n1;
			}
		}
		return result;
	}
	
		
	private int countAmount(double[]array, double m) {
		int n =0;
		for(int i =0; i<array.length; i++) {
			if(array[i] == m) {
				n++;
			}
		}
		return n;
	}
	
}
