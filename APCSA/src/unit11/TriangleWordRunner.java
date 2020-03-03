package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
	   	String user = "";
	   	
	   	System.out.println("Do you want to run test data? (Y/N)");
	   	user = input.next();
	   	if (user.equals("Y") || user.equals("y")) {
	   		TriangleWord.printTriangle("a");
	   		System.out.println("");
	   		TriangleWord.printTriangle("it");
	   		System.out.println("");
	   		TriangleWord.printTriangle("box");
	   		System.out.println("");
	   		TriangleWord.printTriangle("toad");
	   		System.out.println("");
	   		TriangleWord.printTriangle("fishy");
	   		System.out.println("");
	   		TriangleWord.printTriangle("dog");
	   	}
	   	
	   	do  {
	   		out.print("\nEnter a word ::  ");
	   		String word = input.next();
	   		
	   		TriangleWord.printTriangle(word);
	   		
	   		out.print("\nDo you want to enter more sample input? ");
	   		user = input.next();
	   } while (user.equals("Y") || user.equals("y"));
	}
			
}