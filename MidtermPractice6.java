
import acm.program.*;

public class MidtermPractice6  extends ConsoleProgram{
	
	public void run() {
		String line = readLine("Enter a sentence: ");
		String line2 = readLine("Enter second sentence: ");
		println(isCompatible(line,line2));
	}
	
	
	
	
	private boolean isCompatible(String line, String line2) {
		String anagram = reverseLine(line2);
		int n=0;
		for(int i =0; i<line.length(); i++) {
			char ch = line.charAt(i);
			if(anagram.charAt(i)!=ch) {
				n++;
			}
		}
		return n==1;
	}
	

	private String reverseLine(String word) {
		String wrd = "";
		for(int i =word.length()-1; i>=0;i--) {
			char ch = word.charAt(i);
			wrd+=ch;
		}
		return wrd;
	}
}
