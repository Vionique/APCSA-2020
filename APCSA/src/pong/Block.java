package pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setColor(Color.black);
		setPos(100,200);
		setWidth(20);
		setHeight(20);

	}
	public Block(int x, int y) {
		setColor(Color.black);
		setPos(x, y);
		setWidth(20);
		setHeight(20);
	}
	public Block(int x, int y, int w, int h) {
		setColor(Color.black);
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		
	}
	public Block(int x, int y, int w, int h, Color c) {
		setColor(c);
		setPos(x, y);
		setWidth(w);
		setHeight(h);
	}
	//add other Block constructors - x , y , width, height, color
	
	
	
	
	
	
   //add the other set methods
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}
	@Override
	public void setX(int x) {
		xPos = x;
		
	}
	@Override
	public void setY(int y) {
		yPos = y;
		
	}
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block compBlock = (Block) obj;
		if (compBlock.getColor().equals(this.getColor()) && compBlock.getX() == this.getX()
				&& compBlock.getWidth() == this.getWidth() 
				&& compBlock.getHeight() == this.getHeight())
			return true;

		return false;
	}

	public boolean didCollideLeft(Object obj) {
		   Wall w = (Wall) obj;
		   if (this.getX() <= w.getX() + w.getWidth()) {
			   return true;
		   }
			return false;
		}
		public boolean didCollideRight(Object obj) {
			Wall w = (Wall) obj;
			if (this.getX() + this.getWidth() >= w.getX())
				return true;
			return false;
		}
		public boolean didCollideTop(Object obj) {
			Wall w = (Wall) obj;
			if (this.getY() >= w.getY() + w.getHeight())
				return true;
			return false;
		}
		public boolean didCollideBottom(Object obj) {
			Wall w = (Wall) obj;
			if (this.getY() + this.getHeight() <= w.getY() + w.getHeight())
				return true;
			return false;
		}
	
	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}   

   //add the other get methods
    
	public String toString() {   //add a toString() method  - x , y , width, height, color
		
		return xPos + " , " + yPos + " , " + width + ", " + height + ", " + color;
	}
}

