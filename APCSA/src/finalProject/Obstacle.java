package finalProject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Obstacle extends Block{

	Image image;
	public Obstacle(int x, int y, int s) {
		setPos(x, y);
		setSize(100,100);
		
		setSpeed(s);
		setImage((int)(Math.random() * 3) + 1);
	}

	public void setImage(int i) {
		try
		{
			URL url = getClass().getResource("obstacle"+i+".png");
			//image = ImageIO.read(url);
			try {
				image = ImageIO.read(url);
				ImageObserver observer = null;
				setSize(image.getWidth(observer), image.getHeight(observer));
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
	
	public Image getImage() {
		return image;
	}
	
	public boolean checksCollision(GameShip ship) {
		if (!ship.getShieldOn()) {
			if (ship.getXPos() + ship.getWidth() >= this.getXPos()
					&& ship.getXPos() <= this.getXPos() + this.getWidth()) {
				//System.out.println("checksX");
				if (ship.getYPos() + ship.getHeight() <= this.getYPos() + this.getHeight()
						&& ship.getYPos() + ship.getHeight() >= this.getYPos()) {
					//System.out.println("checksY");
					return true;
				}
			}
		}
		return false;
	}
	
	
	@Override
	public void move(String direction) {
		setXPos(getXPos() - getSpeed());
		int random = (int) (Math.random() * 2);
		if(random == 0) {
			setYPos(getYPos() + 3);
		}
		else {
			setYPos(getYPos() - 3);
		}
		
		if (getXPos() + getWidth() <= 0) {
			setXPos(800);
			setYPos((int) (Math.random() * 500));
		}
	}

	
	@Override
	public void draw(JPanel panel, JLabel icon) {
		panel.remove(icon);
		
		icon.setBounds(getXPos(), getYPos(), getWidth(), getHeight());
		panel.add(icon);
	}
	
	@Override
	public void moveAndDraw(String direction, JPanel panel, JLabel icon) {
		move("");
		draw(panel, icon);
	}

	
	
}