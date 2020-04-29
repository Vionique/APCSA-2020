package pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class PongInvisible extends Canvas implements KeyListener, Runnable
{
	private InvisibleBall ball;
	private Paddle leftPaddle, rightPaddle;
	private Wall topWall, bottomWall, leftWall, rightWall;
	private int leftScore, rightScore;
	private boolean[] keys;
	private BufferedImage back;


	public PongInvisible()
	{
		//set up all variables related to the game
		ball = new InvisibleBall(400,300,25,25,Color.blue,-2, 2);
		leftPaddle = new Paddle (50,300,10,100, Color.black, 5);
		rightPaddle = new Paddle (750,300,10,100, Color.black, 5);
		keys = new boolean[4];
		leftScore = 0;
		rightScore = 0;
		
		topWall = new Wall (0,0,800,10);
		bottomWall = new Wall (0,550,800,10);
		leftWall = new Wall (0,0,10,600);
		rightWall = new Wall(800,0,10,600);
		
		
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);

   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
			
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		
		//see if ball hits left wall or right wall
		if (ball.didCollideLeft(leftWall)) {
			ball.setxSpeed(0);
			ball.setySpeed(0);
			rightScore++;
			ball.reset(graphToBack);
		}
		if (ball.didCollideRight(rightWall)) {
			ball.setxSpeed(0);
			ball.setySpeed(0);
			leftScore++;
			ball.reset(graphToBack);
		}
		//see if the ball hits the top or bottom wall
		if (ball.didCollideBottom(bottomWall)) {
			ball.setySpeed(-ball.getySpeed());
		}
		if (ball.didCollideTop(topWall)) {
			ball.setySpeed(-ball.getySpeed());
		}


		 
		//see if the ball hits the left paddle
		if (onPaddleLeft(leftPaddle, ball)) {
			if (ball.getX() <= (leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getxSpeed()))) {
				ball.setySpeed(-ball.getySpeed());

			}
			else {
				ball.setxSpeed(-ball.getxSpeed());

			}
		}
		
		
		//see if the ball hits the right paddle
		if (onPaddleRight(rightPaddle, ball)) {
				if (ball.getX() <= (rightPaddle.getX() - rightPaddle.getWidth() - Math.abs(ball.getxSpeed())))
					ball.setySpeed(-ball.getySpeed());
				else {
					ball.setxSpeed(-ball.getxSpeed());
				}
		}
		

	twoDGraph.drawImage(back, null, 0, 0);
	twoDGraph.drawString("Leftscore: " + Integer.toString(leftScore), 20, 520);
	twoDGraph.drawString("Rightscore: " + Integer.toString(rightScore), 20, 550);

	}
   public boolean onPaddleLeft(Paddle pad, Ball b) {
	   if ((b.getX() <= pad.getX() + pad.getWidth() + Math.abs(b.getxSpeed()))
				&& 
				(b.getY() >= pad.getY() &&
				 b.getY() <= pad.getY() + pad.getHeight() ||
				 b.getY() + b.getHeight() >= pad.getY() &&
				 b.getY() + b.getHeight() < pad.getY() + pad.getHeight()))
				return true;
	   return false;
   }
   public boolean onPaddleRight(Paddle pad, Ball b) {
	   if ((b.getX() >= pad.getX() - pad.getWidth() - Math.abs(b.getxSpeed()))
				&& 
				(b.getY() >= pad.getY() &&
				 b.getY() <= pad.getY() + pad.getHeight() ||
				 b.getY() + b.getHeight() >= pad.getY() &&
				 b.getY() + b.getHeight() < pad.getY() + pad.getHeight())) {
		   return true;
				
	   }
	   return false;
   }
   

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}

