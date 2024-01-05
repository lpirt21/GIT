
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

