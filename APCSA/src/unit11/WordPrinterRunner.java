package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.Scanner;
import static java.lang.System.*;

public class WordPrinterRunner
{
	public static void main( String args[] )
	{
	   	Scanner keyboard = new Scanner(System.in);
	   	String choice="";
	   	System.out.println("Do you want to run test data? (Y/N)");
	   	choice = keyboard.next();
	   	if (choice.equals("Y") || choice.equals("y")) {
	   		WordPrinter.printWord("hello", 9);
	   		System.out.println("");
	   		WordPrinter.printWord("funny", 6);
	   		System.out.println("");
	   		WordPrinter.printWord("chicken", 4);
	   		System.out.println("");
	   		WordPrinter.printWord("dog", 1);
	   	}
	   	
	   	else {
			do{
				out.print("\nEnter the word to display :: ");
				String word = keyboard.next();
		
				out.print("Enter the times to display :: ");
	 			int times = keyboard.nextInt();			
				
				//call the printWord method
	 			WordPrinter.printWord(word, times);
				System.out.print("\nDo you want to enter more sample input? ");
				choice=keyboard.next();			
			}while(choice.equals("Y")||choice.equals("y"));		
		}
	}
}

