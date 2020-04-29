package pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

   public SpeedUpBall()
   {
	   super();

   }

   public SpeedUpBall(int x, int y)
   {
	   super (x,y);

   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y);
	   setxSpeed(xSpd);
	   setySpeed(ySpd);

   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super (x, y, wid, ht, xSpd, ySpd);

   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x, y, wid, ht, col, xSpd, ySpd);


   }

   public void setXSpeed( int xSpd )
   {
	   if (xSpd > 0)
		   setxSpeed(xSpd + 1);
	   else
		   setxSpeed(xSpd - 1);
   }

   public void setYSpeed( int ySpd )
   {
	   if (ySpd > 0)
		   setySpeed(ySpd + 1);
	   else
		   setySpeed(ySpd - 1);

   }
}

