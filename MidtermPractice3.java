
import java.util.StringTokenizer;
import acm.program.*;

public class MidtermPractice3 extends ConsoleProgram{

	
	public void run() {
		String line = readLine("Enter String: ");
		println(line + "-->"  + changeSentence(line));
	}
	
	private String changeSentence(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line," ,.",true);
		String newSentence = "";
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			newSentence+=correctWord(token);
		}
		return newSentence;
	}
	
	private String correctWord(String word) {
		String wrd = "";
		char ch = Character.toUpperCase(word.charAt(0));
		wrd+=ch;
		for(int i =1; i<word.length();i++) {
			char ch2 = Character.toLowerCase(word.charAt(i));
			wrd+=ch2;
		}
		return wrd;
	}

}
