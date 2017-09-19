package pkgCore;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import java.util.ArrayList;

public class Deck {

public static void main(String args[]) {
ArrayList<Card> list = new ArrayList<Card>();}
		public int cards;
		private ArrayList <Card> CardsInDeck;
		public Deck ()
		{
			ArrayList<Card> cardDeck = new ArrayList<Card>();
			
			for (eSuit eSuit : eSuit.values()) {
				
				for (eRank eRank : eRank.values() )
				{
					Card c = new Card( eRank, eSuit);
					cardDeck.add(c);
				}
			}
			CardsInDeck = cardDeck;
		}
		}
	
	
	//	TODO: 
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller

