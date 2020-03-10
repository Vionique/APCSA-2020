package celebLab;

import java.util.ArrayList;

public class MovieCelebrity extends Celebrity{
	private ArrayList<String> hints;
	private String name;
	
	public MovieCelebrity(String answer, String clue) {
		super(answer, clue);
		processClues();
		// TODO Auto-generated constructor stub
	}
	
	public void processClues() {
		String [] clues = super.getClue().split(",");
		hints = new ArrayList<String>();
		for (String currentClue : clues)
		{
			hints.add(currentClue);
		}
	}
	@Override
	public String getClue()
	{
		if (hints.size() == 0)
		{
			processClues();
		}
		String currentClue = hints.remove(0);
		
		return currentClue;
	}
	
	@Override
	public String toString()
	{
		String output = "This is the movie celebrity: " + getAnswer() + ".\nThe clues are:\n";
		
		for (String word : super.getClue().split(","))
		{
			output += word + ", ";
		}
		
		return output;
	}

}

