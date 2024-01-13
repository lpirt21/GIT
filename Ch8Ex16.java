//the art and science of java chapter 8 exercise 16

import acm.program.*;
import java.util.*;

public class Ch8Ex16 extends ConsoleProgram{
	public void run() {
		while(true) {
		String line = readLine("Enter a line: ");
		println("The acronym is \"" + acronym(line) + "\"");
		}
	}
	
	private String acronym(String line) {
		String word = "";
		String token = "";
		StringTokenizer tokenizer = new StringTokenizer(line, DEL, false);
		while(tokenizer.hasMoreTokens()) {
			token = tokenizer.nextToken();
			if(isWord(token)) {
			word += token.charAt(0);
			}
		}
		return word;
	}
	
	private boolean isWord(String token) {
		for(int i = 0; i<token.length(); i++) {
			char ch = token.charAt(i);
			if(!Character.isLetter(ch))return false;
		}
		return true;
	}
	
	private static final String DEL = ",.?.,@#$%^&*()-=)(+_\";: }{[]~` ";
	
}

