//the art and science of java chapter 12 exercise 7

import acm.program.*;
import acm.util.*;

public class Ch12Ex7 extends ConsoleProgram {
	
	RandomGenerator rgen = RandomGenerator.getInstance();

	public void run(){
	    int[] arr = new int[52];
		for(int i=0; i<52; i++) {
			arr[i] =i+1;
		}
		sort(arr);
		
	}
	private void sort(int[] newArray) {
		for(int lh =0; lh<newArray.length; lh++) {
			int rh = findRandom(newArray,lh,newArray.length);
			swapElements(newArray,lh,rh);
		}
	}
	
	private int findRandom(int[] newArray, int p1, int p2) {
		int randomIndex = rgen.nextInt(p1,p2-1);
		return randomIndex-1;
	}
	
	private void swapElements(int[]newArray, int p1, int p2) {
		int temp = newArray[p1];
		newArray[p1] = newArray[p2];
		newArray[p2] = temp;
	}
		
	
}

