package finalProject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
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
	@Override
	public void move(String direction) {
		setXPos(getXPos() - getSpeed());
		int random = (int) (Math.random() * 2);
		if(random == 0) {
			setYPos(getYPos() + 1);
		}
		else {
			setYPos(getYPos() - 1);
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