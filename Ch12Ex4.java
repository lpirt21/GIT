//the art and science of java chapter 12 exercise 4

import acm.program.*;

public class Ch12Ex4  extends ConsoleProgram {

	private String[]first = new String[] {"plan",
	                         "elephant",
	                         "dignity",
	                         "center",
	                         "eaux",
	                         "office",
	                         "indirect",
	                         "suitcase"};
	
	public void run(){
		String[] sorted = alphabetize(first);
		println(sorted);
	}
	
	
	private String[] alphabetize(String[] init){
		String[] first = init;
		int n =0;
		int f = 0;
		int l=0;
		String res = "";
		for(int i =0; i<first.length; i++) {
			l=0;
			f=0;
			boolean flag = false;
			String word1 = first[i];
			for(int j =i+1; j<first.length; j++) {
				String word2 = first[j];
				n = word1.compareTo(word2);
				if(f<n && word1.charAt(0)!=word2.charAt(0)) {
					flag = true;
					res = word2;
					l = j;
					f = n;
				}
			}
			if(flag) {
			first[i] = res;
			first[l] = word1;
			}
			for(int h=0; h<first.length; h++) {
				println(first[h]);
			}
			println(" ");
		}
		return first;
	}

  
}
