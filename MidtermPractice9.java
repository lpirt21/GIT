
import acm.program.*;
import acm.util.RandomGenerator;

public class MidtermPractice9 extends ConsoleProgram{

	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int theBet =10;
		int exp = 2000;
		println("The average amount of games you need to play to lose whole "+INITIAL_MONEY + " dollars is " + countTheAvg(exp,theBet));
	}
	
	private int countTheAvg(int exp,int theBet) {
		int sum =0;
		for(int i =0; i<exp; i++) {
			sum+=experiment(theBet);
		}
		return sum/exp;
	}
	
	private int experiment(int theBet) {
		double n = INITIAL_MONEY;
		int m =0;
		while(true) {
			m++;
			if(n<=0) {
				n=0;
				break;
			}
			if(roll()) {
				n += theBet*2;
			}else{
				n-=theBet;
			}
		}
		return m;
	}
	
	private boolean roll() {
		boolean flag = false;
		int theNum = rgen.nextInt(0,36);
			if(theNum == 1) {
				flag = true;
			}
		return flag;
	}
	
	private static final int INITIAL_MONEY = 1000;
	
}

