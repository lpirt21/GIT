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
	private ArrayList <String> theWords;

	
	public void run(){
		String name = fileName;
		ArrayList<String> lines  = openFileReader(name);
		for(int i = lines.size()-1; i>=0; i--) {
			println(lines.get(i));
		}
	}
	
	//reads each line and adds each read word in an arraylist.
	private ArrayList<String> openFileReader(String fileName) {
		theWords = new ArrayList<String>();
		BufferedReader rd = null;
		try {
			rd = new BufferedReader(new FileReader(fileName));
			while(true) {
				String line = rd.readLine();
				if(line == null)break;
				theWords.add(line);
			}
			rd.close();
		}catch(IOException ex) {
			println("can't open that file");
		}
		return theWords;
	}

}
