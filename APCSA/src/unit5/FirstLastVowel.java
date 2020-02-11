package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang
//Date - 02-11-2020


public class FirstLastVowel
{
   public static String go( String a )
	{
	   	String firstLetter = a.substring(0,1);
	   	firstLetter = firstLetter.toUpperCase();
	   	
	   	String lastLetter = a.substring(a.length() - 1, a.length());
	   	lastLetter = lastLetter.toUpperCase();
	   	
	   	if ((firstLetter.equals("A")) || (firstLetter.equals("E")) || 
	   		(firstLetter.equals("I"))|| (firstLetter.equals("O")) || 
	   		(firstLetter.equals("U")))
	   		return "Yes";
	   	if ((lastLetter.equals("A")) || (lastLetter.equals("E")) || 
		   		(lastLetter.equals("I"))|| (lastLetter.equals("O")) || 
		   		(lastLetter.equals("U")))
	   		return "Yes";
	   	return "No";
	}
}