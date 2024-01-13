//the art and science of java chapter 8 exercise 17

import acm.program.*;


public class Ch8Ex17  extends ConsoleProgram{
	public void run() {
		println("This program translates to Pig Latin.");
		String line = readLine("Enter a line: ");
		println(translateLine(line));
		
	}
	
	
	
	
	private String translateLine(String line) {
		String result = "";
		String word = "";
		String word2 = "";
	      for(int i = 0; i < word2.length(); i++) {
	    	  if(Character.isWhitespace(word2.charAt(i))) {
	    		  word = word2.substring(0,i);
	    		  word = translateWord(word);
	    		  result +=word;
	    		  word2 = word2.substring(i-1);
	    		  result += word2.charAt(i);
	    	  }
	      }
		return result;
	}
	
	
	private String translateWord(String word) {
		int vp = findFirstVowel(word);
		if(vp == -1) {
			return word;
		}else if(vp == 0) {
			return word + "way";
		}else {
			String head = word.substring(vp);
			String tail = word.substring(0,vp);
			return head + tail + "ay";
		}
	}
	
	
	
	private int findFirstVowel(String word) {
		for(int i = 0; i < word.length(); i++) {
			if(isEnglishVowel(word.charAt(i))) return i;
		}
		return -1;
	}
	
	
	boolean isEnglishVowel(char ch) {
		switch(ch) {
		case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : return true;
		default : return false;
		}
	}
	
}
	