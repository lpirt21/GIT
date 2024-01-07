
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
		String line= "";
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while(true) {
			line = rd.readLine();
			if(line == null)break;
			println(line);
			}
			rd.close();
		}catch(IOException ex) {
			println("Could not open that fiel");
		}
		
	}
}

