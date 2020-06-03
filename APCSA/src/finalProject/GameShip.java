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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameShip extends Block{

	private Image image;
	private ImageIcon icon;
	private Thread animationThread;
	
	private int shieldTime;
	private int shieldRecharge;
	private boolean shieldRecharged;
	private boolean shieldOn;
	private int blastRadius;
	private int blastRecharge;
	private boolean blastRecharged;
	private boolean blastOn;
	
	public GameShip() {
		super();
		setDefaults();
	}
	
	public GameShip(int x, int y, int w, int h) {
		super (x, y, w, h);
		setDefaults();
	}
	
	public GameShip(int x, int y, int w, int h, int s) {
		super (x, y, w, h, s);
		setDefaults();
	}
	
	public GameShip(int x, int y, int w, int h, int s, Color col) {
		super (x, y, w, h, s, col);
		setDefaults();
	}
	
	public void setShieldTime(int s) {
		shieldTime = s;
	}
	public void setShieldRecharge(int s) {
		shieldRecharge = s;
	}
	public void setShieldRecharged(boolean bool) {
		shieldRecharged = bool;
	}
	public void setBlastRadius(int s) {
		blastRadius = s;
	}
	public void setBlastRecharge(int s) {
		blastRecharge = s;
	}
	public void setBlastRecharged(boolean bool) {
		blastRecharged = bool;
	}
	public void setShield(boolean bool) {
		shieldOn = bool;
	}
	public void setBlastOn(boolean bool) {
		blastOn = bool;
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
	public void setDefaults() {
		setImage("shipSmall.jpg");
		setShieldTime(20);
		setShieldRecharge(20);
		setShieldRecharged(true);
		setShield(false);
		setBlastRadius(100);
		setBlastRecharge(20);
		setBlastRecharged(true);
		setBlastOn(false);
		setSpeed(7);
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
	public boolean getShieldRecharged() {
		return shieldRecharged;
	}
	public int getBlastRadius() {
		return blastRadius;
	}
	public int getBlastRecharge() {
		return blastRecharge;
	}
	public boolean getBlastRecharged() {
		return blastRecharged;
	}
	public boolean getShieldOn() {
		return shieldOn;
	}
	public boolean getBlastOn() {
		return blastOn;
	}
	
	/*public void drawBlast(EndlessGameTwo game) {
		animationThread = new Thread (this, "animation");
		frame = game.getFrame();
		animationThread.start();
		for (int i = 10; i <= getBlastRadius(); i += 10) {
			game.usingBlastLabel.setVisible(true);
			game.setLabelImage(game.usingBlastLabel, "blast" + i + ".png");
			game.usingBlastLabel.setBounds(getXPos() - getWidth() / 2, getYPos()- getHeight()/2
					, i * 2, i * 2);
			System.out.println("blast" + i);
			try {
				animationThread.sleep(200);
				System.out.println("animationThread");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	
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
		//panel.remove(icon);
		
		icon.setBounds(getXPos(), getYPos(), getWidth(), getHeight());
		//panel.add(icon);
	}
	@Override
	public void moveAndDraw( String direction, JPanel panel, JLabel icon) {
		// TODO Auto-generated method stub
		move(direction);
		draw(panel, icon);
	}

}


