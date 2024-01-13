//the art and science of java chapter 8 exercise 6

import acm.program.*;
import acm.util.*;


public class Ch8Ex6 extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println("This program figures out whether the word you enter is a palindrom or not.");
		String str = readLine("Enter the word: ");
		println(palindrome(str));
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
	
}


