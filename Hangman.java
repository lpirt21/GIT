
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
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Hangman extends ConsoleProgram {

	
	RandomGenerator rgen = RandomGenerator.getInstance();
	private final String fileName = "C:/Users/lizi/Desktop/assignment4/ShorterLexicon.txt";
	private ArrayList <String> theWords;

	
	public void run(){
		readFile();
		
		
	}
	

	private void readFile() {
		int chars = 0;
		int sentences = 0;
		int words = 0;
		int quest =0;
		int excl = 0;
		int period = 0;
		int comma =0;
		String line = "";
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while(true) {
				line = rd.readLine();
				if(line == null)break;
				StringTokenizer tokenizer = new StringTokenizer(line, " ;:,.!?\" ' ()");
				StringTokenizer tokenize = new StringTokenizer(line, " ");
				if(tokenize.hasMoreTokens()) {
					String t = tokenize.nextToken();
					if(t.charAt(t.length()-1) == '!') {
						sentences++;
						excl++;
					}else if(t.charAt(t.length() -1) == '?') {
						sentences++;
						quest++;
					}else if(t.charAt(t.length()-1) == '.') {
						sentences++;
						period++;
					}else if(t.charAt(t.length()-1) == ',') {
						comma++;
					}
				}
				if(tokenizer.hasMoreTokens()) {
					String token = tokenizer.nextToken();
					words++;
					chars+=token.length();
				}
			}
			rd.close();
		}catch(IOException ex) {
			println("Could not open that file");
		}
		println("There are " + sentences + " sentences");
		println("There are " + words + " words");
		println("There are " + chars + " letters");
		println("There are " + quest + " sentences that end on question mark");
		println("There are " + excl + " sentences that end on exclamation point");
		println("There are " + period + " sentences that end on period");
		println("There are " + comma + " commas");
	}
	
}

