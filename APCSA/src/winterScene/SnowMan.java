package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman
	   
	   window.fillOval(getXPos(), getYPos(), getWidth()/2, getHeight()/2);
	   window.fillOval(getXPos() + getWidth()/8, getYPos() - getHeight()/4, getWidth()/ 3, getHeight()/3);
	   window.fillOval(getXPos() + getWidth()/8 + getWidth()/12, getYPos() - getHeight()/4 - getHeight()/6, getWidth()/6, getHeight()/6);
   }

   public void moveAndDraw(Graphics window)
   {
	  setColor(Color.BLUE);
      draw(window);
      
      setColor(Color.WHITE);
      setXPos(getXPos() + 50);
      draw(window);
   }
}