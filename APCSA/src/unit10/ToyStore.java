package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang, 34

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
  		for (Toy t : Count()) {
  			if (t.getCount() > frequency) {


  				frequency = t.getCount(); 

  				frequency = t.getCount();

  				mostFrequent = t;
  			}
  		}
  		return mostFrequent.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> stock = new ArrayList<Toy>();
  		ArrayList<Toy> inventory = new ArrayList<Toy>();
  		stock = Count();
  		for (int i = 1; i < stock.size(); i++) {
  			for (int j = 0; j < i; j++) {
  				if (stock.get(j).getCount() > stock.get(i).getCount()) {
  					Toy temp = stock.get(j);
  					stock.set(j, stock.get(i));
  					stock.set(i, temp);
  				}
  			}
  		}
  		printInventory(stock);
  	}  
  	
  	public ArrayList<Toy> Count() {
  		ArrayList<Toy> inventoryOne = new ArrayList<Toy>();
  		ArrayList<Toy> inv = new ArrayList<Toy>();
  		
  		for (int i = 0; i < toyList.size(); i++) {
  			int count = 0;
  			for (Toy t : toyList) {
  	  			if (t.getName().equals(toyList.get(i).getName()))
  	  				count++;
  			}
  			
  			inventoryOne.add(new Toy(toyList.get(i).getName(), count));
  		}
  		int sizeOne = inventoryOne.size();
  		String[] names = new String[sizeOne];
  		Integer[] count = new Integer[sizeOne];

  		for (int i = 0; i < sizeOne; i++) {
  			names[i] = inventoryOne.get(i).getName();
  			count[i] = inventoryOne.get(i).getCount();
  		}
  		inv.add(new Toy(names[0], count[0]));
  		for (int j = 2; j < names.length; j++) {
  			if( noDuplicates(names, j)) {
  				String a = names[j];
  				int c = count[j];
  				inv.add(new Toy(a, c));
  			}
  		}
 
  		return inv;
  		
  	}
  	
  	private static boolean noDuplicates(String[] n, int index) {
 
  			for (int j = 1; j < index; j++) {
  				String one = n[index];
  				String two = n[j];
  				if (two.equals(one)) {
  					return false;
  				}
  			}
  		
  		return true;
  	}
  	
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


