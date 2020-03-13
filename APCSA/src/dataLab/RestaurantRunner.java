package dataLab;

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantRunner{
	
	public static void main(String[] args) {
		DataSource ds = DataSource.connect("https://data.baltimorecity.gov/api/views/k5ry-ef3g/"
				+ "rows.xml?accessType=DOWNLOAD").load();

		ArrayList<RestaurantData> allRest = ds.fetchList(RestaurantData.class, "row/row/name", 
	             "row/row/neighborhood", "row/row/policedistrict",
	             "row/row/zipcode", "row/row/councildistrict");
		//System.out.println(allRest);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of a neighborhood: ");
		String neighborhood = input.next();
		
		System.out.println("Restaurants in " + neighborhood + ": \n");
		int count = 0;
		for (RestaurantData rd: allRest) {
			if (rd.isInNeighborhood(neighborhood)) {
				count++;
				System.out.println(rd.getName() + " in " + neighborhood + ", zipcode: " + rd.getZipcode());
			}
		}
		
		System.out.println("\n\n There are "+ count+ " restaurants in the " + neighborhood + " area.");

	}
}

