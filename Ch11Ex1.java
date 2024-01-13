//the art and science of java chapter 11 exercise 1

import acm.program.*;

public class Ch11Ex1 extends ConsoleProgram {
    
	public void run() {
		int N_JUDGES =readInt("The amount of judges is? ");
		while(N_JUDGES <3) {
			println("The amount of judges must be more than 2");
			N_JUDGES = readInt("The amount of judges is? ");
		}
		double MAX_VALUE = 10;
		int n_values = N_JUDGES-2;
		double[] values = new double[N_JUDGES];
		double cut1 =0;
		double cut2 = MAX_VALUE;
		double avg = 0;
		for(int i =0; i<N_JUDGES; i++) {
			values[i] = readDouble("? ");
			if(values[i] > cut1) {
				cut1 = values[i];
			}
			if(values[i] < cut2) {
				cut2 = values[i];
			}
		 avg += values[i];
		}
		 avg = avg-cut1-cut2;
		 avg = avg/n_values;
		println(avg);
	}	

}
