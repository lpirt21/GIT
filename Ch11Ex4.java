//the art and science of java chapter 11 exercise 4

import acm.program.*;

public class Ch11Ex4 extends ConsoleProgram {
    

	
	public void run() {
		int n = readInt("How many numbers in a row does the square have? ");
		int[][]square =new int[n][n];
		array(square,n);
		println(check(square,n));
	}
	
	private void array(int[][]square,int n) {
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				square[i][j] = readInt("what's the number in the " + (i+1)+ " row " + (j+1) + " column? ");
			}
		}
	}
	
	private boolean check(int[][]square,int n) {
		boolean flag = true;
		int col =0;
		int res=0;
		int sum = 0;
		int f = n;
		for(int k =0; k<n; k++) {
			   res += square[0][k];
			}
		sum = res;
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
			   col += square[i][j];
			}
			flag = (col==sum);
			if(flag == false)break;
			col=0;
		}
		for(int ii =0; ii<n; ii++) {
			for(int jj =0; jj<n; jj++) {
			   col += square[jj][ii];
			}
			flag = (col==sum);
			if(flag == false)break;
			col=0;
		}
		
		for(int iii =0; iii<n; iii++) {
			for(int jjj =0; jjj<n; jjj++) {
			   col += square[jjj][iii];
			}
			flag = (col==sum);
			if(flag == false)break;
			col=0;
		}
		
		for(int m=0; m<n; m++) {
			 col += square[m][m];
		}
		 flag = (col==sum);
		 col=0;
		for(int l=0; l<n; l++) {
			 f--;
			 col += square[l][f];
		}
		
		if(flag!= false) {
		 flag = (col==sum);
		}
	 return flag;
	}
		
}
 

