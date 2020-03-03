package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	private int arraySize;
	public Doggies(int size)
	{
		pups =  new Dog[size];
		arraySize = pups.length;
		
		System.out.println("Size = " + arraySize);

		
	}
	
	public void set(int spot, int age, String name)
	{

		
		if (spot < arraySize) {
			pups[spot] = new Dog(age, name);

		}
		
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int maxAge = 0;
		Dog oldest = null;
		for (Dog d : pups) {
			if (d.getAge() > maxAge) {
				maxAge = d.getAge();
				oldest = d;
			}
		}
		return oldest.getName();
	}

	public String getNameOfYoungest()
	{
		if (arraySize > 1) {
			int youngest = pups[0].getAge();
			int index = 0;
			for (int i = 1; i < pups.length; i++) {
				if (pups[i].getAge() < youngest)
					index = i;
			}
			return pups[index].getName();
		}
		return null;
	}

	public String toString()
	{
		String pack = "";

		for (int i = 0; i < pups.length; i++) {
			pack = pack + pups[i].getName();
			if (i != (pups.length - 1))
				pack = pack + ", ";
		}
		return pack;
	}
}


