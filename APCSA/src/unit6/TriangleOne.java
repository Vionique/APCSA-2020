package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		String output = word;	
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < output.length(); j++){
				System.out.print(output.charAt(j));
			}
			output = word.substring(0, word.length() - i - 1);
			System.out.print("\n");
		}
		
		System.out.println("\n");
	}
}