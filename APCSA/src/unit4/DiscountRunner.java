package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang 
//Date - 02-10-2020
//Class - APCSA Period 2
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		
		System.out.printf("%.2f", Discount.getDiscountedBill(amt));
		
		System.out.print("\n\nDo you want to run sample data? (\"Y\"/\"N\")\n");
		String debug = keyboard.nextLine();
		String compare = keyboard.nextLine();
		if (compare.equals("Y")) {
			Discount.printSample();
		}
	}
}