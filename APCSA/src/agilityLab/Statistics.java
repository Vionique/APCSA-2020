package agilityLab;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Statistics{
	ArrayList<Double> runTimesList;
	int size;
	
	public Statistics() {
		setList("");
		setSize(0);
	}
	
	public Statistics(String list) {
		setList(list);
	}
	
	public void setList(String list) {
		runTimesList = new ArrayList<Double>();
		Scanner setup = new Scanner(list);
		int maxIndex = setup.nextInt();
		setSize(maxIndex);
		setup.next();
		
		for (int i = 0; i < maxIndex; i++) {
			runTimesList.add(setup.nextDouble());
		}
	}
	public void setSize(int s) {
		size = s;
	}
	public void resetTime(int index, double time) {
		runTimesList.set(index, time);
	}
	
	public double calcSum() {
		double sum = 0.0;
		for (Double t : runTimesList) {
			sum += t;
		}
		return sum;
	}
	
	public double getLowest() {
		if (size == 0)
			return 0.0;
		double minTime = runTimesList.get(0);
		for (Double t : runTimesList) {
			if (t < minTime)
				minTime = t;
		}
		return minTime;
	}
	
	public double getHighest() {
		if (size == 0)
			return 0.0;
		double maxTime = runTimesList.get(0);
		for (Double t : runTimesList) {
			if (t >maxTime)
				maxTime = t;
		}
		return maxTime;
	}
	
	public int getSize() {
		return size;
	}
	
	public String toString() {
		String output = "";
		for (Double t : runTimesList) {
			output = output + t + "  ";
		}
		return output;
	}
}

