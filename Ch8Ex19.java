//the art and science of java chapter 8 exercise 19

import acm.program.*;


public class Ch8Ex19  extends ConsoleProgram{
	public void run() {
		while(true) {
			String word = readLine("Enter a word: ");
			if(word.equals(""))break;
			println(word + " -> " + obenglobish(word));
		}
	
	}
	
	
	private String obenglobish (String word) {
        String result = "";
        if (isEnglishVowel(word.charAt(0))){
        	result = result + "ob" + word.charAt(0);
        }else {
        	result+=word.charAt(0);;
        }

        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if ((isEnglishVowel(c) && (!isEnglishVowel(word.charAt(i-1))))) {
            	if(c == 'e')break;
            	result = result + "ob" + c;
            }
            else result += c;
        }
        
        
       if(word.charAt(word.length()-1) == 'e') {
    	   return result + (isEnglishVowel(word.charAt(word.length()-2))? "" : "e");
       }else {
          return result;
       }
    }
	
	private boolean isEnglishVowel(char ch) {
		 switch(Character.toLowerCase(ch)) {
		 case 'a' : case 'e' : case 'i' : case 'o' : case 'u': return true;
		 default : return false; 
		 }
	}
	
	
	
}
