package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang 
//Date - 02-10-2020
//Class - APCSA Period 2
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	private double bill;
	
	public void Discount() {
		bill = 0.0;
	}
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	
	
	public static double getDiscountedBill(double bill)
	{
		if (bill > 2000) 
			return 0.85 * bill;
		else if (bill <= 2000)
			return bill;
		return 0;
	}
	
	public static void printSample() {
		System.out.printf("%.2f", getDiscountedBill(500));
		System.out.printf("\n%.2f", getDiscountedBill(2500));
		System.out.printf("\n%.2f", getDiscountedBill(4000));
		System.out.printf("\n%.2f", getDiscountedBill(333.333));
		System.out.printf("\n%.2f", getDiscountedBill(95874.2154));
		
	}
}
