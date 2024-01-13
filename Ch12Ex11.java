//the art and science of java chapter 12 exercise 11

import java.util.*;
import acm.util.*;
import java.io.*;
import acm.program.*;

public class Ch12Ex11 extends ConsoleProgram {

	
	RandomGenerator rgen = RandomGenerator.getInstance();
	private final String fileName = "";


	
	public void run(){
		println("This program reverses the lines in a file");
		readLineArray();
		
	}
	
	
	private void readLineArray() {
		int lines = 0;
		int words = 0;
		int characters = 0;
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while(true) {
				String line = rd.readLine();
				if(line ==null)break;
				StringTokenizer tokenizer = new StringTokenizer(line," ,.!':;\" ()");
				while(tokenizer.hasMoreTokens()) {
					String token = tokenizer.nextToken();
					characters+=token.length();
					words++;
					
				}
				lines++;
			}
			rd.close();
		}catch(IOException ex) {
			throw new ErrorException(ex);
		}
		println("Number of lines = " + lines);
		println("Number of words = " + words);
		println("Number of characters = " + characters);
	}
	

}

