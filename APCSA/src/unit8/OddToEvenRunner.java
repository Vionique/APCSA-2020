package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-21-2020

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		int[] one = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		int[] two = {11,9,8,7,6,5,4,3,2,1,-99,7};
		int[] three = {10,20,30,40,5,41,31,20,11,7};
		int[] four = {32767,70,4,5,6,7};
		int[] five = {2,7,11,21,5,7};
		int[] six = {7,255,11,255,100,3,2};
		int[] seven = {9,11,11,11,7,1000,3};
		int[] eight = {7,7,7,11,2,7,7,11,11,2};
		int[] nine = {2,4,6,8,8};
		
		System.out.println(RayOddToEven.go(one));
		System.out.println(RayOddToEven.go(two));
		System.out.println(RayOddToEven.go(three));
		System.out.println(RayOddToEven.go(four));
		System.out.println(RayOddToEven.go(five));
		System.out.println(RayOddToEven.go(six));
		System.out.println(RayOddToEven.go(seven));
		System.out.println(RayOddToEven.go(eight));
		System.out.println(RayOddToEven.go(nine));
	}
}

