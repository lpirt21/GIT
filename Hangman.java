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
import java.util.StringTokenizer;

public class Hangman extends ConsoleProgram {
	
	public static final int APPLICATION_WIDTH = 900;
	public static final int APPLICATION_HEIGHT = 700;
	
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;
	
	RandomGenerator rgen = RandomGenerator.getInstance();

	public void init() {
		canvas = new HangmanCanvas();
		add(canvas);
	}
	
    public void run() {
    	playTheGame();
	}
    
    private void playTheGame() {
    	println("Welcome to Hangman!");
    	theGame();
    	/*when the program asks the user if they want to continue
    	 * playing, if the users answer is yes this while loop makes sure
    	 * the game continues.  
    	**/
    	while(line.equalsIgnoreCase("yes")) {
    		/*if the words on the list end at some point this part makes sure
    		 * to make it known to the user that the game can't continue.
        	**/
    		if(f == (words.getWordCount())) {
    			println("Sorry there are no more words left");
    			break;
    		}
       	canvas.reset();
    	mistakes = 8;
    	theGame();
    	}
    }
    
    //plays the game for each word
    private void theGame() {
    	canvas.addScaffold();
    	String word = getWordFrom();
    	int length = word.length();
    	String lines = theWord(length);//writes the word with dashes.
    	char theCh ='0';
    	String incorrectChars = "";
    	String correctChars ="";
    	while(true) {
    		println("The word now looks like this: " + lines);
    		println("You have " + mistakes + " guesses left.");
    		String getChar = readLine("Your guess: ");
    		while(getChar.length()==0) {
    			getChar = readLine("Please enter one character: ");
    		}
    		theCh = readChar(getChar);
    		while(getChar.length()>1 || !isChar(theCh)) {
    			println("Please enter " + (isChar(theCh)? "one character" : "a letter"));
    			getChar = readLine("Your guess: ");
    			theCh = readChar(getChar);
    		}
    		if(checkChar(theCh,word)){
    			if(checkChar(theCh,correctChars)) {
    				println("You made this guess already");
    			}else {
    			println("The guess is correct.");
    			}
    			lines = newWord(theCh,word,lines);
    			correctChars+=Character.toUpperCase(theCh);
    			canvas.displayWord(lines);
    		}else {
    			println("There are no " + theCh + "'s in the word");
    			mistakes--;
    			incorrectChars += addIncorrectChar(theCh,incorrectChars);
    			println(incorrectChars);
    			if(checkChar(theCh,incorrectChars)){
    			char c = Character.toUpperCase(theCh);
    			canvas.noteIncorrectGuess(c);
    			}
    		}
    		if(mistakes == 0) {
    			println("You're completely hung");
    			println("The word was " + word);
    			println("You lose.");
    			askQuestion();
    			break;
    		}
    		if(isOver(lines)) {
    			println("You guessed the word: " + lines);
    			println("You win.");
    			askQuestion();
    			break;
    		}
    	}
    	if(line.equalsIgnoreCase("no")) {
    		println("alright goodbye!");
    	}
    }
    
    
    private String addIncorrectChar(char newChar,String original) {
    	String res = "";
    	if(!checkChar(newChar,original)) {
    		res+=Character.toUpperCase(newChar);
    	}
    	return res;
    }
    
    
    private void askQuestion() {
    	line = readLine("Do you wanna continue the game?\n"
				+ "enter yes or no:");
		while(!line.equalsIgnoreCase("yes") && !line.equalsIgnoreCase("no")){
			line = readLine("Please enter yes or no:");
		}
    }
    
    private boolean isOver(String l) {
    	for(int q=0; q<l.length();q++) {
    		char b = l.charAt(q);
    		if(b=='-')return false;
    	}
    	return true;
    }
 
    
    private String newWord(char ch, String word,String li) {
    	String newWor =li;
        for(int j = 0; j<word.length();j++) {
        	char b =word.charAt(j);
 		   if(Character.toLowerCase(b) == ch || Character.toUpperCase(b)==ch) {
 			   newWor = changeChar(newWor,b,j);
 		   }
        }
    	return newWor;
    }
    
    private String changeChar(String bl,char v,int g) {
    	String ml = "";
    	for(int l = 0; l<bl.length(); l++) {
    		if(l==g){
    			ml+=v;
    		}else {
    			ml+=bl.charAt(l);
    		}
    	}
    	return ml;
    }
    
   private boolean checkChar(char ch, String word) {
	   boolean flag = false;
	   String word2 = "";
   		for(int s =0; s<word.length();s++) {
   		char ch2 = word.charAt(s);
   		char ch3 = Character.toUpperCase(ch2);
   		word2+=ch3;
   		}
   		char ch4 = Character.toUpperCase(ch);
   		for(int i=0; i<word2.length();i++) {
		   char a =word2.charAt(i);
		   if(a == ch4)flag = true;
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
    
    private String getWordFrom() {
    	words = new HangmanLexicon();
        int l = words.getWordCount();
    	int n = differentNum(l);
   		String word = words.getWord(n);
   		return word;
    }
    
    
    private int differentNum(int l) {
    	int m = rgen.nextInt(0,l-1);
    	if(f == 0) {
    	rememberUsedNumbers += "" + m + ",";
    	}
    	while(containsNum(m)) {
    		m = rgen.nextInt(0,l-1);
    	}
    	rememberUsedNumbers += "" + m + ","; 
    	f++;
    	return m;
    	
    }
    
    private boolean containsNum(int m) {
    	boolean flag = false;
    	StringTokenizer tokenizer = new StringTokenizer(rememberUsedNumbers, ",");
    	String token = tokenizer.nextToken();
    	while(tokenizer.hasMoreTokens()) {
    		token = tokenizer.nextToken();
    		int wordIndex =Integer.parseInt(token);
    		if(m == wordIndex) {
    			flag = true;
    		}
    	}
    	return flag;
    }
    
    private int f=0;
    private String rememberUsedNumbers = "";
    private HangmanLexicon words;
    private HangmanCanvas canvas;
    private int mistakes = 8;
    private String line = "";
}
