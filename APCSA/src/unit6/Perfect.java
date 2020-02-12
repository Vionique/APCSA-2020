package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect() {
	   setNumber(0);
   }
   
   public Perfect(int num) {
	   setNumber(num);
   }
   
   public void setNumber(int num) {
	   number = num;
   }

	public boolean isPerfect()
	{
		int sum = 0;
		for (int i = 1; i < number; i ++) {
			if ((number % i) == 0)
				sum += i;
		}
		
		if (sum == number)
			return true;
		else
			return false;
	}

	public String toString() {
		if (isPerfect())
			return number + " is perfect. \n";
		else
			return number + " is not perfect. \n";
	}
	//add a toString	
	
}