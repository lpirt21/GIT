import acm.program.*;
import acm.util.RandomGenerator;

public class MidtermPractice7 extends ConsoleProgram{

	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int experiment = 1000;
		int amount = 100;
		doTheExperiment(experiment,amount);
	}
	
	private void doTheExperiment(int experiment,int amount) {
		int sum =0;
		for(int i =0; i<experiment; i++) {
		 sum+= flipCoin(amount);
		}
		int avg = sum/amount;
		println("The average money left after " + amount + " flips is " + avg);
	}		
	
	private int flipCoin(int amount) {
		int currentMoney=INITIAL_MONEY;
		int n=0;
		while(n<amount) {
		String m = rgen.nextBoolean() ? "Heads" : "Tails";
		if(currentMoney <=0) {
			currentMoney = 0;
			break;
		}
		if(m.equals("Heads")) {
			n++;
			currentMoney+=1;
		}else {
			n++;
			currentMoney-=2;
		}
		}
	return currentMoney;
	}
	
	private final int INITIAL_MONEY = 20;
}



