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

public class Hangman extends ConsoleProgram {
	
	RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
    	String wor = getWordFrom(4);
    	println(wor);
	}

    
 
    
    private boolean isChar(char th) {
    	return Character.isLetter(th);
    }
    
    private char readChar(String line) {
    	return line.charAt(0);
    }
    
    
    private String theWord(int a) {
    	String wor = "";
    	for(int i=0; i<a; i++) {
    		wor+="-";
    	}
    	return wor;
    }
    
    private String getWordFrom(int n) {
    	HangmanLexicon words = new HangmanLexicon();
   		String word = words.getWord(n);
   		return word;
    }
    
    private int wordAm = 10;
    private int mistakes = 8;
}
