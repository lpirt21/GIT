//the art and science of java chapter 7 exercise 1

import acm.program.*;

public class Ch7Ex1 extends ConsoleProgram{
	
	public void run() {
		println("This program converts hexadecimal to decimal.\n" +
				"Enter " + SENTINEL +" to stop.");
		while(true) {
			String que = readLine("Enter a hexadecimal number: ");
			if(Integer.toString(SENTINEL).equals(que))break;
			for(int i = 0; i <=1000000; i ++) {
				if(Integer.toString(i,16).equalsIgnoreCase(que)) {
					println(que + " hex = " + i + " decimal");
				}
			}
		}
	}

	private static final int SENTINEL = 0;
}
