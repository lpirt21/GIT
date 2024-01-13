//the art and science of java chapter 8 exercise 14

import acm.program.*;

public class Ch8Ex14 extends ConsoleProgram{
	public void run() {
		println("This program converts numbers to words");
		while(true) {
		String str = readLine("Enter a number: ");
		int num = Integer.parseInt(str);
		if(num <0)break;
		int a = num %10;
		int b = (num %100 -a)/10;
		int c =(num %1000- b -a)/100;
		int d = (num %10000 - c -b -a)/1000;
		int e = (num %100000 -d-c-b-a)/10000;
		int f = (num %1000000 - e-d-c-b-a)/100000;
		if(str.length()==1) {
			zero(a);
		}else if(str.length()==2) {
			println(ateuliocidan(b,a));
		}else if(str.length() == 3) {
			println(aseuli(c,b,a));
		}else if(str.length() == 4) {
			println(ataseuli(d,c,b,a));
		}else if(str.length() == 5) {
			println(atiataseuli(e,d,c,b,a));
		}else if(str.length() == 6) {
			println(asiataseuli(f,e,d,c,b,a));
		}
		}
	}
	
	private void zero(int a) {
		if(a==0) { 
		println("zero");
		}else {
			println(erteuli(a));
		}
	}
	
	
	private String asiataseuli(int f, int e, int d, int c, int b, int a) {
		switch(f) {
			default : return aseuli(f, e,d) + " thousand "+ aseuli(c,b,a);
		}
	}
	
	private String atiataseuli(int e, int d, int c, int b, int a) {
		switch(e) {
			default : return ateuliocidan(e,d) + " thousand " + aseuli(c,b,a);
		}
	}
	
	
	private String ataseuli(int d, int c, int b, int a) {
		switch(d) {
		default : return erteuli(d) + " thousand " + aseuli(c,b,a); 
		}
		
	}
	
	
	private String aseuli(int c, int b,int a) {
	  switch(c) {	
	  	default: return erteuli(c) + " hundred " + ((ateuliocidan(b,a).equals("") ? erteuli(a) : ateuliocidan(b,a)));
	  }
	}
	
	
	private String ateuliocidan(int b, int a) {
		switch(b) {
		case 1 : return ateuliocamde(a);
		case 2: return "twenty" + ((a == 0)? "" : "-") +erteuli(a);
		case 3: return "thirty" + ((a == 0)? "" : "-") +erteuli(a);
		case 4: return "forty" + ((a == 0)? "" : "-") +erteuli(a);
		case 5: return "fifty" + ((a == 0)? "" : "-") +erteuli(a);
		case 6: return "sixty" + ((a == 0)? "" : "-") +erteuli(a);
		case 7: return "seventy" + ((a == 0)? "" : "-") +erteuli(a);
		case 8: return "eightty" + ((a == 0)? "" : "-") +erteuli(a);
		case 9: return "ninety" + ((a == 0)? "" : "-") +erteuli(a);
		default: return "";
		}
	}
		
		
	private String ateuliocamde(int b) {
		switch(b) {
		case 0: return "ten";
		case 1: return "eleven";
		case 2: return "twelve";
		case 3: return "thirteen";
		case 4: return "fourteen";
		case 5: return "fifteen";
		case 6: return "sixteen";
		case 7: return "seventeen";
		case 8: return "eightteen";
		case 9: return "nineteen";
		default: return "";
		}
	}
		
	private String erteuli(int a) {
		switch(a) {
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		case 0: return "";
		default: return "";
		}
		
		
	}
	
}
	


