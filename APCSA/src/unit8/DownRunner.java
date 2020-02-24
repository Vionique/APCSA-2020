package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-21-2020

public class DownRunner
{
	public static void main( String args[] )
	{
		int[] one = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		int[] two = {10,9,8,7,6,5,4,3,2,1,-99};
		int[] three = {10,20,30,40,50,-11818,40,30,20,10};
		int[] four = {32767};
		int[] five = {255, 255};
		int[] six = {9,10,-88,100,-555,1000};
		int[] seven = {10,10,10,11,456};
		int[] eight = {-111,1,2,3,9,11,20,30};
		int[] nine = {9,8,7,6,5,4,3,2,0,-2,-989};
		int[] ten = {12,15,18,21,23,1000};
		int[] eleven = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		int[] twelve = {9,10,-8,10000,-5000,1000};
		
		System.out.println(RayDown.go(one));
		System.out.println(RayDown.go(two));
		System.out.println(RayDown.go(three));
		System.out.println(RayDown.go(four));
		System.out.println(RayDown.go(five));
		System.out.println(RayDown.go(six));
		System.out.println(RayDown.go(seven));
		System.out.println(RayDown.go(eight));
		System.out.println(RayDown.go(nine));
		System.out.println(RayDown.go(ten));
		System.out.println(RayDown.go(eleven));
		System.out.println(RayDown.go(twelve));
	}
}

