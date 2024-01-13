//the art and science of java chapter 4 exercise 9

import acm.program.*;

public class Ch4Ex9 extends ConsoleProgram{
	
	private static final int START =15;
	
	public void run() {
		int f0 = 0;
		int f1 = 1;
		println("f0 = " + f0);
		println("f1 = " + f1);
		int fi =0;
		for(int i = 2; i<=START; i++) {
			fi = f0+f1;
			println("f" + i + " = " + fi);
			f0=f1;
			f1 = fi;
		}
	}
	
}
