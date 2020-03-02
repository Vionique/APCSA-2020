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
		Dog[] pups =  new Dog[size];
		arraySize = pups.length;
		System.out.println("Size = " + arraySize);

		//pups[0] = new Dog(1, "FIRST");
		//pups[1] = new Dog(2, "SECOND");
		//point pups at a new arry of Dog
		
	}
	
	public void set(int spot, int age, String name)
	{
		
		if (spot < arraySize) {
			pups[spot] = new Dog(age, name);
			System.out.println(spot);
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
		return "" + Arrays.toString(pups);
	}
}
