//the art and science of java chapter 6 exercise 1

import acm.program.*;
import acm.util.*;

public class Ch6Ex1 extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
        println("This program displays a randomly chosen card.");
        int r = rgen.nextInt(1,13);
        int s = rgen.nextInt(1,4);
        println(rank(r) + " of " + suit(s));
	}
	
	private String rank(int n) {
		  switch(n) {
	        case 1 : return "Ace";
	        case 11 : return "Jack";
	        case 12 : return "Queen";
	        case 13 : return "King";
	        default : return "" +n;
	        }
	}
	
	private String suit(int n) {
		  switch(n) {
	        case 1 : return "Clubs";
	        case 2 : return "Diamonds";
	        case 3 : return "Hearts";
	        case 4 : return "Spades";
	        default : return "";
	        }
    }      
	
}
