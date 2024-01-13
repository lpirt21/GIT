//the art and science of java chapter 4 exercise 10

import acm.program.*;

public class Ch4Ex10 extends ConsoleProgram{
	
	private static final int FINISH =10000;
	
	public void run() {
		int f0 = 0;
		int f1 = 1;
		println("f0 = " + f0);
		println("f1 = " + f1);
		int fi =0;
		int i = 2;
		while(true) {
			fi = f0+f1;
			if(fi >= FINISH)break;
			println("f" + i + " = " + fi);
			i++;
			f0=f1;
			f1 = fi;
		}
	}
	
}