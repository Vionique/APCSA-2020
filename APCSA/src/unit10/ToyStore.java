package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		toyList.add(new Toy(toys));
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy mostFrequent = null;
  		int frequency = 0;
  		for (Toy t : toyList) {
  			if (t.getCount() > frequency) {
  				frequency = t.getCount();
  				mostFrequent = t;
  			}
  		}
  		return mostFrequent.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> stock = new ArrayList<Toy>();
  		stock = Count();
  		for (int i = 0; i < stock.size(); i++) {
  			
  		}
  	}  
  	
  	public ArrayList<Toy> Count() {
  		ArrayList<Toy> inventory = new ArrayList<Toy>();
  		
  		for (int i = 0; i < toyList.size(); i++) {
  			int count = 0;
  			for (Toy t : toyList) {
  	  			if (t.getName().equals(toyList.get(i).getName()))
  	  				count++;
  			}
  			
  			inventory.add(new Toy("gi joe", count));
  		}
  		//printInventory(inventory);
  		
  		for (int j = 1; j < inventory.size(); j++){
  			for (int k = 0; k <= j) {
  			String compOne = inventory.get(j).getName();
  			String compTwo = inventory.get(j - 1).getName();
  			if (compOne.equals(compTwo)) {
  				
  			}
  			}
  		}
  		return inventory;
  		
  	}
  	//prints Inventory
  	/*public void printInventory(ArrayList<Toy> inventory) {
  		String list = "inventory:";
		for (Toy t : inventory) {
			list = list + "\n" + t.getName() + " " + t.getCount();
		}
		System.out.println( list );
  	}*/
  	
  	
	public String toString()
	{
		String list = "";
		for (Toy t : toyList) {
			list = list + "\n" + t.getName() + " " + t.getCount();
		}
		return list;
	}
}


