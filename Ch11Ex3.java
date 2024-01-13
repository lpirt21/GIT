//the art and science of java chapter 11 exercise 3

import acm.program.*;

public class Ch11Ex3 extends ConsoleProgram {
    
	public void run() {
		int N_JUDGES =readInt("The amount of judges is? ");
		double[] values = new double[N_JUDGES];
		double av = average(N_JUDGES, values);
		double sum = step(values,N_JUDGES, av);
	    double res = finalstep(sum,N_JUDGES);
	    println(res);
	}
	
	private double finalstep(double sum, int n) {
		double result = Math.sqrt(sum/n);
		return result;
	}
	
	
	private double average(int n,double[]values) {
		double avg = 0;
		for(int i =0; i<n; i++) {
			values[i] = readDouble("? ");
		 avg += values[i];
		}
		avg = avg/n;
		return avg;
	}
	
	
	private double step(double[] values,double n,double av) {
		double score =0;
		double sum = 0;
		double result =0;
		for(int i =0; i<n; i++) {
			score = values[i];
			sum = (score -av)*(score - av);
			result+=sum;
		}
		return result;
	}
	
}

