/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import acm.util.*;

public class HangmanLexicon {

/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return 10;
	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
		switch (index) {
			case 0: return "BUOY";
			case 1: return "Computer";
			case 2: return "Connisseur";
			case 3: return "Degydrate";
			case 4: return "Fuzzy";
			case 5: return "Hubbub";
			case 6: return "Keyhole";
			case 7: return "Quaqmire";
			case 8: return "Slither";
			case 9: return "Zircon";
			default: throw new ErrorException("getWord: Illegal index");
		}
	};
}
