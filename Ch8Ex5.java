//the art and science of java chapter 8 exercise 5

import acm.program.*;
import acm.util.*;


public class Ch8Ex5  extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		String str = "FARM";
		int n = 0;
		int res = 0;
		for(int i = 0; i <str.length(); i++) {
		    char ch = str.charAt(i);
		     if(Character.isUpperCase(ch)) {
		    	 if(onee(ch,oneScore)) {
		 			n = 1;
		 		}else if(onee(ch,twoScore)) {
		 			n = 2;
		 		}else if(onee(ch,threeScore)){
		 			n=3;
		 		}else if(onee(ch,fourScore)){
		 			n=4;
		 		}else if(onee(ch,fiveScore)){
		 			n=5;
		 		}else if(onee(ch,sixScore)){
		 			n=6;
		 		}else if(onee(ch,sevenScore)){
		 			n=7;
		 		}
		     }else {
		 			n=0;
		 		}
		     res+=n;
		     
		}
		println(res);
	}
	
	private boolean onee(char ch,String str) {
	   for(int i =0; i<str.length(); i++) {
		    if(str.charAt(i) == ch){
		    	return true;
		   }
	   }
	   return false;
	}
	
	
	private String oneScore = "AEILNORSTU";
	private String twoScore = "DG";
	private String threeScore = "BCMP";
	private String fourScore = "FHVWY";
	private String fiveScore = "K";
	private String sixScore = "JX";
	private String sevenScore = "QZ";
   	
}	
	
	
	
	
	