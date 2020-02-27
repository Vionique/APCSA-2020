package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-27-2020

import java.util.ArrayList;

public class DownRunner
{
	public static void main( String args[] )
	{
		int[] one = {-99,1,2,3,4,5,6,7,8,9,10,5};
		int[] two = {10,9,8,7,6,5,4,3,2,1,-99};
		int[] three = {10,20,30,40,50,-11818,40,30,20,10};
		int[] four = {32767};
		int[] five = {255,255};
		int[] six = {9,10,-88,100,-555,2};
		int[] seven = {10,10,10,11,456};
		int[] eight = {-111,1,2,3,9,11,20,1};
		int[] nine = {9,8,7,6,5,4,3,2,0,-2,6};
		int[] ten = {12,15,18,21,23,1000};
		int[] eleven = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		int[] twelve = {9,10,-8,10000,-5000,-3000};
		
		ArrayList<Integer> One = ListDown.arrToList(one);
		ArrayList<Integer> Two = ListDown.arrToList(two);
		ArrayList<Integer> Three = ListDown.arrToList(three);
		ArrayList<Integer> Four = ListDown.arrToList(four);
		ArrayList<Integer> Five = ListDown.arrToList(five);
		ArrayList<Integer> Six = ListDown.arrToList(six);
		ArrayList<Integer> Seven = ListDown.arrToList(seven);
		ArrayList<Integer> Eight = ListDown.arrToList(eight);
		ArrayList<Integer> Nine = ListDown.arrToList(nine);
		ArrayList<Integer> Ten = ListDown.arrToList(ten);
		ArrayList<Integer> Eleven = ListDown.arrToList(eleven);
		ArrayList<Integer> Twelve = ListDown.arrToList(twelve);
		
		System.out.println(ListDown.go(One));
		System.out.println(ListDown.go(Two));
		System.out.println(ListDown.go(Three));
		System.out.println(ListDown.go(Four));
		System.out.println(ListDown.go(Five));
		System.out.println(ListDown.go(Six));
		System.out.println(ListDown.go(Seven));
		System.out.println(ListDown.go(Eight));
		System.out.println(ListDown.go(Nine));
		System.out.println(ListDown.go(Ten));
		System.out.println(ListDown.go(Eleven));
		System.out.println(ListDown.go(Twelve));
	}
}