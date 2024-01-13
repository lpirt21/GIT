//the art and science of java chapter 8 exercise 3

import acm.program.*;
import acm.util.*;

public class Ch8Ex3  extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		String str = readLine("Enter a word: ");
		println(capitalize(str));
	}
	
	private String capitalize(String str) {
		String result = "";
		char ch = str.charAt(0);
		if(Character.isLetter(ch)) {
			ch = Character.toUpperCase(ch);
		}
	   for(int i = 1; i<str.length(); i++) {
			char otherChars = str.charAt(i);
			otherChars = Character.toLowerCase(otherChars);
		    result = result+otherChars;
			}
		return ch + result;
		
	}
}



