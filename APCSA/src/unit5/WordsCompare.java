package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-11-2020
//Class - APCSA Period 2
//Lab  - WordsCompare

import static java.lang.System.*;

public class WordsCompare
{
   private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
		wordOne = "ABC";
		wordTwo = "DEF";
		compare = 0;
	}

	public WordsCompare(String one, String two)
	{
		setWords(one, two);
		compare();
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		compare = wordOne.compareTo(wordTwo);
		
	}

	public String toString()
	{
		if(compare < 0)
			return wordOne + " should be placed before " + wordTwo + "\n";

		else if (compare > 0)
			return wordOne + " should be placed after " + wordTwo + "\n";
		
		else 
			return wordOne + " is the same as " + wordTwo + "\n";
	}
}

