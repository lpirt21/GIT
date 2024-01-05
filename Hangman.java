
/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Hangman extends ConsoleProgram {

	
	RandomGenerator rgen = RandomGenerator.getInstance();
	private final String fileName = "ShorterLexicon.txt";


	
	public void run(){
		println("This program reverses the lines in a file");
	
		String[] lines = readLineArray();
		for(int i = lines.length-1; i>=0; i--) {
			println(lines[i]);
		}
	}
	
	
	private String[] readLineArray() {
		ArrayList<String> lineList = new ArrayList<String>();
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while(true) {
				String line = rd.readLine();
				if(line ==null)break;
				lineList.add(line);
			}
			rd.close();
		}catch(IOException ex) {
			throw new ErrorException(ex);
		}
		String[] result = new String[lineList.size()];
		for(int i =0; i<result.length; i++) {
			result[i] = lineList.get(i);
		}
		return result;
	}
	

}

