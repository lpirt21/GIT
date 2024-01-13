//the art and science of java chapter 12 exercise 8

import java.util.Arrays;

import acm.program.*;
import acm.util.*;


public class Ch12Ex8 extends ConsoleProgram {
	
	RandomGenerator rgen = RandomGenerator.getInstance();

	public void run(){
	    int n= rgen.nextInt(10,20);
	    char[] arr = new char[n];
	    for(int i =0; i<arr.length; i++) {
	    	int c = rgen.nextInt(1,3);
		    char ch = rwb(c);
		    arr[i] = ch;
	    }
		correctArray(arr);
		println(Arrays.toString(arr));
	}
	
	private char rwb(int c) {
		switch(c) {
		case 1: return 'R';
		case 2: return 'W';
		case 3: return 'B';
		default: return '/';
		}
	}
	private void correctArray(char[]array) {
		int n = 0;
		for(int i=0; i<array.length; i++) {
			int rh = findR(array,i,array.length);
			if(rh!=-1) {
			n = i;
			swapElements(array,i,rh);
			}
		}
		for(int j =n+1; j<array.length; j++) {
			int bh = findB(array,j,array.length);
			if(bh!=-1) {
				swapElements(array,j,bh);
			}
		}
	}
	private int findR(char[]array, int p1, int p2) {
		int rIndex = -1;
		for(int j=p1; j<array.length; j++) {
			if(array[j] == 'R') {
				rIndex = j;
			}
		}
		return rIndex;
	}
	
	
	private int findB(char[]array, int p1, int p2) {
		int bIndex = -1;
		for(int j=p1; j<array.length; j++) {
			if(array[j] == 'B')bIndex = j;
		}
		return bIndex;
	}
	
	private void swapElements(char[]array, int p1,int p2) {
		println("After swapping elements " + (p1+1) + " and " + (p2+1) + ": ");
		char item = array[p1];
		array[p1] = array[p2];
		array[p2] = item;
		println(Arrays.toString(array));
	}
	
	
	
}
