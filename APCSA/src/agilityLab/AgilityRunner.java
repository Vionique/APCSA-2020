package agilityLab;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AgilityRunner {
	public static void main (String[] args) throws IOException {
		System.out.println("APSCA Quarter 3 Final Project: Dog Agility Courses");

		Scanner input = new Scanner(new File("src/agilityLab/contestants.dat"));
		String contestName = input.nextLine();
		
		Competition testComp = new Competition(contestName);
		while (input.hasNext()) {
			String name = input.nextLine();

			String data = input.nextLine();

			Contestant a = new Contestant (name, data);

			testComp.addToList(a);

		}
		System.out.println(testComp);
		
		System.out.println("SORTED (alphabetically) :: ");
		testComp.sortAlphabet();
		System.out.println(testComp);
		
		System.out.println("SORTED (ascending by average) :: ");
		testComp.sortAverage();
		System.out.println(testComp);
		
		testComp.makeFailureList();
		
		System.out.print("\nSearching for Tex's Average :: ");
		System.out.print(testComp.getContestantAverage("Tex"));		
		System.out.print("\nSearching for Kirby's Average :: ");
		System.out.println(testComp.getContestantAverage("Kirby"));
		
		System.out.println("\nFastest Average Time :: " + testComp.getLowestAverage());
		System.out.println("Slowest Average Time :: " + testComp.getHighestAverage());
		System.out.printf("Competition Average :: %.2f", testComp.getCompAverage() );
	}
}
