//the art and science of java chapter 4 exercise 8

import acm.program.*;

public class Ch4Ex8 extends ConsoleProgram{
	
	private static final int START =10;
	
	public void run() {
		int n =START;
		while(n>=0) {
			println(n);
			n--;
		}
		println("Liftoff!");
	}
	
}