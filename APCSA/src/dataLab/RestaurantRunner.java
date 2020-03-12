package dataLab;

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantRunner{
	
	public static void main(String[] args) {
		//DataSource ds = DataSource.connect("https://data.baltimorecity.gov/api/views/k5ry-ef3g/rows.xml?accessType=DOWNLOAD");
		DataSource ds = DataSource.connect("https://data.baltimorecity.gov/resource/k5ry-ef3g/" + "rows" + ".xml").load();
		System.out.println(ds.fetchString("rows/name"));
		//ds.printUsageString();

		/*ArrayList<RestaurantData> allRest = ds.fetchList(RestaurantData.class, "restaurant/name", 
	             "restaurant/neighborhood", "restaurant/policedistrict",
	             "restaurant/zipcode", "restaurant/councildistrict");*/
	}
}

