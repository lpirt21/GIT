//the art and science of java chapter 12 exercise 1

import acm.program.*;


public class Ch12Ex1 extends ConsoleProgram {

	
	public void run(){
		println("Think of a number between 1 and 100");
		theGame();
	}
	
	private void theGame() {
		int num =50;
		boolean flag = false;
		int lastNum = 0;
		int n =0;
		int currentNum=num;
		while(true) {
			String line = readLine("Is it " + num + "? ");
			if(line.equalsIgnoreCase("Yes")) {
				println("I guessed the number!");
				break;
			}
			line = readLine("Is it less than " + num + "? ");
			if(line.equalsIgnoreCase("yes")) {
				flag = false;
			}else {
				flag = true;
			}
			lastNum = n;
			n=num;
			num = returnNumber(flag,currentNum,lastNum);
			currentNum = num;
			}
			
	}
	
	
	private int returnNumber(boolean flag,int currentNum, int lastNum) {
		int n=currentNum;
		int m = (currentNum - lastNum)/2;
		if(m<0) {
			m = (lastNum-currentNum)/2;
		}else if(m==0) {
			m=1;
		}
		if(flag) {
			n+=m;
		}else {
			n-=m;
		}
		return n;
	}

  
}
