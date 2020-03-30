package agilityLab;

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Competition{
	String name;
	ArrayList<Contestant> contestantList;
	
	public Competition(){
		setName("");
		contestantList = new ArrayList<Contestant>();
	}
	
	public Competition(String nm){
		setName(nm);
		contestantList = new ArrayList<Contestant>();
	}
	
	public void addToList(Contestant c) {
		contestantList.add(c);
	}
	
	/*
	 * sort
	 * getCompetitionAverage
	 * getContestantAverage (searching by index and name)
	 * getStudentName (using index)
	 * getHighest Average
	 * getLowestAverage
	 * getFailureList
	 * 
	 * */
	
	public void sortAverage() {
		for (int i = 0; i < contestantList.size() - 1; i++) {
			int index = i;
			for (int j = i + 1; j < contestantList.size(); j++) {
				if (contestantList.get(j).calcAverage() < contestantList.get(index).calcAverage())
					index = j;
			}
			Contestant temp = contestantList.get(i);
			contestantList.set(i, contestantList.get(index));
			contestantList.set(index, temp);
		}
	}
	
	public void sortAlphabet() {
		for (int i = 0; i < contestantList.size() - 1; i++) {
			int index = i;
			for (int j = i + 1; j < contestantList.size(); j++) {
				if (contestantList.get(j).getName().compareTo(contestantList.get(index).getName()) < 0)
					index = j;
			}
			Contestant temp = contestantList.get(i);
			contestantList.set(i, contestantList.get(index));
			contestantList.set(index, temp);
		}
	}
	
	public double getCompAverage() {
		double sum = 0.0;
		for (Contestant c : contestantList) {
			sum = sum + c.calcAverage();
		}
		return sum / contestantList.size();
	}
	
	public double getContestantAverage(int index) {
		return contestantList.get(index).calcAverage();
	}
	
	public double getContestantAverage(String name) {
		sortAlphabet();
		int lowerIndex = 0;
		int upperIndex = contestantList.size();
		
		while (lowerIndex < upperIndex) {
			int middle = (lowerIndex + upperIndex) / 2;
			String compare = contestantList.get(middle).getName();
			if (name.compareTo(compare) < 0)
				upperIndex = middle - 1;
			else if (name.compareTo(compare) > 0)
				lowerIndex = middle + 1;
			else if (name.compareTo(compare) == 0)
				return contestantList.get(middle).calcAverage();
		}
		
		return -1.0;
	}
	

	
	public String getStudentName(int index) {
		return contestantList.get(index).getName();
	}
	
	public String getHighestAverage() {
		if (contestantList.size() == 0)
			return "";
		double max = -1.0;
		Contestant temp = null;
		for (Contestant c : contestantList) {
			if (c.calcAverage() > max) {
				max = c.calcAverage();
				temp = c;
			}
		}
		return temp.getName();
	}
	
	public String getLowestAverage() {
		if (contestantList.size() == 0)
			return "";
		Contestant temp = contestantList.get(0);
		double min = contestantList.get(0).calcAverage();
		for (Contestant c : contestantList) {
			if (c.calcAverage() < min) {
				min = c.calcAverage();
				temp = c;
			}
		}
		return temp.getName();
	}
	
	//conditions for failure is an average more than 90 seconds
	public void makeFailureList() {
		ArrayList<Contestant> failureList = new ArrayList<Contestant>();
		for (Contestant c : contestantList) {
			if (c.calcAverage() >= 40)
				failureList.add(c);
		}
		printList(failureList, "fail");
	}
	
	public void printList(ArrayList<Contestant> arr, String a) {
		if (a.contentEquals("fail"))
			System.out.println("FAILED ::");
		for (Contestant c : arr) {
			System.out.println(c.toString());
		}
	}
	
	public void setName(String nm) {
		name = nm;
	}

	
	public String getName() {
		return name;
	}

	
	public String toString() {
		String output = "";
		for (Contestant c : contestantList) {
			output = output + c.toString() + "\n";
		}
		return output;
	}
	
}
