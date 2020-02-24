package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-21-2020

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int count = 0;
		if (numArray.length <= 1)
			return true;
		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] < numArray[i-1])
				count++;
		}
		if (count == (numArray.length - 1))
			return true;
		else
			return false;
	}	
}


