package finalProject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameShip extends Block{

	private Image image;
	private ImageIcon icon;
	
	private int shieldTime;
	private int shieldRecharge;
	private int blastRadius;
	private int blastRecharge;
	
	public GameShip() {
		super();
		setImage("shipSmall.jpg");
		setShieldTime(0);
		setShieldRecharge(60);
		setBlastRadius(0);
		setBlastRecharge(60);
		setSpeed(5);
	}
	
	public GameShip(int x, int y, int w, int h) {
		super (x, y, w, h);
		setImage("shipSmall.jpg");
		setShieldTime(0);
		setShieldRecharge(60);
		setBlastRadius(0);
		setBlastRecharge(60);
		setSpeed(5);
	}
	
	public GameShip(int x, int y, int w, int h, int s) {
		super (x, y, w, h, s);
		setShieldTime(0);
		setShieldRecharge(60);
		setBlastRadius(0);
		setBlastRecharge(60);
		setImage("shipSmall.jpg");
		setSpeed(s);
	}
	
	public GameShip(int x, int y, int w, int h, int s, Color col) {
		super (x, y, w, h, s, col);
		setShieldTime(0);
		setShieldRecharge(60);
		setBlastRadius(0);
		setBlastRecharge(60);
		setSpeed(s);
		setImage("shipSmall.jpg");
	}
	
	public void setShieldTime(int s) {
		shieldTime = s;
	}
	public void setShieldRecharge(int s) {
		shieldRecharge = s;
	}
	public void setBlastRadius(int s) {
		blastRadius = s;
	}
	public void setBlastRecharge(int s) {
		blastRecharge = s;
	}
	public void setImage(String imageName) {
		try
		{
			URL url = getClass().getResource(imageName);
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
	
	public Image getImage()
	{	
		return image;
	}
	public int getShieldTime() {
		return shieldTime;
	}
	public int getShieldRecharge() {
		return shieldRecharge;
	}
	public int getBlastRadius() {
		return blastRadius;
	}
	public int getBlastRecharge() {
		return blastRecharge;
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