
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
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Hangman extends ConsoleProgram {

	
	RandomGenerator rgen = RandomGenerator.getInstance();
	private final String fileName = "ShorterLexicon.txt";


	
	public void run(){
		println("This program reverses the lines in a file");
		BufferedReader reader = openFileReader("Enter input file: ");
		String[] lines = readLineArray(reader);
		for(int i = lines.length-1; i>=0; i--) {
			println(lines[i]);
		}
	}
	
	//reads each line and adds each read word in an arraylist.
	private BufferedReader openFileReader(String prompt) {
		BufferedReader rd = null;
		while(rd == null) {
			try {
				String name  = readLine(prompt);
				rd = new BufferedReader(new FileReader(name));
			}catch(IOException ex) {
				println("can't open that file");
			
			}
		}
		return rd;
	}
	
	private String[] readLineArray(BufferedReader rd) {
		ArrayList<String> lineList = new ArrayList<String>();
		try {
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

