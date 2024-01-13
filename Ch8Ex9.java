//the art and science of java chapter 8 exercise 9

import acm.program.*;
import acm.util.*;

public class Ch8Ex9 extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println("This program writes the verbs you enter in a present participle.\n");
		while(true) {
		String str = readLine("Enter a verb: ");
		println("The present participle of the " +str + " is " + createPresentParticiple(str));
		}
	}
	
	
	
	private String createPresentParticiple(String str) {
		String result = "";
		int n = str.length()-1;
		if(str.charAt(n) == 'e' && !isVowel(str.charAt(n-1))) {
			result += str.substring(0,n) + "ing";
			return result;
		}else if(str.charAt(n) == 'e' && isVowel(str.charAt(n-1))) {
			result += str + "ing";
			return result;
		}else if(isVowel(str.charAt(n-1)) && !isVowel(str.charAt(n))) {
			result += str + str.charAt(n) + "ing";
			return result;
		}else {
			result += str + "ing";
			return result;
		}
		
		
	}
	
	private boolean isVowel(char thechar) {
		char ch = Character.toLowerCase(thechar);
		switch(ch) {
		case 'a' : case 'e' : case 'i' : case 'o' : case 'u': return true;
		default : return false;
			}
	}
}
