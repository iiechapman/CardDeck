package com.vindince.test;

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
