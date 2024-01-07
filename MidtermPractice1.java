
import acm.program.*;

public class MidtermPractice1 extends ConsoleProgram{

	public void run() {
		String line = readLine("Enter String: ");
		println("The most used letter is: " + mostUsedLetter(line));
	}
	
	private char mostUsedLetter(String line) {
		int n = 0;
		int m = 0;
		char mostUsed = '0';
		for(int i =0; i< line.length(); i++) {
			char ch = line.charAt(i);
			if(Character.isLetter(ch)) {
			ch = Character.toLowerCase(ch);
			for(int j = 0; j<line.length();j++) {
				char ch2 = Character.toLowerCase(line.charAt(j));
				if(ch2 == ch) {
					n++;
				}
			}
		}
		if(n>m) {
			m = n;
			mostUsed = ch;
		}
		n=0;
		}
		mostUsed = Character.toLowerCase(mostUsed);
		return mostUsed;
	}
}

