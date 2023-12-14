/*
 * File: HangmanCanvas.java
 * ------------------------
 * This file keeps track of the Hangman display.
 */


import acm.graphics.*;



public class HangmanCanvas extends GCanvas {

/** Resets the display so that only the scaffold appears */
	public void reset() {
		i=0;
		removeAll();
	}
	
	public void addScaffold() {
		int x = getWidth()/2 - BEAM_LENGTH;
		int y = (getHeight() - SCAFFOLD_HEIGHT)/3;
		add(new GLine(x,y,x,y + SCAFFOLD_HEIGHT));
		add(new GLine(x,y,x+BEAM_LENGTH,y));
		add(new GLine(x+BEAM_LENGTH,y,x+BEAM_LENGTH,y+ROPE_LENGTH));
	}

/**
 * Updates the word on the screen to correspond to the current
 * state of the game.  The argument string shows what letters have
 * been guessed so far; unguessed letters are indicated by hyphens.
 */
	public void displayWord(String word) {
		if(label1 !=null) {
			remove(label1);
		}
		String n = word;
		label1 = new GLabel(n);
		label1.setFont("SanSerif-40");
		int y1 = getHeight()/3 + 5*SCAFFOLD_HEIGHT/6;
		int x = getWidth()/8;
		add(label1,x,y1);
	}

/**
 * Updates the display to correspond to an incorrect guess by the
 * user.  Calling this method causes the next body part to appear
 * on the scaffold and adds the letter to the list of incorrect
 * guesses that appears at the bottom of the window.
 */
	public void noteIncorrectGuess(char letter) {
		if(doesNotContain(letter)) {
		str+=letter;
		}
		GLabel label = new GLabel(str);
		label.setFont("SanSerif-15");
		int y2 = getHeight()/3 + SCAFFOLD_HEIGHT + DIFF_BETWEEN;
		int x = getWidth()/8;
		add(label,x,y2);
		addOrgan(i);
		i++;
	}

	private boolean doesNotContain(char let) {
		for(int k =0; k<str.length(); k++) {
			char ch = str.charAt(k);
			if(ch == let)return false;
		}
		return true;
	}
	
	
	private void addOrgan(int j) {
		switch(j) {
		case 0 : addHead();
		}
	}
	
	private void addHead() {
		int x = getWidth()/2 - HEAD_RADIUS;
		int y = (getHeight() - SCAFFOLD_HEIGHT)/3 + ROPE_LENGTH;
		add(new GOval(x,y,HEAD_RADIUS*2,HEAD_RADIUS*2));
	}
	
	

	private int i =0;
	private GLabel label1;
	private String str ="";
	private static int DIFF_BETWEEN = 30;
	
/* Constants for the simple version of the picture (in pixels) */
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;


	
}
