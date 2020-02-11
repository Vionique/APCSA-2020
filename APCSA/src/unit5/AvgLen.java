package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-11-2020

public class AvgLen
{
   public static double go( String a, String b )
	{
	   int lengthA = a.length();
	   int lengthB = b.length();
	   return ((double)lengthA  + lengthB) / 2;
	}
}