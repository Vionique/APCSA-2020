package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover testOne = new LetterRemover("I am Sam I am", 'a');
		LetterRemover testTwo = new LetterRemover("ssssssssxssssesssssesss", 's');
		LetterRemover testThree = new LetterRemover("qwertyqwertyqwerty", 'a');
		LetterRemover testFour = new LetterRemover("abababababa", 'b');
		LetterRemover testFive = new LetterRemover("abaababababa", 'x');
		

		System.out.println(testOne);
		System.out.println(testTwo);
		System.out.println(testThree);
		System.out.println(testFour);
		System.out.println(testFive);
		//add test cases		
											
	}
}