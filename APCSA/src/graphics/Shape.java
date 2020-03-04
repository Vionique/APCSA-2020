package graphics;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gabby Kang
//Date - 03-04-2020
//Class - APCSA Period 2
//Lab  - Graphics Lab

import java.awt.Color; 
import java.awt.Graphics;
//import java.util.concurrent.*;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = xSpd;
		ySpeed = ySpd;
		//finish this constructor
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);

      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
   }

   public void moveAndDraw(Graphics window)
   {
	   
	   draw(window, Color.WHITE);
	   xPos = xPos + xSpeed;
	   yPos = yPos + ySpeed;
	   draw(window);
	  
    	//not needed yet
   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public int getX()
   {
   	return xPos;
   }

   public void setX( int x )
   {
	   xPos = x;
   	//add code here
   }
   
   public int getY()
   {
   	return yPos;
   }

   public void setY( int y )
   {
	   yPos = y;
   	//add code here
   }

   public int getXSpd() {
	   return xSpeed;
   }
   public void setXSpd (int xSpd) {
	   xSpeed = xSpd;
   }
   
   public int getYSpd() {
	   return ySpeed;
   }
   public void setYSpd(int ySpd) {
	   ySpeed = ySpd;
   }
   public int getHeight() {
	   return height;
   }
   public int getWidth() {
	   return width;
   }
   
   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}



