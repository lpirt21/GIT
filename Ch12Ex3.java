//the art and science of java chapter 12 exercise 3

import java.util.*;
import acm.program.*;

public class Ch12Ex3  extends ConsoleProgram {

	
	public void run(){
		ArrayList<Integer>first = new ArrayList<Integer>();
		first.add(43);
		first.add(69);
		first.add(1453);
		first.add(564);
		first.add(2);
		first.add(34);
		first.add(754);
		first.add(87);
		ArrayList<Integer> sorted = sort(first);
			println(sorted);

	}
	
	
	private ArrayList<Integer> sort(ArrayList<Integer> first){
		ArrayList<Integer> sorted = first;
		int smallest = 0;
		int biggerNum= 0;
		for(int i =0; i<sorted.size(); i++) {
			smallest = sorted.get(i);
			for(int j =i+1; j<sorted.size(); j++) {
				if(sorted.get(j) < smallest) {
					biggerNum = smallest;
					smallest = sorted.get(j);
					sorted.set(j, biggerNum);
				}
			}
			sorted.set(i, smallest);
		}
		return sorted;
	}
  
}
