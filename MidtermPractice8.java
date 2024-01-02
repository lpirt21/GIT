
import acm.program.*;
import acm.util.RandomGenerator;

public class MidtermPractice8 extends ConsoleProgram{

	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int rolls =4;
		int exp = 10000;
		println("The percentage of two 2s in a row coming up after rolling the dice " + rolls + " times is " + experiment(exp,rolls) + "%");
	}
	
	private double experiment(int exp,int rolls) {
		double m =0;
		for(int j =0; j<exp;j++) {
			if(rollDice(rolls)) {
				m++;
			}
		}
		return 100*m/exp;
	}
	
	private boolean rollDice(int amount) {
		int n=0;
		for(int i =0; i<amount;i++) {
			if(n==2)break;
			int theDie = rgen.nextInt(1,6);
				if(theDie == 2) {
					n++;
				}else {
					n=0;
				}
		}
		
	return n==2;
	}
	
}

