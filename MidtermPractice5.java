
import java.util.StringTokenizer;
import acm.program.*;

public class MidtermPractice5 extends ConsoleProgram{
	
	public void run() {
		String line = readLine("Enter a sentence: ");
		String line2 = readLine("Enter second sentence: ");
		println(isCompatible(line,line2));
	}
	
	private boolean isCompatible(String line, String line2) {
		char ch = '/';
		int n=0;
		int m=0; 
		boolean flag = true;
		for(int i =0; i<line.length(); i++) {
			ch = line.charAt(i);
			n = countChars(line,i);
			for(int j =0; j<line2.length(); j++) {
				if(line2.charAt(j) == ch) {
					m = countChars(line2,j);
				}
			}
			if(m!=n) {
				flag = false;
			}
		}
		return flag;
	}
	
	private int countChars(String line,int i) {
		int n = 0;
		char ch = line.charAt(i);
			for(int j = 0; j<line.length();j++) {
				char ch2 = line.charAt(j);
				if(ch2 == ch) {
					n++;
				}
			}
		return n;
	}
	

}
