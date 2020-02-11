package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-11-2020
//Class - APCSA Period 2
//Lab  - StringEquality 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		   StringEquality caseOne 		= new StringEquality("hello", "goodbye");
		   StringEquality caseTwo 		= new StringEquality("one", "two");
		   StringEquality caseThree 	= new StringEquality("three", "four");
		   StringEquality caseFour 		= new StringEquality("TCEA", "UIL");
		   StringEquality caseFive 		= new StringEquality("State", "Champions");
		   StringEquality caseSix 		= new StringEquality("ABC", "ABC");
		   StringEquality caseSeven 	= new StringEquality("ABC", "CBA");
		   StringEquality caseEight 	= new StringEquality("Same", "Same");
		   //StringEquality caseMine 		= new StringEquality("abc", "ABC");
		   
			//add test cases
		   System.out.println(caseOne);
		   System.out.println(caseTwo);
		   System.out.println(caseThree);
		   System.out.println(caseFour);
		   System.out.println(caseFive);
		   System.out.println(caseSix);
		   System.out.println(caseSeven);
		   System.out.println(caseEight);
		   //System.out.println(caseMine);
		   	
	}
}