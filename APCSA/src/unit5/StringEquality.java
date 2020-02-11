package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-11-2020
//Class - APCSA Period 2
//Lab  - StringEquality

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		wordOne = "ABC";
		wordTwo = "XYZ";
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		return (wordOne.toUpperCase().equals(wordTwo.toUpperCase()));
	}

	public String toString()
	{
		if (checkEquality())
			return wordOne + " has the same letters as " + wordTwo + "\n";
		
		else if (!(checkEquality()))
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		
		return "error";
	}
}