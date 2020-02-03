package unit2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-03-2020
//Class - APCSA Period 2
//Lab  - Line Lab

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double rise = y1 - y2;
		double run = x1 - x2;
		double slope = rise/run;
		return slope;
	}

}