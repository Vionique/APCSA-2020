package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby kang	
//Date - 02-26-2020

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int first = ray.get(0);
		int sum = 0;
		for (int number : ray) {
			if (number > first) {
				sum = sum + number;
			}
		}
		
		if (sum == 0)
			return -1;
		return sum;
	}
	
	public static ArrayList<Integer> arrToList(int[] a) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			temp.add(a[i]);
		}
		return temp;
	}
}