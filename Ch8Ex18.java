//the art and science of java chapter 8 exercise 18

import acm.program.*;
import java.util.*;

public class Ch8Ex18 extends ConsoleProgram{
	public void run() {
		println("This program translates line into Pig Latin.");
		String line = readLine("Enter a line: ");
		println(translateLine(line));
	}
	
	
	private String translateLine(String line) {
		String result = "";
		StringTokenizer tokenizer  = new StringTokenizer(line, DELIMETERS, true);
		while(tokenizer.hasMoreTokens()) {
	             String token = tokenizer.nextToken();
	             if(isWord(token)) {
	            	 token = translateWord(token);
	             }
	             result+=token;
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
	    	  String head = word.substring(0,vp);
	    	  String end ="";
	    	  String head2 = "";
	    	  char h = Character.toLowerCase(head.charAt(0));
	    	  for(int i = 1; i <head.length(); i++) {
	    		  char ead = (Character.toLowerCase(head.charAt(i)));
	    		  end+=ead;
	    		  head2 = h+end; 
	    	  }	
	    	  String tail = word.substring(vp);
	    	  String fin = "";
	    	  String tail2 = "";
	    	  char t = Character.toUpperCase(tail.charAt(0));
	    	  for(int i = 1; i <tail.length(); i++) {
	    	      char ail = (tail.charAt(i));
	    		  fin+=ail;
	    		  tail2 = (Character.isUpperCase(head.charAt(0)) ? t : tail.charAt(0))+fin; 
	    	  }
	    	  
	    	  if(tail.length() ==1 && head.length() == 1){
	    		  return ""+ (Character.isUpperCase(head.charAt(0)) ? t : tail.charAt(0))  + h +"ay"; //t+h made numbers also first if check should be both lengths
	    	  }else if(tail.length()==1) {
	    	    return (Character.isUpperCase(head.charAt(0)) ? t : tail.charAt(0)) + head2 + "ay";
	    	  }else if(head.length() == 1) {
	    		  return tail2 + h + "ay";
	    	  }else {
	               return tail2 + head2 + "ay";
	    	  }
	      }
		
	}
	
	private int findFirstVowel(String word) {
	   for(int i = 0; i < word.length(); i++) {
		   if(isEnglishVowel(word.charAt(i))) return i;
		   }
	   return -1;
	}


	private boolean isEnglishVowel(char ch) {
		 switch(Character.toLowerCase(ch)) {
		 case 'a' : case 'e' : case 'i' : case 'o' : case 'u': return true;
		 default : return false; 
		 }
	}
	
	private boolean isWord(String token) {
		for(int i =0; i < token.length(); i++) {
			char ch = token.charAt(i);
			if(!Character.isLetter(ch)) return false;
		}
		return true;
	}
	
	private static final String 
	DELIMETERS = "!,.&*^%$@#*()/\"':;{?}[>]|_-=+~`<\\ ";
}






