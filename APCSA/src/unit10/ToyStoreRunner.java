package unit10;

// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Gabby Kang

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
		toyStore.loadToys("sorry");
		toyStore.loadToys("doll");
		toyStore.loadToys("gi joe");
		toyStore.loadToys("gi joe");
		toyStore.loadToys("gi joe");
		toyStore.loadToys("gi joe");
		toyStore.loadToys("gi joe");
		
		//System.out.println(toyStore);
		toyStore.Count();
		toyStore.sortToysByCount();
		System.out.println(toyStore.getMostFrequentToy());
		

		ToyStore34 sto = new ToyStore34();
		System.out.println( sto );
		sto.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball" );
		System.out.println( sto );	
		System.out.println( "max == " + sto.getMostFrequentToy() );		

	}
}

