package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-27-2020

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		for (int i = 1; i < numArray.size(); i++) {
			if (numArray.get(i) > numArray.get(i - 1))
				return false;
		}
		return true;
	}
	
	
	public static ArrayList<Integer> arrToList(int[] a) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			temp.add(a[i]);
		}
		return temp;
	}
}