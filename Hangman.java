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
    	/*
    	 * when the program asks the user if they want to continue
    	 * playing, if the users answer is yes this while loop makes sure
    	 * the game continues.  
    	**/
    	while(answer.equalsIgnoreCase("yes")) {
    		/*
    		 * if the words on the list end at some point this part makes sure
    		 * to make it known to the user that the game can't continue.
        	**/
    		if(numberOfUsedWords == (words.getWordCount())) {
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
    	String word = getWordFrom();//gets word from the list.
    	int length = word.length();
    	String lines = convertToDashes(length);//writes the word with dashes.
    	char theChar ='0';
    	String incorrectChars = "";//remembers incorrectly guessed letters.
    	String correctChars ="";//remembers correctly guessed letters.
    	while(true) {
    		println("The word now looks like this: " + lines);
    		println("You have " + mistakes + " guesses left.");
    		String getChar = readLine("Your guess: ");
    		//will not continue the game until the user doesn't enter at least one character.
    		while(getChar.length()==0) {
    			getChar = readLine("Please enter one character: ");
    		}
    		theChar = readChar(getChar);//converts the string(getChar) to a character.
    		//makes sure the user entered only one character and that that character is a letter. 
    		while(getChar.length()>1 || !isChar(theChar)) {
    			println("Please enter " + (isChar(theChar)? "one character" : "a letter"));
    			getChar = readLine("Your guess: ");
    			theChar = readChar(getChar);
    		}
    		//checks if the word contains the letter user entered 
    		if(checkChar(theChar,word)){
    			/*
    			 * if the letter is correct, checks whether or not the letter 
    			 * has alredy been entered by the user and informs the user.
    			 */
    			if(checkChar(theChar,correctChars)) {
    				println("You made this guess already");
    			}else {
    			println("The guess is correct.");
    			}
    			lines = newWord(theChar,word,lines);//changes the word from dashes and adds the correctly guessed letters to it.
    			correctChars+=Character.toUpperCase(theChar);//adds a letter to already guessed correct letters list.
    			canvas.displayWord(lines);//adds the word to canvas.
    		}else {
    			//in the case of incorrect guuess:
    			println("There are no " + theChar + "'s in the word");
    			mistakes--;//substracts one from the number of mistakes the user is allowed to make.
    			/*
    			 * adds incorrect letter to already guessed incorrect letters
    			 * only if it has not been entered already and converts them to upper case
    			 */
    			incorrectChars += addIncorrectChar(theChar,incorrectChars);
    			if(checkChar(theChar,incorrectChars)){
    			char c = Character.toUpperCase(theChar);
    			canvas.noteIncorrectGuess(c);//gives the character to HangmanCanvas class so the canvas will be able to display incorrect guesses.
    			}
    		}
    		//if the user lost the game informs them and prints the correct word. 
    		if(mistakes == 0) {
    			println("You're completely hung");
    			println("The word was " + word);
    			println("You lose.");
    			askQuestion();//asks user if they want to continue the game.
    			break;
    		}
    		//if the user won informs them and prints the correct word.
    		if(isOver(lines)) {
    			println("You guessed the word: " + lines);
    			println("You win.");
    			askQuestion();//asks user if they want to continue the game.
    			break;
    		}
    	}
    	//if the user answers that they don't want to continue playing stops the game. 
    	if(answer.equalsIgnoreCase("no")) {
    		println("alright goodbye!");
    	}
    }
    
    //adds incorrect chars only if they haven't been entered already and converts them to uppercase.
    private String addIncorrectChar(char newChar,String original) {
    	String res = "";
    	if(!checkChar(newChar,original)) {
    		res+=Character.toUpperCase(newChar);
    	}
    	return res;
    }
    
    /*
     * asks the user if they want to continue playing and keeps asking
     *  until they answer with yes or no. 
     */
    private void askQuestion() {
    	answer = readLine("Do you wanna continue the game?\n"
				+ "enter yes or no:");
		while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")){
			answer = readLine("Please enter yes or no:");
		}
    }
    
    //if the dashes has entirely transformed to a word and the user won returns true.
    private boolean isOver(String l) {
    	for(int q=0; q<l.length();q++) {
    		char b = l.charAt(q);
    		if(b=='-')return false;
    	}
    	return true;
    }
 
    //changes the dashes with correctly guessed letters.
    private String newWord(char ch, String word,String lines) {
    	String result =lines;
        for(int j = 0; j<word.length();j++) {
        	char b =word.charAt(j);
        	//checks if the character is a correct guess in both upper and lower cases.
        	//(for exmaple if the original word is computer and its written like "Computer" and not "COMPUTER".
 		   if(Character.toLowerCase(b) == ch || Character.toUpperCase(b)==ch) {
 			   result = changeChar(result,b,j);//changes the dash part to the correctly guessed letter.
 		   }
        }
    	return result;
    }
    
    //changes each dash to the correctly guessed letter.
    private String changeChar(String wordWithDashes,char c,int index) {
    	String res = "";
    	for(int l = 0; l<wordWithDashes.length(); l++) {
    		if(l==index){
    			res+=c;
    		}else {
    			res+=wordWithDashes.charAt(l);
    		}
    	}
    	return res;
    }
    
    
    //checks if the string contains the char and returns true if it does.
   private boolean checkChar(char ch, String word) {
	   boolean flag = false;
	   String word1 = "";
	   //converts the whole string to uppercase letters.
   		for(int s =0; s<word.length();s++) {
   		char ch1 = Character.toUpperCase(word.charAt(s));
   		word1+=ch1;
   		}
   		for(int i=0; i<word1.length();i++) {
		   char a =word1.charAt(i);
		   if(a == Character.toUpperCase(ch))flag = true;
	   }
	   return flag;
   }
    
   //makes sure the character is a letter.
    private boolean isChar(char th) {
    	return Character.isLetter(th);
    }
    
    /*
     * converts the string to a character by taking the first character
     * from a string the user entered after program already made sure
     * that the taken string only contains one character.
    */
    private char readChar(String line) {
    	return line.charAt(0);
    }
    
    //converts the word to dashes by changing each latter with a dash.
    private String convertToDashes(int a) {
    	String wor = "";
    	for(int i=0; i<a; i++) {
    		wor+="-";
    	}
    	return wor;
    }
   
    //gets random word from the list of words.
    private String getWordFrom() {
    	words = new HangmanLexicon();
        int l = words.getWordCount();
    	int n = differentNum(l);//makes sure each word is different by not repeating the index of the word.
   		String word = words.getWord(n);
   		return word;
    }
    
    
    /*
     * gets random number but also makes sure that number has not been used already
     * so all randomly picked words will be different. 
     */
    private int differentNum(int l) {
    	int m = rgen.nextInt(0,l-1);
    	if(numberOfUsedWords == 0) {
    	rememberUsedNumbers += "" + m + ",";
    	}
    	/*
    	 * this while loop makes sure that if the random selected number has already been used 
    	 * the number will change to the different random number until the unused number comes up. 
    	 */
    	while(containsNum(m)) {
    		m = rgen.nextInt(0,l-1);
    	}
    	/*
    	 * adds the used number to the string of used numbers and adds a colon between each one
    	 * so it will be able to find each number by stringtokenizer letter. 
    	 */
    	rememberUsedNumbers += "" + m + ",";
    	/*
    	 * counts how many times has user played the game therefore how many
    	 * words has been used from the list so in case where all the words has been
    	 * used the program will stop and inform the user.
    	 */
    	numberOfUsedWords++;
    	return m;
    }
    
    //returns true if the number has been used already;
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
    
	private static final int WIDTH = 900;
	private static final int HEIGHT = 700;
    
    private int numberOfUsedWords=0;
    private String rememberUsedNumbers = "";
    private HangmanLexicon words;
    private HangmanCanvas canvas;
    //the amount of mistakes the user is allowed to make
    private int mistakes = 8;
    //the answer to yes or no question
    private String answer = "";
}
