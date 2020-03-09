package celebLab;


/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		Celebrity test = new Celebrity ("T. Est", "test");
		System.out.println("Name :: " + test.getAnswer());
		System.out.println("Clue :: " + test.getClue());
		System.out.println(test);
	}
}
