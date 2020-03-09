package celebLab;

import java.util.ArrayList;
/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
	 */
	private ArrayList<String> hints = new ArrayList<String>();
	private String hint;
	/**
	 * The answer or name of the celebrity.
	 */
	private String name;
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
		setAnswer(answer);
		setClue(clue);
	}

	public Celebrity (String answer, ArrayList<String> clues) {
		setAnswer(answer);
		setClues(clues);
	}
	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return hint;
	}

	public ArrayList<String> getClues() {
		return hints;
	}
	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return name;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		hint = clue;
	}
	
	public void setClues(ArrayList<String> clues) {
		for (String c : clues) {
			hints.add(c);
		}
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		name = answer;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		String celeb = name + " - " + hint;
		return celeb;
	}
	
}
