package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore toyStore = new ToyStore();
		toyStore.loadToys("sorry");
		//toyStore.loadToys("sorry");
		toyStore.loadToys("gi joe");
		toyStore.loadToys("gi joe");
		toyStore.loadToys("gi joe");
		toyStore.loadToys("gi joe");
		toyStore.loadToys("gi joe");
		
		System.out.println(toyStore);
		toyStore.Count();
		System.out.println(toyStore.getMostFrequentToy());
		
	}
}


