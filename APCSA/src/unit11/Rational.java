package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Gabby Kang

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num, den;
	//write two constructors
	public Rational() {
		setRational(1, 1);
	}
	
	public Rational(int n, int d) {
		setRational(n, d);
	}

	//write a setRational method
	public void setRational(int n, int d) {
		setNumerator(n);
		setDenominator(d);
	}
	//write  a set method for numerator and denominator
	public void setNumerator (int n) {
		num = n;
	}
	public void setDenominator (int d) {
		den = d;
	}
	
	public void add(Rational  other)
	{
		num = num * other.getDen() + other.getNum() * den;
		den = den * other.getDen();
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)

		reduce();
	}

	private void reduce()
	{
		int divisor = gcd(num, den);
		while (divisor != 1) {
			num = num / divisor;
			den = den/divisor;
			divisor = gcd(num, den);
		}
	}

	private int gcd(int numOne, int numTwo)
	{
		int smaller;
		if (numOne < numTwo)
			smaller = numOne;
		else
			smaller = numTwo;
		for (int i = smaller; i >=1; i--) {
			if ((numOne % i) == 0 && (numTwo % i) == 0)
				return i;
		}
		return 1;
	}

	public Rational clone ()
	{
		Rational cloned = new Rational(num, den);
		return cloned;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	
	
	public boolean equals( Rational obj)
	{
		reduce();
		obj.reduce();
		if ((num == obj.getNum()) && (den == obj.getDen()))
			return true;
		return false;
	}

	public int compareTo(Rational other)
	{
		double one = (double) num / den;
		double two = (double) other.getNum() / other.getDen();
		
		if (one < two)
			return -1;
		if (one > two)
			return 1;
		return 0;
	}



	
	//write  toString() method
	public String toString() {
		String fraction = num + " / " + den;
		return fraction;
	}
	
}

