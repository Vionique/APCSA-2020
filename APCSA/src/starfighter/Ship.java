package starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
		super(x, y);
	   //add code here
		try
		{
			URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public Ship(int x, int y, int s)
	{
		super (x, y);
		setSpeed(s);
	   //add code here
		try
		{
			URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Image Error");
		}
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		setSpeed(s);
		try
		{
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		//add code here
		if (direction.equals("LEFT")) {
			if (getX() > 20)
				setX(getX() - speed);
			
		}
		if (direction.equals("RIGHT")) {
			if (getX() < 780)
				setX(getX() + speed);
			
		}
		if (direction.equals("UP")) {
			if (getY() > 300)
			setY(getY() - speed);
		}
		if (direction.equals("DOWN")) {
			if (getY() < 560)
				setY(getY() + speed);
		}
		
		
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
		//window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
