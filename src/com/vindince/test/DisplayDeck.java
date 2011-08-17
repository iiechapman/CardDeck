package com.vindince.test;

public class DisplayDeck {
	
	
	public static void main (String args[]){
			
		
		CardDeck Deck = new CardDeck();
		
		Deck.Cards[1].setRank(6);
		Deck.Cards[1].setSuit(3);
	
		System.out.println(Deck.Cards[1].fullName());
		
		
			
			
	}
	
	
	

}
