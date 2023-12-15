/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import acm.util.*;


public class HangmanLexicon {

	private final String fileName = "C:/Users/lizi/Desktop/assignment4/ShorterLexicon.txt";
	private ArrayList <String> theWords;
	
	public HangmanLexicon(){
		String content = fileName;
		theWords= words(content);
	}
	
	private ArrayList<String> words(String fileName) {
		ArrayList<String> result = new ArrayList<>();
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while (true) {
				 // 1. read current line
				String line = rd.readLine();
				
				if (line == null) { // 2. if (line == null) => there are no more lines to read
					break;
				}
				result.add(line);
			}
			rd.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}
		return result;
	}
	
/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return theWords.size();
	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
		 return theWords.get(index);
	}
}
