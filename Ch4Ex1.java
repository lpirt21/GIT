//the art and science of java chapter 4 exercise 1

import acm.program.*;

public class Ch4Ex1 extends ConsoleProgram {
	
	private static final int BEER = 99;
	
	public void run() {
      	 println("This program will post the lyrics of Bottles on the "
				+ "Wall till it reaches zero.\n");
		
		 for(int i = BEER; i > 0; i--) {
			 println(i + " bottle" + ((i == 1) ? "" : "s") +" of beer on the wall.\n"
					 + i + " bottle" +((i == 1) ? "" : "s") + " of beer.\n"
					 + "You take one down, pass it around.\n"
					 + (i-1) + " bottle" +((i-1 == 1) ? "" : "s") + " of beer on the wall.\n"); 
		 }
	}
}