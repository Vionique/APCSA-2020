package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		for (int i = 1; i < wordRay.length; i++) {
			String temp = wordRay[i];
			int sortIndex = i;
			while (sortIndex > 0 && (temp.compareToIgnoreCase(wordRay[sortIndex - 1]) < 0)) {
				wordRay[sortIndex] = wordRay[sortIndex - 1];
				sortIndex--;
			}
			wordRay[sortIndex] = temp;
		}
	}

	public String toString()
	{
		String output="";
		for (String w : wordRay) {
			output = output + w + "\n";
		}
		return output+"\n\n";
	}
}
