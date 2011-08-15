package com.vindince.test;

public class Card {
	
	private String suit,rank;
	
	
	 public Card(){
		 
		 suit = "Null";
	     rank = "Null" ;
		
	}

	 
	 public String fullName(){
		 
		 return rank + " of " + suit;
		 
	 }
	
	public void setSuit(String setter){
	
		suit = setter;
		
	}
	
	public String getSuit(){
		
		return suit;
	}
	
	
	public void setRank(String setter){
		
		rank = setter;
		
	}
	
	public String getRank(){
		
		return rank;
	}
	
	
	
	

}
