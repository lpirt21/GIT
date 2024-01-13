//the art and science of java chapter 8 exercise 12

import acm.program.*;

public class Ch8Ex12 extends ConsoleProgram{
	public void run() {
		println("This program adds two integers.");
		String n1 = readLine("Enter n1: ");
		int n3 =0;
		int n4 = 0;
		while(!isAllowed(n1)) {
			println("Illegal integer format");
			n1 = readLine("Enter n1:");
			if(isAllowed(n1)){
				n3 = Integer.parseInt(n1);
			}
		}
		String n2 = readLine("Enter n2: ");
		while(!isAllowed(n2)) {
			println("Illegal integer format");
			n2 = readLine("Enter n2:");
			if(isAllowed(n2)){
				n4 = Integer.parseInt(n2);
			}
		}
		println("The total is " +(n3+n4));
	}
		
	
	private boolean isAllowed(String prompt) {
		int n =0;
		for(int i = 0; i < prompt.length(); i++) {
			if(Character.isDigit(prompt.charAt(i))) {
				n++;
			}
		}
	   return ((n == prompt.length()));
		}
	}
	