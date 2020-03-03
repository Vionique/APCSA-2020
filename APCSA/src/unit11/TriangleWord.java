package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i = 1; i <= word.length(); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(word.substring(0,i));
			}
			System.out.print("\n");
		}
	}
}

