//the art and science of java chapter 3 exercise 9

import acm.program.*;

public class Ch3Ex9 extends ConsoleProgram {
	
	/* private constant */
	private static final int theTotalAmount = 2801;
	
	public void run () {
		println("I was going to the St. Ives and i want to know /n" +
				"what is the amount of people, animals and things going to the opposite direction. \n");
		
		println("As I was going to the St. Ives \n" +
				"I met a man with seven wives \n" +
				"Each wife had seven sacks \n " +
				"Each sack had seven cats \n " +
				"Each cat had seven kits \n " +
				"Kits, cats, sacks, wives \n " +
				"How many were going to St. Ives \n");
		
		int people = readInt("How many people were going to St. Ives? ");
		int wives = readInt("How many wives did the man have? ");
		int sacks = readInt("How many sack did each wife have? ");
		int totalsacks = wives * sacks;
		int cats = readInt ("How many cats did each sack have? ");
		int totalcats = totalsacks * cats;
		int kits = readInt("how many kits did each cat have? ");
		int totalkits = totalcats * kits;
		int total = people + totalsacks + totalcats + totalkits;
		
		println("The amount of people not going to the St. Ives is " + total);
		
		if(total == theTotalAmount) {
			println("The total is " + total + "Congratulations you got it right!");
		} else {
			println("Sorry incorrect number, try again. \n " +
					"(Hint) Pay attention to the man in case you forgot him.");
		}
		
	}
	
}
		