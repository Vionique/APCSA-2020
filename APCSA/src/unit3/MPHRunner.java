package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-05-2020
//Class - APCSA Period 2
//Lab  - MPH

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner scan1 = new Scanner(in);
		System.out.println("Type \"test\" to run sample data or \"user\" to put user input:");
		String temp = scan1.nextLine();
		
		//run Sample Data and get Sample Output
		if (((temp.contentEquals("test")) == true)) {
			MilesPerHour test1 = new MilesPerHour(45,0,32);
			MilesPerHour test2 = new MilesPerHour(96,1,43);
			MilesPerHour test3 = new MilesPerHour(100,2,25);
			MilesPerHour test4 = new MilesPerHour(50,2,25);
			
			test1.calcMPH();
			System.out.println(test1.toString());
			test2.calcMPH();
			System.out.println(test2.toString());
			test3.calcMPH();
			System.out.println(test3.toString());
			test4.calcMPH();
			System.out.println(test4.toString());
			
		}
		
		//input your own data
		else if ((temp.contentEquals("user")) == true) {
			userInput();
		}
		
		
		
	}
	
	public static void userInput() {
		Scanner keyboard = new Scanner(in);
		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		
		System.out.println("Type \"0\" to print using the toString method "
				+ "or type \"1\" to print using the print method");
		int ans = keyboard.nextInt();
		
		if (ans == 0) {
			System.out.println(test.toString());
		}
		else if (ans == 1) {
			test.print();
		}
		
	}
	
}