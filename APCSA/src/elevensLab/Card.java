package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
	String suit;
	int face;
	String rank;
	int pointVal = 0;

  	//constructors
	public  Card() {
		setSuit("SPADES");
		setFace(0);
		setPoints();
	}
	
	public Card(String suits, int faces) {
		setSuit(suits);
		setFace(faces);
		setPoints();
	}
	
	public Card (String ranks, String suits, int points) {
		setSuit(suits);
		setRank(ranks);
		setPoints();
		//By technicality, Card constuctor doesn't need to take in int points
	}

	// modifiers
		//set methods
	public void setRank(String r) {
		rank = r;
		for (int i = 0; i < FACES.length; i++) {
			if (rank.equals(FACES[i])) {
				face = i;
			}
		}
	}
	public void setSuit(String suits) {
		suit = suits;
	}
	public void setFace(int faces) {
		face = faces;
		rank = FACES[face];
	}
	public void setPoints() {
		if (face > 10)
			pointVal = 10;
		else 
			pointVal = face;
		
	}

	
	public static boolean equalPoints(int a, int b) {
		if (a == b)
			return true;
		else
			return false;
	}
	
	
  	//accessors
		//get methods
	public String getSuit() {
		return suit;
	}
	public int getFace() {
		return face;
	}
	public String getRank() {
		return rank;
	}
	public int getPoints() {
		return pointVal;
	}

  	//toString

	public String toString() {
		return rank + " of " + suit + " (point value = " + pointVal + ")";
	}
 }


