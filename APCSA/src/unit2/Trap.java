package unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-03-2020
//Class - APCSA Period 2
//Lab  - Trapezoid Lab

public class Trap
{
	public static double area( int base1, int base2, int height )
	{
		double sum = (double) base1 + base2;
		//System.out.println(sum);
		double trapArea =  sum / 2 * (double) height;
		return trapArea;
	}
}