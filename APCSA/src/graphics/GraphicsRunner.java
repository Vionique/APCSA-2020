package graphics;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 03-04-2020
//Class - APCSA Period 2
//Lab  - Graphics Lab

import javax.swing.JFrame; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("MAKE YOUR OWN SHAPE");

		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new ShapePanel());

		getContentPane().add(new MovingShapePanel());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//makes 'x' button actually close
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}



