package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Gabby Kang

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		BiggestDouble runTwo = new BiggestDouble(14.51, 6.17, 71.8, 1.0);
		BiggestDouble runThree = new BiggestDouble(41.15, 816.7, 17.8, 19.0);
		BiggestDouble runFour = new BiggestDouble(884.5, 16.7, 7.8, 9.0);
		BiggestDouble runFive= new BiggestDouble(4.5, -456.7, 677.8, 9.0);
		BiggestDouble runSix= new BiggestDouble(4.5, 16.7, -7.8, -9.0);

		System.out.println(run);
		System.out.println(runTwo);
		System.out.println(runThree);
		System.out.println(runFour);
		System.out.println(runFive);
		System.out.println(runSix);

		//add more test cases
				
	}
}