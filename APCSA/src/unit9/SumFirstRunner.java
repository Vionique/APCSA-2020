package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-26-2020

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class SumFirstRunner
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
		
		ArrayList<Integer> One = ListSumFirst.arrToList(one);
		ArrayList<Integer> Two = ListSumFirst.arrToList(two);
		ArrayList<Integer> Three = ListSumFirst.arrToList(three);
		ArrayList<Integer> Four = ListSumFirst.arrToList(four);
		ArrayList<Integer> Five = ListSumFirst.arrToList(five);
		ArrayList<Integer> Six = ListSumFirst.arrToList(six);
		ArrayList<Integer> Seven = ListSumFirst.arrToList(seven);
		ArrayList<Integer> Eight = ListSumFirst.arrToList(eight);
		ArrayList<Integer> Nine = ListSumFirst.arrToList(nine);
		ArrayList<Integer> Ten = ListSumFirst.arrToList(ten);
		ArrayList<Integer> Eleven = ListSumFirst.arrToList(eleven);
		ArrayList<Integer> Twelve = ListSumFirst.arrToList(twelve);
		
		System.out.println(ListSumFirst.go(One));
		System.out.println(ListSumFirst.go(Two));
		System.out.println(ListSumFirst.go(Three));
		System.out.println(ListSumFirst.go(Four));
		System.out.println(ListSumFirst.go(Five));
		System.out.println(ListSumFirst.go(Six));
		System.out.println(ListSumFirst.go(Seven));
		System.out.println(ListSumFirst.go(Eight));
		System.out.println(ListSumFirst.go(Nine));
		System.out.println(ListSumFirst.go(Ten));
		System.out.println(ListSumFirst.go(Eleven));
		System.out.println(ListSumFirst.go(Twelve));
		
	}
}