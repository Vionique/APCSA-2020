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
  		ArrayList<Toy> inventoryOne = new ArrayList<Toy>();
  		ArrayList<Toy> inventoryEnd = new ArrayList<Toy>();
  		inventoryEnd.add(new Toy("placeholder"));
  		inventoryEnd.add(new Toy("placeholder"));
  		ArrayList<Integer> remove = new ArrayList<Integer>();
  		
  		for (int i = 0; i < toyList.size(); i++) {
  			int count = 0;
  			for (Toy t : toyList) {
  	  			if (t.getName().equals(toyList.get(i).getName()))
  	  				count++;
  			}
  			
  			inventoryOne.add(new Toy(toyList.get(i).getName(), count));
  		}
  		
  		for (Toy t : inventoryOne) { 
  			for (int i = 0; i < inventoryEnd.size(); i++) {
  				if (i != 0)
  				{
	  				String one = inventoryEnd.get(i).getName();
	  				String two = t.getName();
	  				if (!(one.equals(two)))
	  					inventoryEnd.add(i, t);
  				}
  					
  				else 
  					inventoryEnd.set(0, t);
  			}
  			
        }
  		inventoryEnd.remove(0); 
  		printInventory(inventoryEnd);
  		return inventoryEnd;
  		
  	}
  	//prints Inventory
  	public void printInventory(ArrayList<Toy> inventory) {
  		String list = "inventory:";
		for (Toy t : inventory) {
			list = list + "\n" + t.getName() + " " + t.getCount();
		}
		System.out.println( list );
  	}
  	
  	
	public String toString()
	{
		String list = "";
		for (Toy t : toyList) {
			list = list + "\n" + t.getName() + " " + t.getCount();
		}
		return list;
	}
}


