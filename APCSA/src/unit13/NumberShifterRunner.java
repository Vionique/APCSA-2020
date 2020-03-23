package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] one = {1, 10, 9, 2, 8, 2, 5, 6, 10, 7, 9, 8, 6, 7, 2, 7, 6, 10, 5, 3};
		int[] two = {2, 2, 2, 6, 2, 2, 4, 5, 3, 6, 10, 7, 5, 1, 9, 10, 7, 2, 2, 7};
		int[] three = {5, 9, 9, 5, 10, 5, 7, 5, 6, 7, 10, 8, 9, 9, 5, 4, 6, 6, 3, 3};
		
		
		NumberShifter.shiftEm(one);
		System.out.println("\n");
		NumberShifter.shiftEm(two);
		System.out.println("\n");
		NumberShifter.shiftEm(three);
	}
}



