package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Gabby Kang

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		
		int max = a;
		if (b > max) 
			max = b;
		if (c > max)
			max = c;
		
		for (int i = max; i >= 1; i--) {
			if ((b % i == 0) && ((a % i == 0) && (c % i == 0)))
				return i;
		}
		return 0; //should never activate
	}
	
	private int square(int x)
	{
		return x * x;
	}
	public String toString()
	{
		
		for (int i = 1; i <= number; i++) {
		
			for (int j = 1; j <= number; j++) {
				
				for (int k = 1; k <= number; k += 2) {
					if(square(i) + square(j) == square(k)){

						if (greatestCommonFactor(i,j,k) == 1) {
								System.out.println(i + " " + j + " " + k + "\n");
						}
						
					}
				}
				
			}
		}
		String output= "";


		return output+"\n";
	}
}