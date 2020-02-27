package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-26-2020

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddIndex = 0;
		int evenIndex = 0;
		
		for (int i = 0; i < ray.size();i++){
			if (ray.get(i) % 2 == 1) {
				oddIndex = i;
				
				break;
			}				
		}
		
		for (int j = ray.size() - 1; j >= 0; j--) {
			if (ray.get(j) % 2 == 0) {
				evenIndex = j;
			
				break;
			}
		}
		if (oddIndex == 0 && evenIndex == 0)
			return -1;

		return evenIndex - oddIndex;
	}
	
	public static ArrayList<Integer> arrToList(int[] a) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			temp.add(a[i]);
		}
		return temp;
	}
}