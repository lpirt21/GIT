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
    	theGame();
	}

    private void theGame() {
    	HangmanLexicon numOfWords = new HangmanLexicon();
    	int l = numOfWords.getWordCount();
    	int m = rgen.nextInt(0,l-1);
    	String ac = getWordFrom(m);
    	int length = ac.length();
    	char theCh ='0';
    	println("Welcome to Hangman!");
    	String lin = theWord(length);
    	while(true) {
    		println("The word now looks like this: " + lin);
    		println("You have " + mistakes + " guesses left.");
    		String theChar = readLine("Your guess: ");
    		theCh = readChar(theChar);
    		while(theChar.length()>1 || !isChar(theCh)) {
    			println("Please enter " + (isChar(theCh)? "one character" : "a letter"));
    			theChar = readLine("Your guess: ");
    			theCh = readChar(theChar);
    		}
    		println(checkChar(theCh,ac));
    		if(checkChar(theCh,ac)){
    			lin = newWord(theCh,ac);
    		}
    	}
    	
    }
 
    
    private String newWord(char ch, String word) {
    	int q = 0;
    	String newWor = "";
        for(int j = 0; j<word.length();j++) {
        	char b =word.charAt(j);
 		   if(b == ch) {
 			   newWor+=b;
 		   }else if(b!=ch){
 			   newWor+="-";
 		   }
        }
    	return newWor;
    }
    
   private boolean checkChar(char ch, String word) {
	   boolean flag = false;
	   for(int i=0; i<word.length();i++) {
		   char a =word.charAt(i);
		   if(a == ch)flag = true;
	   }
	   return flag;
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
