package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 02-05-2020
//Class - APCSA Period 2
//Lab  - MPH

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	//default constructor
	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}
	
	//specific constructor
	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
	}
	
	//sets private variables to desired values
	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}
	
	//calculate mph
	public void calcMPH()
	{
		double temp = (double) minutes/60;
		mph = distance / (hours + temp);
	}
	
	public void print()
	{
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = "+Math.round(mph) + " MPH.");
		System.out.println("\n\n(The nonrounded MPH is " + mph + " MPH.)");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		String strMPH = String.format("%.0f MPH", mph);
		
		return distance + " miles in " + hours + " hours and " + minutes + " minutes = " + strMPH;
	}
}