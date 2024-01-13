//the art and science of java chapter 12 exercise 2

import acm.program.*;

public class Ch12Ex2  extends ConsoleProgram {


	public void run(){
		int [] array = new int[7];
		int n =5;
		for(int i=0; i<array.length; i++) {
			array[i] = n;
			n*=2;
		}
		
		println(isSorted(array));
	}
	
	
	
	
	private boolean isSorted(int[] array) {
		boolean flag = true;
		for(int i = 0; i<array.length-1; i++) {
			 if(array[i]>array[i+1]) {
				 flag = false;
			 }
		}
		return flag;
	}
  
}