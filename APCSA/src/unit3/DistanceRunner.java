package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-05-2020
//Class - APCSA Period 2
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	//all methods print using toString for formatting issues, but a working print method is also present
	
	public static void main( String[] args )
	{
		Scanner scan1 = new Scanner(in);
		System.out.println("Type \"test\" to run sample data or \"user\" to put user input:");
		String temp = scan1.nextLine();
		
		//run Sample Data and get Sample Output
		if (((temp.contentEquals("test")) == true)) {
			Distance test1 = new Distance(1,1,2,1);
			Distance test2 = new Distance(1,1,-2,2);
			Distance test3 = new Distance(1,1,0,0);
			
			test1.calcDistance();
			test2.calcDistance();
			test3.calcDistance();
			
			
			System.out.println(test1);
			System.out.println(test2);
			System.out.println(test3);
		}
		
		//takes user data input
		else if ((temp.contentEquals("user")) == true) {
			userInput();
		}
	}//end main method
	
	public static void userInput() {
		Scanner keyboard = new Scanner(in);
		out.print("Enter X1 :: ");
		int X1 = keyboard.nextInt();

		out.print("Enter Y1 :: ");
		int Y1 = keyboard.nextInt();

		out.print("Enter X2 :: ");
		int X2 = keyboard.nextInt();
		
		out.print("Enter Y2 :: ");
		int Y2 = keyboard.nextInt();

		
		//print user results
		Distance test = new Distance(X1, Y1, X2, Y2);
		test.calcDistance();
		System.out.println(test);
	}//end userInput
		
	
}