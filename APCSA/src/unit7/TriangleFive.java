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
	
		for (int i = 1; i <= amount; i++) {
			int count = 0;
			for (int j = amount; j >= i; j--) {
				
				int temp = (int) letter;
				temp = temp + count;
				if (temp > 90) {
					temp = 64 + temp % 90;
				}
				for  (int k = 0; k < j; k++){
	
					output = output + (char) (temp);
					
					
				}
				count ++;
				
				
				output = output + " ";
			}
			output = output + "\n";
		
		
		}

		return output;
	}
}

