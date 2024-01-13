//the art and science of java chapter 12 exercise 5

import acm.program.*;

public class Ch12Ex5 extends ConsoleProgram {
	
	private double[] arr = new double[] {3.5,4.3,9.5,78.4,26.4,89.5};
	public void run(){
		println(median(arr));
	}
	
	private double median(double[] array) {
		double[] newArray = array;
		double result =0;
		sort(newArray);
		for(int i =0; i<newArray.length; i++) {

		}
		int length = array.length;
		if(length%2 ==0) {
			result = (newArray[length/2] + newArray[-1+length/2])/2;
		}else {
			result = newArray[length/2 -1];
		}
		return result;
	}
	
	private void sort(double[] newArray) {
		for(int lh =0; lh<newArray.length; lh++) {
			int rh = findSmallest(newArray,lh,newArray.length);
			swapElements(newArray,lh,rh);
		}
	}
	
	private int findSmallest(double[] newArray, int p1, int p2) {
		int smallestIndex = p1;
		for(int i =p1+1; i<p2; i++) {
			if(newArray[i]<newArray[smallestIndex]) {
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}
	
	private void swapElements(double[]newArray, int p1, int p2) {
		double temp = newArray[p1];
		newArray[p1] = newArray[p2];
		newArray[p2] = temp;
	}
		
	
}


