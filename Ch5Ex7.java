//the art and science of java chapter 5 exercise 7

import acm.program.*;

public class Ch5Ex7 extends ConsoleProgram {

	
	public void run() {
			if(askQuestion("Would you like instructions? ")) {
				println("The instruction manual is at page 4");	
			}else {
				println("Alright!");	
			}
	}
	
	private boolean askQuestion(String text) {
		 String question = readLine(text);
		while(question.equalsIgnoreCase("yes") || question.equalsIgnoreCase("no")) {
			println("Please answer yes or no");
			question = readLine(text);
		}
		 return question.equalsIgnoreCase("yes");
	}
}
