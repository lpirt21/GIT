//the art and science of java chapter 11 exercise 5

import acm.program.*;


public class Ch11Ex5 extends ConsoleProgram {
    
	private static final int num =9;
	
	public void run() {
		int[][] grid = {{3,9,2,4,6,5,8,1,7}, {7,4,1,8,9,3,6,2,5}, {6,8,5,2,7,1,4,3,9},
               {2,5,4,1,3,8,7,9,6}, {8,3,9,6,2,7,1,5,4}, {1,7,6,9,5,4,2,8,3}, 
               {9,6,7,5,8,2,3,4,1}, {4,2,3,7,1,9,5,6,8}, {5,1,8,3,4,6,9,7,2}};
		println(checkVertical(grid) && checkHorizontal(grid) && checkSquare(grid));
		
	}
	

	
	private boolean checkVertical(int[][]grid) {
		boolean flag = false;
		boolean res = true;
		int col =0;
		int sum = 0;
		for(int i =0; i<num; i++) {
			for(int j =0; j<num; j++) {
			   col = grid[i][j];
			   flag = (sum!=col) && (col<=9) && (col>0);
			   sum = col;
			   if(flag == false) {
				   res = false;
			   }
			}
			sum=0;
		}
	 return res;
	}
	
	private boolean checkHorizontal(int[][]grid) {
		boolean flag = false;
		boolean res = true;
		int col =0;
		int sum = 0;
		for(int i =0; i<num; i++) {
			for(int j =0; j<num; j++) {
			   col = grid[j][i];
			   flag = (sum!=col) && (col<=9) && (col>0);
			   sum = col;
			   if(flag == false) {
				   res = false;
			   }
			}
			sum=0;
		}
	 return res;
	}
	
	private boolean checkSquare(int[][]grid) {
		boolean flag = false;
		boolean res = true;
		int col =0;
		int sum = 0;
		for(int i=0; i<9; i+=3) {
			for(int j =0; j<9; j+=3) {
				for(int k =0; k < 3; k++) {
					for(int l = 0; l<3; l++) {
						col = grid[k+i][l+j];
						flag = (sum!=col) && (col<=9) && (col>0);
						sum = col;
						if(flag == false) {
							res = false;
						}
					}
					sum =0;
				}
			}
		}
		
		return res;
	}
	
	
}

