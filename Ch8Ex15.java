//the art and science of java chapter 8 exercise 15

import acm.program.*;
import java.util.*;

public class Ch8Ex15  extends ConsoleProgram{
	public void run() {
		String line = readLine("Enter a line: ");
		println("The longest word is \"" + longestWord(line) + "\"");
	}
	
	private String longestWord(String line) {
		String word = "";
		String token = "";
		int n = 0;
		int m = 0;
		StringTokenizer tokenizer = new StringTokenizer(line, DEL, false);
		while(tokenizer.hasMoreTokens()) {
			token = tokenizer.nextToken();
			n = token.length();
			if(n > m) {
				m = token.length();
				word = token;
			}
		}
		return word;
	}
	
	
	private static final String DEL = ",.?.,1@#$%^&*()-=)(+_\";: }{[]~` ";
	
}
	
