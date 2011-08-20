package com.vindince.test;

public class Card {
	
	private String suit,rank;
	private Suit realSuit;
	

public class CardDeck {
	
	public Card[] Cards = new Card[52];

	
	
	public CardDeck(){
		
		for (int i = 0 ; i < 52 ; i++){
		Cards[i] = new Card();
		}
		
	}
	
	
	
	public Card getCard(int i){
		
		
		return Cards[i];
		
	}
	
	

		

}
	private Rank realRank;
	
	
	private int numSuit,numRank;
	
	

	
	public enum Suit {
	DIAMONDS,CLUBS,HEARTS,SPADES
	}
	
	public enum Rank {
	ACE,DEUCE,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
	}
	
	
	
	//Types of Suits
	public final static int TOTAL_SUITS = 4;
	
	private final static int DIAMONDS = 1;
	private final static int CLUBS    = 2;
	private final static int HEARTS   = 3;
	private final static int SPADES   = 4;
	
	
	
	//Types of Ranks
	public final static int TOTAL_RANKS = 13;
	
	private final static int ACE   = 1;
	private final static int DEUCE = 2;
	private final static int THREE = 3;
	private final static int FOUR  = 4;
	private final static int FIVE  = 5;
	private final static int SIX   = 6;
	private final static int SEVEN = 7;
	private final static int EIGHT = 8;
	private final static int NINE  = 9;
	private final static int TEN   = 10;
	private final static int JACK  = 11;
	private final static int QUEEN = 12;
	private final static int KING  = 13;
	
	
	
	
	 public Card(){
		 
		 suit = "Null";
	     rank = "Null";
	     
	     numSuit = 1;
	     numRank = 1;
	     
	     validate();
	     
	     convertRank();
	     
	     convertSuit();
	     
	     
	     
	     
		
	}

	 
	 public String fullName(){
		 
		 return rank + " of " + suit;
		 
	 }
	 
	 
	public void Ranker(){
	
		switch (numRank){
	
		case Rank.ACE:
	    	rank = "Ace";
	    	break;
	
		default:
			rank = "Null";
			break;
	
		}
	
	} 
	
	
	public void Suiter(){
	
		switch(numSuit){
		
		case Suit.DIAMONDS:
			suit = "Diamonds";

public class CardDeck {
	
	public Card[] Cards = new Card[52];

	
	
	public CardDeck(){
		
		for (int i = 0 ; i < 52 ; i++){
		Cards[i] = new Card();
		}
		
	}
	
	
	
	public Card getCard(int i){
		
		
		return Cards[i];
		
	}
	
	

		

}

			break;
		
		case Suit.HEARTS:
			suit = "Hearts";
			break;
		
		case SUIT.CLUBS:
			suit = "Clubs";
			break;
		
		case Suit.SPADES:
			suit = "Spades";
			break;
			
		default:
			suit = "Null";
			break;
		
		
		}
		
	
	
	}
	
	
	
	 
	public void convertRank(){
	
		switch (numRank){
		
		case ACE:
			rank = "Ace";
			break;
	
		case DEUCE:
			rank = "Deuce";
			break;
						
		case THREE:
			rank = "Three";
			break;
			
		case FOUR:
			rank = "Four";
			break;
			
		case FIVE:
			rank = "Five";
			break;
			
		case SIX:
			rank = "Six";
			break;
			
		case SEVEN:
			rank = "Seven";
			break;
			
		case EIGHT:
			rank = "Eight";
			break;
			
		case NINE:
			rank = "Nine";
			break;
			
		case TEN:
			rank = "Ten";
			break;
			
		case JACK:
			rank = "Jack";
			break;
			
		case QUEEN:
			rank = "Queen";
			break;
			
		case KING:
			rank = "King";
			break;
			
	
			
		default:
			rank = "Null";
			break;
		
		
		
		}
		
	}
	
	public void convertSuit(){
		
		switch(numSuit){
		
		case DIAMONDS:
			suit = "Diamonds";
			break;
			
		case CLUBS:
			suit = "Clubs";
			break;
		
		case HEARTS:
			suit = "Hearts";
			break;
			
		case SPADES:
			suit = "Spades";
			break;
		
		
		default:
			suit = "Null";
			break;
			
		
		
		
		}
		
		
	}
	 
	public void validate(){
		
		if (numSuit < 1 || numSuit > TOTAL_SUITS){
			
			numSuit = 1;
			
		}
		
		if (numRank < 1 || numRank > TOTAL_RANKS){
			
			numRank = 1;
			
		}
		
		
	}
	
	
	public void setSuit(int setter){
		
		numSuit = setter;
		validate();
		convertSuit();
		
	}
	
	
	public void setSuit(String setter){
	
		suit = setter;
		
	}
	
	public String getSuit(){
		
		return suit;
	}
	
	
	
	public void setRank(int setter){
	
		numRank = setter;
		validate();
		convertRank();
		
	}
	
	
	
	public void setRank(String setter){
		
		rank = setter;
		
	}
	
	public String getRank(){
		
		return rank;
	}
	
	
	
	

}
