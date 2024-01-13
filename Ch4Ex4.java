//the art and science of java chapter 4 exercise 4

import acm.program.*;

public class Ch4Ex4 extends ConsoleProgram{
	
	public void run() {
		for(int i = 0; i <= 100; i++) {
			if(((i %6 == 0)&&(i % 7 !=0)) || ((i % 7 ==0)&& (i%6 !=0))) {
				println(i);
			}
		}
	}
}