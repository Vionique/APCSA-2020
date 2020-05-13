package starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private Color color;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		super (x, y);
		setColor(Color.YELLOW);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super (x, y);
		setSpeed(s);
		setColor(Color.YELLOW);
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	public void setColor(Color col) {
		color = col;
	}
	public Color getColor() {
		return color;
	}
	
	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.fillRect(getX(), getY(), 5, 5);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		setY(getY() - getSpeed());
		
	}
	public void moveAndDraw(Graphics window) {
		setColor(Color.BLACK);
		draw(window);
		move("");
		setColor(Color.YELLOW);
		draw(window);
	}

	public String toString()
	{
		return "";
	}
}
