package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] seven = new int[size];
		
		return null;
	}
	public static void shiftEm(int[] array)
	{
		print(array);
		int firstIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				int temp = array[firstIndex];
				array[firstIndex] = 7;
				array[i] = temp;
				firstIndex++;
			}
		}
		print(array);
		
	}
	public static void print(int[] array) {
		for (int num : array) {
			System.out.print(" " + num);
		}
		System.out.println();
	}
}

