package winterScene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowManArms extends AbstractShape{
	private int rightX, rightY;
	private int leftspeed  = 1;
	private int rightspeed = 1;
	private int leftX, leftY;
	private final int ARMLENGTH;
	
	public SnowManArms(int x, int y, int w, int h) {
		super(x + w/8, y - h / 4, w, h);

		
		ARMLENGTH = (int) Math.sqrt(w * w + h * h);
		leftX = getXPos() - (int) Math.sqrt((double)ARMLENGTH / 2);
		leftY = getYPos() - (int) Math.sqrt((double) ARMLENGTH / 2);
		
		rightX = getXPos() + getWidth()/3 + (int) Math.sqrt((double)ARMLENGTH / 2);
		rightY = getYPos() - (int) Math.sqrt((double)ARMLENGTH / 2);
	}
	
	public void draw(Graphics window){
		
	    window.drawLine(getXPos() + getWidth()/8, getYPos() + getHeight()/4, leftX, leftY);
		window.drawLine(getXPos()  + getWidth()/ 3, getYPos() + getHeight()/5, rightX, rightY);   
	}

	public void moveAndDraw(Graphics window){
		  setColor(Color.blue);
	      draw(window);
	      
	      
	      leftX += leftspeed;
	      leftY -= leftspeed;
	      rightX -= rightspeed;
	      rightY -= rightspeed;
	      
	      if (leftY < getYPos() - getHeight()/ 8) {
	    	  leftspeed = - leftspeed;
	      }
	      if (leftY > getYPos() + getHeight() / 8) {
	    	  leftspeed = - leftspeed;
	      }
	      if (rightY < getYPos() - getHeight()/ 12) {
	    	  rightspeed = - rightspeed;
	      }
	      if (rightY > getYPos() + getHeight() / 8) {
	    	  rightspeed = - rightspeed;
	      }
	      setColor(Color.white);
	      draw(window);
	}
}

