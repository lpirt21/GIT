//the art and science of java chapter 11 exercise 2

import acm.program.*;

public class Ch11Ex2 extends ConsoleProgram {
    
	public void run() {
		int N_JUDGES =readInt("The amount of judges is? ");
		while(N_JUDGES <3) {
			println("The amount of judges must be more than 2");
			N_JUDGES = readInt("The amount of judges is? ");
		}
		double[] values = new double[N_JUDGES];
		double avg = 0;
		for(int i =0; i<N_JUDGES; i++) {
			values[i] = readDouble("? ");
		 avg += values[i];
		}
		avg = avg/N_JUDGES;
		println(avg);
	}
	

}