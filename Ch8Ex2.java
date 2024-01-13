//the art and science of java chapter 8 exercise 2

import acm.program.*;
import acm.util.*;

public class Ch8Ex2  extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println("This program displays " + NUMBER + " random words.\n");
		for(int i =0; i <NUMBER; i++) {
		println(randomWord());
		}
	}
	
	private String randomWord() {
		String result = "";
		char randomLetter = 'a';
		int randomChar = 'a';
		int m = randomChar;
		int lettersamount = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
		for(int i = 0; i <lettersamount; i++) {
			randomChar = rgen.nextInt(m,m+25);
			randomLetter = (char)randomChar;
			result += randomLetter;
		}
		return result;
	}
	
	
	private static final int MIN_LETTERS = 5;
	private static final int MAX_LETTERS = 12;
	private static final int NUMBER = 5;
}


