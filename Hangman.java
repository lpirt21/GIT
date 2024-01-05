
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Hangman extends ConsoleProgram {

	
	RandomGenerator rgen = RandomGenerator.getInstance();
	private final String fileName = "ShorterLexicon.txt";


	
	public void run(){
		println("This program reverses the lines in a file");
		BufferedReader reader = openFile();
		readFile(reader);
	}
	
	
	private void readFile(BufferedReader rd) {
		try {
			while(true) {
			String line = rd.readLine();
			if(line == null) break;
			println(line);
			}
		}catch(IOException ex) {
			println("cant");
		}
	}
	
	private BufferedReader openFile() {
		BufferedReader rd = null;
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);
		if(result == JFileChooser.APPROVE_OPTION) {
			try {
				File file = chooser.getSelectedFile();
				rd = new BufferedReader(new FileReader(file));
			}catch(IOException ex) {
				println("Can't open that file");
			}
		}
		return rd;
	}
	

}

