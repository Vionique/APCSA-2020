package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	private int size;

	public Deck() {
		cards = new ArrayList<Card>();
		
		for (int i = 0; i < SUITS.length; i++) {
			for (int j = 1; j <= 13; j++) {
				Card temp = new Card (SUITS[i], j);
				cards.add(temp);
			}
		}
		setSize(cards.size());
		//shuffle();
	}
	
	public Deck(String[] ranks, String[] suits, int[] points) {
		cards = new ArrayList<Card>();
		for (int i = 0; i < ranks.length; i++) {
			Card temp = new Card(ranks[i], suits[i], points[i]);
			cards.add(temp);
		}
		
		setSize(cards.size());
		//shuffle();
	}
   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
	private void setSize(int s) {
		size = s;
	}
	
	
   public int getSize() {
	   return size;
   }
   public boolean isEmpty() {
	   if (size == 0) 
		   return true;
	   else
		   return false;
   }
   
   public Card dealCard() {
	   if (isEmpty())
		   return null;
	   else {
		   size = size - 1;
		   return cards.get(size);
	   }
		   
   }
   //make a dealCard() method that returns the top card
   
   public void shuffle() {
	   Collections.shuffle(cards);
	   setSize(cards.size());
   }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
}



