
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
	private final String fileName = "ShorterLexicon.txt";
	private ArrayList <String> theWords;

	
	public void run(){
		String name = fileName;
		ArrayList<String> lines  = openFileReader(name);
		transform(lines);
		for(int i = lines.size()-1; i>=0; i--) {
			println(lines.get(i));
		}
	}
	
	
	private void transform(ArrayList<String> lines) {
		int small = 'a';
		int small2 = 'z';
		int big = 'A';
		int big2 = 'Z';
		String token2= "";
		for(int i =0; i<lines.size(); i++) {
		String sentence = "";
		String line1 = lines.get(i);
		StringTokenizer tokenizer = new StringTokenizer(line1, " .,!?:;\"'",true);
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			for(int j =0; j<token.length(); j++) {
				if(Character.isLowerCase(token.charAt(j))) {
					char ch2 = (char)rgen.nextInt(small,small2);
					token2+=ch2;
				}else if(Character.isUpperCase(token.charAt(j))) {
					char ch2 = (char)rgen.nextInt(big,big2);
					token2+=ch2;
				}else {
					token2+=token;
				}
			}
			sentence+=token2;
			token2= "";
		}
		lines.set(i, sentence);
		}
	}
	//reads each line and adds each read word in an arraylist.
	private ArrayList<String> openFileReader(String fileName) {
		theWords = new ArrayList<String>();
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
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

