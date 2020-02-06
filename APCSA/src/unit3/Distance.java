package unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-05-2020
//Class - APCSA Period 2
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	
	//default constructor
	public Distance()
	{
		setCoordinates(0,0,0,0);
		distance = 0.0;
	}
	
	//specific constructor
	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
		distance = 0.0;
	}

	//sets values for coordinate positions
	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo  = x2;
		yTwo = y2;
		distance = 0.0;
		
	}

	//calculates distance
	public void calcDistance()
	{
		int xDif = xOne - xTwo;
		int yDif = yOne - yTwo;
		distance = Math.sqrt(xDif*xDif + yDif * yDif);
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println("distance == " + distance);

	}

	public String toString()
	{
		String strDistance = String.format("distance == %.3f ", distance);
		return strDistance;
	}
}