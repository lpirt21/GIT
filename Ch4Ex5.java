//the art and science of java chapter 4 exercise 5

import acm.program.*;

public class Ch4Ex5 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run() {
		int total =0;
		int n = 1;
		int value = readInt("pupil number " + n + " result : ");
		
		while(value!=SENTINEL) {
			total+=value;
			n++;
			value = readInt("pupil number " + n + " result : ");
		}
		double avg =(double)(total)/n;
		println("The average is " + avg);
	}
	
}