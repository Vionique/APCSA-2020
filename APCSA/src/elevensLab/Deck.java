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
		top = 51;
		
		for (int i = 0; i < SUITS.length; i++) {
			for (int j = 1; j <= 13; j++) {
				/*Card temp = new Card (SUITS[i], j);
				cards.add(temp);*/
				
				cards.add(new Card(SUITS[i], j));
			}
		}
		
		setSize(cards.size());

	}
	
	public Deck(String[] ranks, String[] suits, int[] points) {
		cards = new ArrayList<Card>();
		
		for (int j = 0; j < suits.length; j++) {
			for (int k = 0; k < ranks.length; k++) {
				cards.add(new Card(ranks[k], suits[j], points[k]));
			}
		}
		setSize(cards.size());
		top = cards.size() - 1;
		/*for (int i = 0; i < ranks.length; i++) {
			/*Card temp = new Card(ranks[i], suits[i], points[i]);
			cards.add(temp);
			
			cards.add(new Card(ranks[i], suits[i], points[i]));
		}
		
		setSize(cards.size());*/

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
		   //size = size - 1;
		   top = top - 1;
		   return cards.get(top + 1);
		   
	   }
	   
		   
   }
   //make a dealCard() method that returns the top card
   
   public void resetTop() {
	   size = cards.size();
	   top = size - 1;
   }
   public int getTop() {
	   return top;
   }
   
   
   public void shuffle() {
	   Card temp = new Card();
		
	   for (int k = (cards.size() - 1); k >= 1; k--) {
		   temp = cards.get(k);
		   int r = (int) (Math.random() * (k + 1));
		   cards.set(k, cards.get(r)); 
		   cards.set(r, temp);
		}
	   size = cards.size();
   }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
   public String cardInfo(Card c) {
	   return c.getRank()+ " of " 
				+ c.getSuit() + " (point value = "+ c.getPoints() + ")";
   }
   
   
   public String toString() {
	   String statement = "";
	   
	   if (top == cards.size() - 1) {
		   statement = statement + " Undealt Cards: ";
		   for (int j = top; j >= 0 ;j--) {
			   statement = statement + "\n" + cardInfo(cards.get(j));
		   }
	   }
	   else if (!isEmpty()) {
		   statement = statement + " Undealt Cards: ";
		   for (int k = top - 1 ; k >= 0 ; k--) {
			   statement = statement + "\n" + cardInfo(cards.get(k));
		   }
		   
		   statement = "Dealt cards: ";
		   for (int i = top; i >= top; i--) {
			   statement = statement + "\n" + cardInfo(cards.get(i)); 
				
			}

	}
		   
	   return statement;
   }
}



