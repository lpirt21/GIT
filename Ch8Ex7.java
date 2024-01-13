//the art and science of java chapter 8 exercise 7

import acm.program.*;
import acm.util.*;
import java.util.*;

public class Ch8Ex7  extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println("This program figures out whether the word you enter is a palindrom or not.");
		while(true) {
		String str = readLine("Enter the word: ");
		if((palindrome(isSentencePalindrome(str)))) {
			println("That sentence is a palindrome.");
		}else {
			println("That sentence is not a palindrome.");
		}
		}
	}
	
	

   	
   	private String isSentencePalindrome(String str) {
   		String line = "";
   		StringTokenizer tokenizer = new StringTokenizer(str,DEL,false);
   		String token = "";
   		while(tokenizer.hasMoreTokens()) {
   			token = tokenizer.nextToken();
   			line+=token;
   		}
   		return line;
   	}
   	
   	

   	private boolean palindrome(String str) {
   		if(str.length()%2 == 0) {
   			for(int i = 0; i <str.length()/2; i++) {
   				return (str.charAt(str.length()/2-i) == str.charAt(str.length()/2 -1 +i));
   			}
   		}else if(str.length()%2 != 0){
   			for(int i = 0; i < str.length()/2 +1; i++) {
   				return (str.charAt(str.length()/2-i) == str.charAt(str.length()/2+i));
   			}
   		}
		return false;
   	
   	}	
	
   	private static final String DEL = " .,'\"[{?!@#$%^&(*)_+;:-=}]| ";
   	
}
