package finalProject;

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Ship extends Block{

	private Image image;
	private ImageIcon icon;
	public Ship() {
		super();
		setImage("ship.jpg");
	}
	public Ship(int x, int y, int w, int h, int s, Color col) {
		super (x, y, w, h, s, col);
		setImage("ship.jpg");
	}
	
	// from Starfighter ship class
	public void setImage(String imageName) {
		try
		{
			URL url = getClass().getResource(imageName);
			//image = ImageIO.read(url);
			icon = new ImageIcon("ship.jpg");
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Error");
		}
	}
	
	public ImageIcon getIcon()
	{	
		return icon;
	}
	
	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics window) {
		window.drawImage(image,getXPos(),getYPos(),getWidth(),getHeight(),null);
	}
	@Override
	public void moveAndDraw(Graphics window, String direction) {
		// TODO Auto-generated method stub
		move(direction);
		draw(window);
	}
	
}