package pong;

import java.awt.Color;
import java.awt.Graphics;

public class InvisibleBall extends Ball{
	int invisibleCount;
	public InvisibleBall()
	   {
			super();
			invisibleCount = 0;
	   }

	   public InvisibleBall(int x, int y)
	   {
		   super(x,y);
		   invisibleCount = 0;


	   }

	   public InvisibleBall(int x, int y, int wid, int ht)
	   {
		   super(x, y, wid, ht);
		   invisibleCount = 0;

	   }

	   public InvisibleBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
	   {
		   super (x, y, wid, ht, xSpd, ySpd);
		   invisibleCount = 0;

	   }

	   public InvisibleBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	   {

		   super (x, y, wid, ht, col, xSpd, ySpd);
		   invisibleCount = 0;

	   }

	   public void invisible() {
		   int invis = (int) (Math.random() * 100);
		   if (invis < 10 && invisibleCount == 0) {
			   invisibleCount = 10;
			   setColor(Color.white);
		   }
		   else {
			   if (invisibleCount == 0)
				   setColor(Color.blue);
			   else
				   invisibleCount--;
		   }
			   
	   }
	   @Override
	   public void moveAndDraw(Graphics window)
	   {
		   super.draw(window, Color.white);

		   setX(getX()+ getxSpeed());
			//setY
		   setY(getY()+ getySpeed());
			//draw the ball at its new location
		  invisible();
		  super.draw(window);
		   

	   }	
}

