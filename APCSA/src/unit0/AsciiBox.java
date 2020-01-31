package unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 01-30-2020
//Class - APSCA Period 2
//Lab  - ASCII Box/Lab 0a.1

public class AsciiBox
{
	public static void main(String[] args)
	{
		System.out.println("Gabby Kang \t  01-30-2020" );
		System.out.println("ASCII box activity \n\n");
		for (int i = 1; i <= 18; i++) {
			if (((i % 5) == 4) || ((i % 5) == 0)) {
				System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA " );
			}
			else {
				System.out.println("+++++++++++++++++++++++++ " );
			}
		}//end for loop
	}//end Main
}//end class