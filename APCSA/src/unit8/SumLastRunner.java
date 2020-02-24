package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-21-2020

public class SumLastRunner
{
	public static void main( String args[] )
	{
		int[] one = {-99,1,2,3,4,5,6,7,8,9,10,5};
		int[] two = {10,9,8,7,6,5,4,3,2,1,-99};
		int[] three = {10,20,30,40,50,-11818,40,30,20,10};
		int[] four = {32767};
		int[] five = {255, 255};
		int[] six = {9,10,-88,100,-555,2};
		int[] seven = {10,10,10,11,456};
		int[] eight = {-111,1,2,3,9,11,20,1};
		int[] nine = {9,8,7,6,5,4,3,2,0,-2,6};
		int[] ten = {12,15,18,21,23,1000};
		int[] eleven = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		int[] twelve = {9,10,-8,10000,-5000,-3000};
		
		System.out.println(RaySumLast.go(one));
		System.out.println(RaySumLast.go(two));
		System.out.println(RaySumLast.go(three));
		System.out.println(RaySumLast.go(four));
		System.out.println(RaySumLast.go(five));
		System.out.println(RaySumLast.go(six));
		System.out.println(RaySumLast.go(seven));
		System.out.println(RaySumLast.go(eight));
		System.out.println(RaySumLast.go(nine));
		System.out.println(RaySumLast.go(ten));
		System.out.println(RaySumLast.go(eleven));
		System.out.println(RaySumLast.go(twelve));
	}
}