package pkgCore;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

	//public static void main(String args[]) {
	//	ArrayList<Card> list = new ArrayList<Card>();}
	//public int cards;
	private ArrayList <Card> CardsInDeck;
	public Deck () {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values() ) {
				Card c = new Card( eRank, eSuit);
				CardsInDeck.add(c);
			}
		}
		Collections.shuffle(CardsInDeck);
	}

	public Deck (int nums_of_deck) {
		for(int x = 0; x < nums_of_deck; x++) {
			
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values() ) {
				Card c = new Card( eRank, eSuit);
				CardsInDeck.add(c);
			}
		}
		}
		Collections.shuffle(CardsInDeck);
	}

//	TODO: 
//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc

//			Deck(2) will create an array of 104 cards.



//	TODO: Add a draw() method that will take a card from the deck and
//			return it to the caller
	public Card draw() {
		Random generator= new Random();
		int index= generator.nextInt(CardsInDeck.size());
		return CardsInDeck.remove(index); }
		}
	

