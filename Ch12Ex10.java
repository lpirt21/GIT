//the art and science of java chapter 12 exercise 10

import java.util.Arrays;
import acm.program.*;

public class Ch12Ex10 extends ConsoleProgram {
	
	public void run(){
		int[] arr = new int[] {263, 731, 241, 559, 533, 558, 197,393};
		arr = sort(arr);
		println(Arrays.toString(arr));
	}
	
	private int[] sort(int[] array) {
		int n=0;
		int max = 0;
		int max2=0;
		for(int i=0; i<array.length; i++) {
			n = array[i];
			max=0;
			while(n>0) {
				n/=10;
				max++;
			}
			if(max>max2) {
			max2 = max;
			}
		}
		int m = 10;
		for(int j =0; j<max2; j++) {
			array = positionCorrectly(array,m);
			m*=10;
		}
		return array;
	
	}
	
	
	private int[] positionCorrectly(int[] array, int m) {
		int[] newArray = new int[array.length];
		int n =0;
		int nn=0;
		for(int i =0; i<=9; i++) {
			for(int j=0; j<array.length; j++) {
				nn = (array[j]%m)/(m/10);
				if(nn ==i) {
					newArray[n] = array[j];
					n++;
				}
			}
		}
		return newArray;
	}
}




