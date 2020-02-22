package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-21-2020

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		int last = ray[ray.length - 1];
		
		if (ray.length <=1) {
			return -1;
		}
		
		for (int i = 0; i < ray.length - 1; i++) {
			if (ray[i] > last) {
				sum = sum + ray[i];
			}
		}
		if (sum == 0)
			return -1;
		else
			return sum;
	}
}