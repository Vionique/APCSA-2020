package dataLab;

/*
 * Arrays of objects 
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList(WeatherStation.class, "station/station_name", 
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
         }
      }
      
      //90.0 degrees is max latitude
      double minLat = 90.0;
      WeatherStation south = null;
      for (WeatherStation ws : allstns) {
    	  if (ws.getLatitude() < minLat) {
    		  minLat = ws.getLatitude();
    		  south = ws;
    	  }
      }
      System.out.println("\n\n  " + south.getId() + ": " + south.getName() + " at " + south.getLatitude());
   }
}


