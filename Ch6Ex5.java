//the art and science of java chapter 6 exercise 5

import acm.program.*;
import acm.util.*;

public class Ch6Ex5 extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int init = 50;
		if(askForInstructions("Would you like instructions? ")) {
			println("The instruction manual is on page 7!");
			if(wannaPlay("You have $" + init + "." + "Would you like to play? ")) {
			   playTheGame();
			}
		}else if(wannaPlay("You have $" + init + "." + "Would you like to play? ")) {
				playTheGame();
	    }
	}

	
	private boolean askForInstructions(String str) {
		  String answer = readLine(str);
		  while(!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes")) {
			  println("please answer yes or no.");
			  answer = readLine(str);
		  }
		  return answer.equalsIgnoreCase("yes");
	}
	
	
	private boolean wannaPlay(String str) {
		String answer = readLine(str);
		while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
			println("Please answer yes or no.");
			answer = readLine(str);
		}
		return answer.equalsIgnoreCase("yes");
	}
	
	
	private void playTheGame() {
		int init = 49;
		while(init>=0) {
			int n = rgen.nextInt(1,6);
	        int m = rgen.nextInt(1,6);
	    	int k = rgen.nextInt(1,6);
	    	init = returnInit(n,m,k,init);
			returnBARS(n,m,k);
			if(!wannaPlay("You have $" + init + "." + "Would you like to play? "))break;
			init--;
			if(init == 0) {
				println("I'm sorry you can't play anymore");
				break;
			}
			
			
		}
	}
	

	private void returnBARS(int n,int m, int k) {
	    	 println(returnSymbol(n) + " " + returnSymbol(m) + " " + returnSymbol(k) + " --  " + winLose(n,m,k));
		 }
	
	private int returnInit(int n, int m, int k, int init) {
		if(n ==1 && m ==1 && k==1) {
 			return init+=250;
 		}else if(n == 2 && m ==2 && (k==1 || k==2)) {
 			return init+=20;
 		}else if(n==3 && m == 3 && (k == 3 || k==1)) {
 			return init+=14;
 		}else if(n==4 && m ==4 && (k == 4 || k ==1)) {
 			return init+=10;
 		}else if(n==5 && m == 5 && k ==5) {
 			return init+=7;
 		}else if(n == 5 && m == 5) {
 			return init+=5;
 		}else if(n ==5) {
 			return init+=2;
 		}else {
 			return init;
 		}
	}
	
	
	private String winLose(int n,int m,int k) {
		if(n ==1 && m ==1 && k==1) {
			return "You win $250";
		}else if(n == 2 && m ==2 && (k==1 || k==2)) {
			return "You win $20";
		}else if(n==3 && m == 3 && (k == 3 || k==1)) {
			return "You win $14";
		}else if(n==4 && m ==4 && (k == 4 || k ==1)) {
			return "You win $10";
		}else if(n==5 && m == 5 && k ==5) {
			return "You win $7";
		}else if(n == 5 && m == 5) {
			return "You win $5";
		}else if(n ==5) {
			return "You win $2";
		}else {
		return "You lose";
		}
		
	}
	
	
     private String returnSymbol(int n) {
	     switch(n) {
	     case 1 : return("BAR   ");
	     case 2 : return("BELL  ");
	     case 3 : return("PLUM  ");
	     case 4 : return("ORANGE  ");
	     case 5 : return("CHERRY  ");
	     case 6 : return("LEMON  ");
	     default : return"";
	     }
	}
     
     
}
