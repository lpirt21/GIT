//the art and science of java chapter 11 exercise 8

import acm.program.*;
import java.util.*;

public class Ch11Ex8 extends ConsoleProgram {

	public void run() {
		println("This program converts the sentence you enter to a morse code");
		println("Enter a blank line to indicate the end of the text");
			String line = readLine("Enter a sentence: ");
			StringTokenizer tokenizer = new StringTokenizer(line, " ",true);
			while(tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				token = takeString(token);
				translate(token);
			}
	}
	
	private String takeString(String line) {
		String word = "";
		for(int i =0; i<line.length();i++) {
			char ch = line.charAt(i);
			if(Character.isLetter(ch)) {
				ch = Character.toUpperCase(ch);
			}
			word +=ch;
	    }
		return word;
	}
	
	
	private void translate(String line) {
		String letter = "";
		String word = "";
		for(int i=0; i<line.length(); i++) {
			char ch = line.charAt(i);
			switch(ch) {
				case 'A' : letter =".- "; break;
				case 'B' : letter ="-... ";break;
				case 'C' : letter ="-.-. ";break;
				case 'D' : letter ="-.. ";break;
				case 'E' : letter =". ";break;
				case 'F' : letter ="..-. ";break;
				case 'G' : letter ="--. ";break;
				case 'H' : letter =".... ";break;
				case 'I' : letter =".. ";break;
				case 'J' : letter =".--- ";break;
				case 'K' : letter ="-.- ";break;
				case 'L' : letter =".-.. ";break;
				case 'M' : letter ="-- ";break;
				case 'N' : letter ="-. ";break;
				case 'O' : letter ="--- ";break;
				case 'P' : letter =".--. ";break;
				case 'Q' : letter ="--.- ";break;
				case 'R' : letter =".-. ";break;
				case 'S' : letter ="... ";break;
				case 'T' : letter ="- ";break;
				case 'U' : letter ="..- ";break;
				case 'V' : letter ="...- ";break;
				case 'W' : letter =".-- ";break;
				case 'X' : letter ="-..- ";break;
				case 'Y' : letter ="-.-- ";break;
				case 'Z' : letter ="--.. ";break;
			}
			word+=letter;
		}
		println(word);
	}
	
}
