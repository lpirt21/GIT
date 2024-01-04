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
	private final String fileName = "HangmanLexicon.txt";
	private ArrayList <String> theWords;
	
	
	public void run(){
		String name = fileName;
		
		BufferedReader reader = openFileReader("bla");
		String[] lines = readLineArray(reader);
		for(int i = lines.length-1; i>=0; i--) {
			println(lines[i]);
		}
	}
	
	//reads each line and adds each read word in an arraylist.
	private BufferedReader openFileReader(String fileName) {
		BufferedReader rd = null;
		while(rd == null) {
			try {
				String name  = readLine("Enter a file name: ");
				rd = new BufferedReader(new FileReader(name));
			}catch(IOException ex) {
				println("This file does not exist");
			}
		}
		return rd;
	}
	
	private String[] readLineArray(BufferedReader rd) {
		ArrayList<String> array = new ArrayList<>();
		try {
			while(true) {
				String line = rd.readLine();
				if(line == null)break;
				array.add(line);
			}
			rd.close();
		}catch(IOException ex){
			throw new ErrorException(ex);
		}
		String[]result = new String[array.size()];
		for(int i =0; i<result.length; i++) {
			result[i] = array.get(i);
		}
		
		return result;
	}
	
    /*
     * changes the size of the console so the hangman illustration words
     *  
     */
    public static final int APPLICATION_WIDTH = 900;
	public static final int APPLICATION_HEIGHT = 700;
	
    private int numberOfUsedWords=0;
    private String rememberUsedNumbers = "";
    private HangmanLexicon words;
    private HangmanCanvas canvas;
    //the amount of mistakes the user is allowed to make
    private int mistakes = 8;
    //the answer to yes or no question
    private String answer = "";
}
