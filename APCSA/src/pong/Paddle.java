package pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
	   setSpeed(5);
   }

   public Paddle(int x, int y) {
	   super (x, y);
	   setSpeed(5);
   }
   public Paddle (int x, int y, int s) {
	   super (x, y);
	   setSpeed(s);
   }
   public Paddle (int x, int y, int w, int h, int s)
   {
	   super (x, y, w, h);
	   setSpeed (s);
   }
   public Paddle (int x, int y, int w, int h, Color c, int s) {
	   super (x, y, w, h, c);
	   setSpeed(s);
   }



   public void setSpeed(int s) {
	   speed = s;
   }


   public void moveUpAndDraw(Graphics window)
   {
	   super.draw(window, Color.white);
	   setY(getY() - getSpeed());
	   super.draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   super.draw(window, Color.white);
	   setY(getY() + getSpeed());
	   super.draw(window);

   }

   public boolean equals(Object obj) {
	   Paddle testPaddle = (Paddle) obj;
	   if (super.equals(obj) && testPaddle.getSpeed() == this.getSpeed())
		   return true;
	   return false;
   }
   
   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   //add a toString() method
   public String toString() {
	   return super.toString() + "  " + getSpeed();
   }
}



