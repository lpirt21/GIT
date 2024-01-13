//the art and science of java chapter 11 exercise 6

import acm.program.*;



public class Ch11Ex6 extends ConsoleProgram {    
	
	public void run() {
		int n = readInt("prime numbers until ? ");
		int[]prime =new int[n];
		array(prime);
	    check(prime);
	}
	
	private void array(int[]prime) {
		int m = 2;
		for(int i =0; i<(prime.length-1); i++) {
				prime[i] = m;
				m++;
		}
	}
	
	private void check(int[]prime) {
		for(int i =0; i<(prime.length-1); i++) {
		    for(int j = i+1; j<(prime.length-1);j++) {
		    	if((prime[j] % prime[i]) == 0) {
		    		prime[j] = 9;
		    	}
		    }
		    if(prime[i]!=9) {
		    println(prime[i]);
		    }
		}
	}	
	
}
