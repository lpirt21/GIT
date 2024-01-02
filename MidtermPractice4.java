
import java.util.StringTokenizer;
import acm.program.*;

public class MidtermPractice4 extends ConsoleProgram{
	
	public void run() {
		String line = readLine("Enter String: ");
		println(line + " --> "  + changeSentence(line));
	}
	
	private String changeSentence(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line," ,.",true);
		String newSentence = "";
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			newSentence+=reverseWord(token);
		}
		return newSentence;
	}
	
	private String reverseWord(String word) {
		String wrd = "";
		for(int i =word.length()-1; i>=0;i--) {
			char ch = word.charAt(i);
			wrd+=ch;
		}
		return wrd;
	}
}

