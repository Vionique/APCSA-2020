package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Gabby Kang 

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math.*;


public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int choice = (int) (Math.random() * 3);
		if (choice == 0)
			compChoice = "R";
		else if (choice == 1)
			compChoice = "P";
		else if (choice == 2)
			compChoice = "S";

	}

	public String determineWinner()
	{	
		String winner= "";
		String compWin = "\n!Computer wins ";
		String playerWin = "\n!Player wins ";
		String matchUp = "";
		
		if (playChoice.equals(compChoice)) {
			winner = winner + "\n!Draw Game!";
		}  
		
		else if ((playChoice + compChoice).equals("RS") || (playChoice + compChoice).equals("SR")) {
			matchUp = "<<Rock Breaks Scissors>>!";
			if ((playChoice + compChoice).equals("RS"))
				winner = playerWin;
			else
				winner = compWin;
		}
		
		else if ((playChoice + compChoice).equals("SP") || (playChoice + compChoice).equals("PS")) {
			matchUp = "<<Scissors Cut Paper>>!";
			if ((playChoice + compChoice).equals("SP"))
				winner = playerWin;
			else
				winner = compWin;
		}
		
		else if ((playChoice + compChoice).equals("PR") || (playChoice + compChoice).equals("RP")) {
			matchUp = "<<Paper Covers Rock>>!";
			if ((playChoice + compChoice).equals("PR"))
				winner = playerWin;
			else
				winner = compWin;
		}
		return winner + matchUp + "\n\nDo you want to play again? (y/n)";
	}

	public String toString()
	{
		String output= "player had " + playChoice + "\ncomputer had " + compChoice + determineWinner();
		return output;
	}
}