package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int i = 1; i < str.length(); i ++) {
			if (str.charAt(i - 1) == str.charAt(i))
				count ++;
		}
		
		return count;
	}
}