package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-10-2020
//Class - APCSA Period 2
//Lab  - Number Verify

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if ((Math.abs(num) % 2) == 1)
			return true;
		else
			return false;
	}
	public static boolean isEven( int num )
	{
		if ((Math.abs(num)% 2) == 0)
			return true;
		else
			return false;
	}	
}