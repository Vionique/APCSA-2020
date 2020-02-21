package unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('A');
		setAmount(1);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		/*for (int k = letter; k <= letter + amount; k++){
			for (int j = amount; j>=1 ;j--) {
				for (int i = j; i >= 1; i--) {
					output = output + (char) k;
				}
				output = output + " ";
			} 			
			output = output + "\n";
		}
		
		for (int j = amount; j>=1 ;j--) {
			for (int i = j; i >= 1; i--) {
				for (int k = letter; k <= letter + amount; k++) {
						output = output + (char) k;
				}
				output = output + " ";
			}
			
			output = output + "\n";
		}// gives correct amount of rows
		*/
		
		for (int i = 4; i >= 1; i --) {
			output = output + "* ";
		}
		return output;
	}
}


