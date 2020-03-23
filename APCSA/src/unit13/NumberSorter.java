package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int index = 0;
		while (index < sorted.length) {
			sorted[index] = number % 10;
			number = number / 10;
			index++;
		}
		
		
		for (int i = 1; i < sorted.length; i++) {
			int temp = sorted[i];
			int sortIndex = i;
			while (sortIndex > 0 && temp < sorted[sortIndex - 1]) {
				sorted[sortIndex] = sorted[sortIndex - 1];
				sortIndex--;
			}
			sorted[sortIndex] = temp;
		}

		
		return sorted;
	}
	
	public static void print(int[] arr) {
		System.out.println();
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

