package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape{

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super (x, y, wid, ht);
	}
	public FancySnowFlake(int x, int y, int wid, int ht, Color col) {
		super(x, y, wid, ht, col);
	}
	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	
	}
	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.drawLine(getXPos(),getYPos(), getXPos() + getWidth(),  getYPos() + getHeight());
		window.drawLine(getXPos() + getWidth() / 2,getYPos(), getXPos() + getWidth() / 2,  getYPos() + getHeight());
		window.drawLine(getXPos() + getWidth(), getYPos(), getXPos(), getYPos() + getHeight());
		window.drawLine(getXPos(),getYPos() + getHeight() / 2, getXPos() + getWidth(), getYPos() + getHeight() / 2);
		
	}
	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		setColor(Color.BLUE);
		draw(window);
		
		setColor(Color.WHITE);
		setXPos(getXPos() + getXSpeed());
		setYPos(getYPos() + getYSpeed());
		if (getXPos() > 800 || getXPos() < 0) {
			setXPos((int) (Math.random() * 801));
			setYPos(10);
		}
		if (getYPos() > 600) {
			setYPos(10);
		}
		
		draw(window);
	}
	
}



