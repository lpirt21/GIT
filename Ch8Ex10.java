//the art and science of java chapter 8 exercise 10

import acm.program.*;



public class Ch8Ex10  extends ConsoleProgram{
	
	public void run() {
		println("This prigram writes the ordinal form of a number you enter.");
		while(true) {
		int n = readInt("Enter a number: ");
		println("The ordinal of " + n + " is " + createOrdinalForm(n));
		}
	}
	
	private String createOrdinalForm(int n) {
	    String num = Integer.toString(n);
		int substr = num.length() - 2;
		int lastTwo = 0;
		String lastOne = "";
		if(n>0 && n < 9) {
			return n + theEnding(num);
		}else if(n >9){
			String cut = num.substring(substr);
			lastTwo = Integer.parseInt(cut);
			lastOne = (cut.substring(1));
			if(lastTwo > 9 && lastTwo< 21) {
				return n + "th";
			}else {
				return n + theEnding(lastOne); 
			}
		}
		return "";
	}
	
	private String theEnding(String lastn) {
		int n = Integer.parseInt(lastn);
		switch(n){
		case 1 : return "st";
		case 2 : return "nd";
		case 3 : return "rd";
		default: return "th";
		}
	}
}

