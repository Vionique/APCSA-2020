package finalProject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameShip extends Block{

	private Image image;
	private ImageIcon icon;
	public GameShip() {
		super();
		setImage("shipSmallOne.jpg");
	}
	
	public GameShip(int x, int y, int w, int h) {
		super (x, y, w, h);
		setImage("shipSmallOne.jpg");
		setSpeed(5);
	}
	
	public GameShip(int x, int y, int w, int h, int s) {
		super (x, y, w, h, s);
		setImage("shipSmallOne.jpg");
		setSpeed(5);
	}
	
	public GameShip(int x, int y, int w, int h, int s, Color col) {
		super (x, y, w, h, s, col);
		setImage("shipSmallOne.jpg");
	}
	
	// from Starfighter ship class
	public void setImage(String imageName) {
		try
		{
			URL url = getClass().getResource(imageName);
			//image = ImageIO.read(url);
			try {
				image = ImageIO.read(url);
			} catch (IOException e) {
				e.printStackTrace();
				image = null;
			}
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Error");
		}
	}
	
	public Image getImage()
	{	
		return image;
	}
	
	@Override
	public void move(String direction) {
		if (getYPos() > 20 && getYPos() < 580) {
			if (direction.contentEquals("UP"))
				setYPos(getYPos() - getSpeed());
			if (direction.contentEquals("DOWN"))
				setYPos(getYPos() + getSpeed());
		}
		if (getXPos() > 0 && getXPos() < 750) {
			if (direction.contentEquals("LEFT"))
				setXPos(getXPos() - getSpeed());
			if (direction.contentEquals("RIGHT"))
				setXPos(getXPos() + getSpeed());
		}
	}

	@Override
	public void draw(JPanel panel, JLabel icon) {
		panel.remove(icon);
		
		icon.setBounds(getXPos(), getYPos(), getWidth(), getHeight());
		panel.add(icon);
	}
	@Override
	public void moveAndDraw( String direction, JPanel panel, JLabel icon) {
		// TODO Auto-generated method stub
		move(direction);
		draw(panel, icon);
	}
	
}