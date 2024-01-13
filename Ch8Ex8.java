//the art and science of java chapter 8 exercise 8

import acm.program.*;
import acm.util.*;

public class Ch8Ex8  extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println("This program writes the word you enter in its plural form.");
		while(true) {
		String str = readLine("Enter the word: ");
		println("The plural of " + str + " is " +createRegularPlural(str));
		}
	}
  


      private String createRegularPlural(String word) {
        	int n = word.length();
        	char ch = word.charAt(n-1);
        	String two = word.substring(n-2);
        	String result = "";
        	if(ch =='s' ||ch =='x' ||ch =='z') {
        		result += word + "es";
        		return result;
        	}else if(two.equals("ch") || two.equals("sh")){
        		result += word + "es";
        		return result;
        	}else if(ch == 'y') {
        		result += word.substring(0, n-1) + "ies";
        		return result;
        	}else {
        		return word + "s";
        	}
        }
}

