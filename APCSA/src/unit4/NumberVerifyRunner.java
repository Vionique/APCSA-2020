package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-10-2020
//Class - APCSA Period 2
//Lab  - Number Verify

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner(in);
		System.out.println("Enter a whole number :: ");
		int userNumber = input.nextInt();
		
		printResults(userNumber);
		//add in input
		
		
		//add in more test cases
		printResults(5);
		printResults(111);
		printResults(2000);
		printResults(-99);
		printResults(1111);
		printResults(-850);
	}
	public static void printResults(int a) {
		System.out.println(a + " is odd :: " + NumberVerify.isOdd(a));
		System.out.println(a + " is even :: " + NumberVerify.isEven(a) + "\n");
	}
}