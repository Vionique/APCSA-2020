package dataLab;

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantRunner{
	
	public static void main(String[] args) {
		DataSource ds = DataSource.connect("https://data.baltimorecity.gov/api/views/k5ry-ef3g/rows.xml?accessType=DOWNLOAD").load();
		//DataSource ds = DataSource.connect("https://data.baltimorecity.gov/resource/k5ry-ef3g/" + "row-qd32-u32j.7y49").load();
		//System.out.println(ds.fetchString("row/row/name"));
		//ds.printUsageString();

		ArrayList<RestaurantData> allRest = ds.fetchList(RestaurantData.class, "row/row/name", 
	             "row/row/neighborhood", "row/row/policedistrict",
	             "row/row/zipcode", "row/row/councildistrict");

			System.out.println(ds.fetchString(allRest.get(0).getName()));

	}
}

