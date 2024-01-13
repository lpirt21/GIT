//the art and science of java chapter 8 exercise 1

import acm.program.*;
import java.util.*;

public class Ch8Ex1  extends ConsoleProgram{
	public void run() {
		println("This program writes all the upper case consonants");
		println(writeAllConsonants());
	}
	
	private String writeAllConsonants() {
	     char ch = 'A';
	     String allCons = "";
	     int num = ch;
	     for(int i = 0; i <'Z'-'A'; i++) {
	    	 ch = (char)(num+i);
	    	 if(isEnglishConsonant(ch)) {
	    	 allCons = allCons+=ch;
	    	 }
	     }
	     return allCons;
	}

	private boolean isEnglishConsonant(char c) {
		char ch = Character.toLowerCase(c);
		switch(ch) {
		case 'a' : case 'i' : case 'o' : case 'e' : case 'u' : return false;
		default : return true;
		}
	}
}



