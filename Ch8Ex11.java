//the art and science of java chapter 8 exercise 11

import acm.program.*;
import java.util.*;

public class Ch8Ex11 extends ConsoleProgram{
	public void run() {
		println("This program encodes a message using a Caesar cipher");
		int shift = readInt("Enter the number of character positions to shift: ");
		String message = readLine("Enter a message: ");
	    println(encodeCaesarCipher(message,shift));
	}
	
	private String encodeCaesarCipher(String str, int shift) {
		String result = "";
		String nextToken = "";
		StringTokenizer tokenizer = new StringTokenizer(str,DEL,true);
		while(tokenizer.hasMoreTokens()) {
		String token = tokenizer.nextToken();
	    nextToken = wordReturner(token,shift);
	    result+=nextToken;
		}
		return result;
	}
	
	private String wordReturner(String token, int shift) {
		String words = "";
		int m = 0;
		for(int i = 0; i < token.length(); i++) {
			  char ch = token.charAt(i);
			  int n = (ch +shift);
			  if((n>=bL && n <= bL2 && isBigLetter(ch)) || (n>=sL && n<=sL2 && isSmallLetter(ch))){
	        	  ch = (char)n;
	    		  words +=ch;
			  }else if(n>sL2 && isSmallLetter(ch)){
				   m = n-sL2;
				     ch = (char)(sL -1 + m);
				     words+=ch;
			  }else if(n > bL2 && isBigLetter(ch)) {		
				     m = n - bL2;
				     ch = (char)(bL -1 + m);
				     words+=ch;
		       }else if(n <bL && isBigLetter(ch)) {
					   m = bL - n;
					     ch = (char)(bL2+1 - m);
					     words+=ch;
				   }else if(n<sL && isSmallLetter(ch)) {
					   m = sL - n;
					     ch = (char)(sL2 +1- m);
					     words+=ch;
				   }else {
					  words +=ch;
				   }
			  }
		return words;
	}
	private boolean isBigLetter(char ch) {
		int charn = ch;
		return (charn >= bL && charn <= bL2);
	}
	
	private boolean isSmallLetter(char ch) {
		int charn = ch;
		return (charn >= sL && charn <= sL2);
	}
	
	
	private static final String DEL = " ,.!@#$%;:'\"^&*()\\|/{[}]`~_+";
	private static final int sL = 'a';
	private static final int sL2 = sL + 25;
	private static final int bL ='A';
	private static final int bL2 = bL + 25;
	}


