
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
import java.io.*;
import java.util.*;

import javax.swing.JFileChooser;

public class Hangman extends ConsoleProgram {

	
	RandomGenerator rgen = RandomGenerator.getInstance();
	private final String fileName = "ShorterLexicon.txt";

	
	public void run(){
		try {
			PrintWriter wr = new PrintWriter(new FileWriter("Hello.txt"));
			wr.println("Hello world");
			wr.close();
		}catch(IOException ex) {
			throw new ErrorException(ex);
		}
	}
	

}

