package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-26-2020

import java.util.ArrayList;

public class OddToEvenRunnerNine
{
	public static void main( String args[]   )
	{
		int [] one = { 7,1,5,3,11,5,6,7,8,9,10,12345,11 };
		int [] two = { 11,9,8,7,6,5,4,3,2,1,-99,7 };
		int [] three = {10,20,30,40,5,41,31,20,11,7};
		int [] four = { 32767,70,4,5,6,7 };
		int [] five = { 2,7,11,21,5,7 };
		int [] six = { 7,255,11,255,100,3,2 };
		int [] seven = { 9,11,11,11,7,1000,3 };
		int [] eight = {7,7,7,11,2,7,7,11,11,2 };
		int [] nine = { 2,4,6,8,8 };

		 
		ArrayList<Integer> One = ListOddToEven.arrToList(one);
		ArrayList<Integer> Two = ListOddToEven.arrToList(two);
		ArrayList<Integer> Three = ListOddToEven.arrToList(three);
		ArrayList<Integer> Four = ListOddToEven.arrToList(four);
		ArrayList<Integer> Five = ListOddToEven.arrToList(five);
		ArrayList<Integer> Six = ListOddToEven.arrToList(six);
		ArrayList<Integer> Seven = ListOddToEven.arrToList(seven);
		ArrayList<Integer> Eight = ListOddToEven.arrToList(eight);
		ArrayList<Integer> Nine = ListOddToEven.arrToList(nine);
  
		
		System.out.println(ListOddToEven.go(One));
		System.out.println(ListOddToEven.go(Two));
		System.out.println(ListOddToEven.go(Three));
		System.out.println(ListOddToEven.go(Four));
		System.out.println(ListOddToEven.go(Five));
		System.out.println(ListOddToEven.go(Six));
		System.out.println(ListOddToEven.go(Seven));
		System.out.println(ListOddToEven.go(Eight));
		System.out.println(ListOddToEven.go(Nine));

	}
}