package agilityLab;

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Comparable;


public class Contestant implements Comparable<Contestant>{
	private String name;
	private Statistics runTimes;
	
	public Contestant() {
		setName("");
		setList("");
	}
	
	public Contestant(String nm, String list) {
		setName(nm);
		setList(list);
	}
	
	public double calcAverage() {
		return runTimes.calcSum() / runTimes.getSize();
	}
	
	@Override
	public int compareTo(Contestant param)
	{
		if(calcAverage()>param.calcAverage())
		  return 1;
		else if (calcAverage()<param.calcAverage())
		  return -1;
		return 0;
	}	
	
	@Override
	public boolean equals (Object obj) {
		return true;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	public void setList(String list) {
		runTimes = new Statistics(list); 
	}
	public void setTime(int index, double time) {
		runTimes.resetTime(index, time);
	}
	
	public String getName() {
		return name;
	}
	public double getHighest() {
		return runTimes.getHighest();
	}
	public double getLowest() {
		return runTimes.getLowest();
	}
	public int getSize() {
		return runTimes.getSize();
	}
	
	public String toString() {
		String output = "";
		output = name + ":  \t" + runTimes.toString();
		return output;
	}
}
