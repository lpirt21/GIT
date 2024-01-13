//the art and science of java chapter 4 exercise 2

import acm.program.*;

public class Ch4Ex2 extends ConsoleProgram{
	
	public void run() {
		for(int i = 1; i<=10; i++) {
			println("This old man, he played " + i +"\n" +
					"He played knick-knack on my " + word(i) +"\n"+
					"With a knick-knack, paddy-whack,\n"+
					"Give your dog a bone.\n"+
					"This old man came rolling home.\n");
		}
	}
	
	private String word(int n) {
		switch(n) {
			case 1 : return "thumb";
			case 2 : return "shoe";
			case 3 : return "knee";
			case 4 : return "door";
			case 5 : return "hive";
			case 6 : return "sticks";
			case 7 : return "heaven";
			case 8 : return "pate";
			case 9 : return "spine";
			case 10 : return "shin";
			default : return null;
		}
	}
}
