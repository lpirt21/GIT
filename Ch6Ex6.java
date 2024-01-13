//the art and science of java chapter 6 exercise 6

import acm.program.*;
import acm.util.*;

public class Ch6Ex6  extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
    
	public void run() {
		println("Welcome to Math Quiz");

	for(int i = 0; i<AMOUNT; i++) {
		int n = rgen.nextInt(0,20);
		int m = rgen.nextInt(0,20);
		boolean plm = rgen.nextBoolean();
		if(plm) {
			while(n+m >20){
				n = rgen.nextInt(0,20);
				m = rgen.nextInt(0,20);
			}
			String n1 = "" + (n+m);
			quiz(n,m,plm,n1);
			}else {
				if(n-m<0) {
				n=m;
				m=n;
				}
			String n2 = "" + (n-m);
			quiz(n,m,plm,n2);
			}
	}
}
	
	
    public void quiz(int a, int b,boolean plm, String n1) {
    	String question = readLine("What is " + a + (plm? " + " : " - ") + b + "? ");
    	if(question.equals(n1)){
			println("That's the answer");
		}else if(!question.equals(n1)) {
			question = readLine("That's incorrect - try a different answer: ");
			if(question.equals(n1)) {
				println("That's the answer");
			}else if(!question.equals(n1)) {
			question = readLine("That's incorrect - try a different answer: ");
				if(question.equals(n1)) {
				println("That's the answer");
				}else {
					println("No the answer is " + n1);
				}
			 }
		}
    }
	
    private static final int AMOUNT = 5;
}

