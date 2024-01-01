
import acm.program.*;

public class MidtermPractice2 extends ConsoleProgram{
	
	public void run() {
		String line = readLine("Enter String: ");
		println(isLinedUp(line));
	}
	
	private boolean isLinedUp(String line) {
		int n = 0;
		int m = 0;
		boolean flag = true;
		for(int i =0; i<line.length(); i++) {
			char ch = line.charAt(i);
			if(Character.isLetter(ch) && Character.isLowerCase(ch)) {
				n=ch;
				for(int j = i+1; j<line.length();j++) {
					char ch2 = line.charAt(j);
					if(Character.isLetter(ch2) && Character.isLowerCase(ch2)){
						m=ch2;
							if(m<n) {
								flag = false;
							}
					}	
				}
			}
		}
		return flag;
	}

}
