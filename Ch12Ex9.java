//the art and science of java chapter 12 exercise 9

import java.util.Arrays;

import acm.program.*;
import acm.util.*;

public class Ch12Ex9 extends ConsoleProgram {
	
	RandomGenerator rgen = RandomGenerator.getInstance();

	public void run(){
		int[] arr = new int[] {26, 31, 41, 59, 53, 58, 97, 93};
		sort(arr);
		println(Arrays.toString(arr));
	}
	
	private void sort(int[] array) {
		int index = 0;
		for(int i =0; i<array.length-1; i++) {
			if(array[i]>array[i+1]) { 
				index = i+1;
				int correct =findCorrectPosition(array, index);
				swapElements(array,correct,index);
			}
		}
		
	}
	
	
	private int findCorrectPosition(int[] array, int index) {
		int correct =0;
		for(int i=0; i<index; i++) {
			if(array[index]>=array[i]){
				correct = i+1;
			}
		}
		return correct;
	}
	
	private void swapElements(int[]array,int correct,int index) {
		int temp = array[index];
		for(int i =correct+1; i<=index; i++) {
			int t = array[i-1];
			array[i] = t;
		}
		array[correct] = temp;
	}
}