package unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 01-30-2020
//Class - APCSA Period 2
//Lab  - Variables/Lab 0b.1

public class Variables
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = 127;
		int intOne = 50; 


		//decimal variables
		double doubleOne = 1.234;
		float floatOne = 1.23456789f;

		//other integer types
		long longOne = -1205; //64 bit, signed
		short shortOne = -2; //16 bit, signed
		
		//other types
		boolean boolOne = false;
		char char1 = 'A';
		String str1 = "hello";

		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("* 8 bit  - byteOne = " + 	byteOne + "\t*");
		System.out.println("* 16 bit - intOne = " + 	intOne + "\t\t*");
		System.out.println("* 64 bit - doubleOne = " + 	doubleOne + "\t*");
		System.out.println("* 32 bit - floatOne = " + 	floatOne + "\t*");
		System.out.println("* 64 bit - longOne = " + 	longOne + "\t*");
		System.out.println("* 16 bit - shortOne = " + 	shortOne + "\t*");
		System.out.println("* 1 bit -  boolOne = " + 	boolOne + "\t*");
		System.out.println("* 16 bit - char1 = " + 		char1 + "\t\t*");
		System.out.println("* string - str1 = " + 		str1 + "\t\t*");
		
		
		
	}
}