package pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {  
		super (x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball (int x, int y, int w, int h) {
		super (x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c) {
		super (x, y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball (int x, int y, int w, int h, Color c, int xS, int yS) {
		super (x, y, w, h, c);
		xSpeed = xS;
		ySpeed = yS;
	}
   //add the set methods
   
	public void setxSpeed(int x) {
		xSpeed = x;
	}
	public void setySpeed(int y) {
		ySpeed = y;
	}
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location

	   super.draw(window, Color.white);

	   setX(getX()+xSpeed);
		//setY
	   setY(getY()+ySpeed);
		//draw the ball at its new location
	   super.draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball testBall = (Ball) obj;
		if (super.equals(obj) && this.getxSpeed() == testBall.getxSpeed()
				&& this.getySpeed() == testBall.getySpeed())
			return true;
		return false;
	}   

   //add the get methods
	public int getxSpeed() {
		return xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
   //add a toString() method
	public String toString() {
		return super.toString() + "  " + getxSpeed() + " " + getySpeed();
	}
}

