package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-11-2020
//Class - APCSA Period 2
//Lab  - WordsCompare

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare caseOne 	= new WordsCompare("abe", "ape");
	   WordsCompare caseTwo 	= new WordsCompare("giraffe", "gorilla");
	   WordsCompare caseThree 	= new WordsCompare("one", "two");
	   WordsCompare caseFour 	= new WordsCompare("fun", "funny");
	   WordsCompare caseFive 	= new WordsCompare("123", "19");
	   WordsCompare caseSix 	= new WordsCompare("193", "1910");
	   WordsCompare caseSeven 	= new WordsCompare("goofy", "godfather");
	   WordsCompare caseEight 	= new WordsCompare("funnel", "fun");
	   
		//add test cases
	   System.out.println(caseOne);
	   System.out.println(caseTwo);
	   System.out.println(caseThree);
	   System.out.println(caseFour);
	   System.out.println(caseFive);
	   System.out.println(caseSix);
	   System.out.println(caseSeven);
	   System.out.println(caseEight);
	   

	}
}
