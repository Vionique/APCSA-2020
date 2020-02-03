package unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-03-2020
//Class - APCSA Period 2
//Lab  - Line Lab

public class LineRunner
{
   public static void main( String[] args )
   {
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,9,14,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,18,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 6,4,2,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 4,4,5,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,1,2,9 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,2,9 ) );
		
	}
}

//Expected output
//Slope is :: -0.54
//Slope is :: -0.24
//Slope is :: 0.50
//Slope is :: -1.00
//Slope is :: 8.00
//Slope is :: 2.00