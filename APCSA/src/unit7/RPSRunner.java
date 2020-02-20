package unit7;  
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Gabby Kang 

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "y";
		
		//add in a do while loop after you get the basics up and running
		while (response.equals("y")){
			String player = "";
		
			out.print("\nRock, Paper, Scissors -- Shoot [R,P,S] :: ");
			
			//read in the player value
			
			player = keyboard.next();
			RockPaperScissors game = new RockPaperScissors(player);

			System.out.println(game);
			response = keyboard.next();
			//response = "n";
		}
	}
}

  

