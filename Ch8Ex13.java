//the art and science of java chapter 8 exercise 13

import acm.program.*;
import acm.util.*;

public class Ch8Ex13  extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		while(true) {
			String digits = readLine("Enter a number: ");
			if(digits.length()==0)break;
			println(addCommas(digits));
		}
	}
	
	private String addCommas(String str) {
		int n = str.length();
		int m=0;
		String correct = "";
		if(n<=3) {
			return str;
		}else {
			if(n%3 == 0) {
				for(int i=0;i<str.length(); i++) {
					m++;
					correct += str.charAt(i);
					if(m%3==0 && (i!=str.length()-1)) {
						correct+=",";
					}
				}
			}
			m=0;
			if(n%3 ==1) {
				for(int i=0;i<str.length(); i++) {
					m++;
					correct += str.charAt(i);
					if(m%3==1&&(i!=str.length()-1)) {
						correct+=",";
					}
				}
			}
			m=0;
			if(n%3 ==2) {
				for(int i=0;i<str.length(); i++) {
					m++;
					correct += str.charAt(i);
					if(m%3==2 && (i!=str.length()-1)) {
						correct+=",";
					}
				}
			}
		}
		return correct;
	}
}


