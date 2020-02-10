package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMultRunner
{
	public static void main( String args[] )
	{
		System.out.printf("%.1f \n", AddSubMult.check( 10, 20) );		
		System.out.printf("%.1f \n", AddSubMult.check( 20, 10) );	
		System.out.printf("%.1f \n", AddSubMult.check( 20, 20) );
		System.out.printf("%.1f \n", AddSubMult.check( 10, 10) );	
		System.out.printf("%.1f \n", AddSubMult.check( 0, 1) );	
		System.out.printf("%.1f \n",( AddSubMult.check( 1, 0 ) ));	
		System.out.printf("%.1f \n", AddSubMult.check( 3.1, 5.7) );	
		System.out.printf("%.1f \n", AddSubMult.check( 5.2, 3.8 ) );	
		System.out.printf("%.1f \n", AddSubMult.check( 5342, 323 ) );						
	}
}