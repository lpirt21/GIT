//the art and science of java chapter 6 exercise 8

public class Card {
	
	public Card(int rank, int suit) {
		cardRank = rank;
		cardSuit = suit;
	}
	
	public String getRank() {
		return toRankName(cardRank);
	}
	
	public String toRankName(int rank) {
		switch(rank) {
		case ACE : return "Ace";
		case 2: return "2";
		case 3: return "3";
		case 4: return "4";
		case 5: return "5";
		case 6: return "6";
		case 7: return "7";
		case 8: return "8";
		case 9: return "9";
		case 10: return "10";
		case JACK : return "Jack";
		case QUEEN : return "Queen";
		case KING : return "King";
		default : return "Card this rank doesn't exist";
		}
		
	}
	
	public String getSuit() {
		return toSuitName(cardSuit);
	}
	
	
	public String toSuitName(int cardSuit) {
		switch(cardSuit) {
		case CLUBS : return "Clubs";
		case DIAMONDS: return "Diamonds";
		case HEARTS : return "Hearts";
		case SPADES : return "Spades";
		default : return "That card suit doesn't exist";
		}
	}
	
	
  public String toString() {
	  return toRankName(cardRank) + " of " + toSuitName(cardSuit);
  }
	
	
	
	
	private final int ACE = 1;
	private final int JACK = 11;
	private final int QUEEN = 12;
	private final int KING = 13;
	
	
	private final int CLUBS = 1;
	private final int DIAMONDS = 2;
	private final int HEARTS = 3;
	private final int SPADES = 4;
	
	private int cardRank;
	private int cardSuit;
	
}





