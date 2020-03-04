package graphics;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 03-04-2020
//Class - APCSA Period 2
//Lab  - Graphics Lab

import java.awt.Font; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MovingShapePanel extends JPanel implements Runnable
{
	private Shape sh;
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	public MovingShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//refer sh to a new Shape


		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		
		
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		//tell sh to move and draw
		Shape sh = new Shape(100, 100, 200, 300, Color.GREEN, 50, 50);
		
		
		shapes.add(sh);
		
		for (Shape s : shapes) {
			s.moveAndDraw(window);
			if(!(s.getX()>=10 && sh.getX()<getWidth() - s.getWidth()))
			{
				s.setXSpd(-s.getXSpd());
			}
			
			if(!(s.getY()>=10 && s.getY()<=getHeight() - s.getHeight()))
			{
				s.setYSpd(-s.getYSpd());
			}
		}
		
		sh.draw(window);
		
		
		
		
		/*do{
			sh.moveAndDraw(window);
		}while (sh.getX() >= 10 && sh.getY() >= 10 && sh.getX()<=200 && sh.getY()<=200);*/

		/*sh.moveAndDraw(window);
		sh.moveAndDraw(window);
		while(!((sh.getX()>=10 && sh.getX()<=730))){
			sh.moveAndDraw(window);
		}*/
		
		//this code handles the left and right walls
		/* uncomment once Shape is built
		 */
		if(!(sh.getX()>=10 && sh.getX()<=730))
		{
			sh.setXSpd(-sh.getXSpd());
		}
		

		//add code to handle the top and bottom walls

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(10);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}


