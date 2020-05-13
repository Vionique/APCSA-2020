package starfighter;
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
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private ArrayList<Ammo> shots;
	private ArrayList<Alien> alienList;

	

	/* uncomment once you are ready for this part
	 *
   private AlienHorde horde;
	private Bullets shots;
	*/

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400,400,30,30,1);
		alienList = new ArrayList<Alien>();
		alienList.add(new Alien(440,40,30,30,1));
		alienList.add(new Alien(500,40,30,30,1));

		shots = new ArrayList<Ammo>();

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
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
		
		
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("StarFighter ", 20, 20 );

		ship.draw(graphToBack);
		for (Ammo ammo : shots) {
			for (int i = 0; i < alienList.size(); i++) {
				if (ammo.getX() >= alienList.get(i).getX() && 
						ammo.getX() <= alienList.get(i).getX() + alienList.get(i).getWidth()
						&& ammo.getY() == alienList.get(i).getY() + alienList.get(i).getHeight()
						)
					alienList.remove(i);
			}
		}
		
		for (Alien alien : alienList) {
			alien.draw(graphToBack);
		}
		

		

		
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if (keys[1] == true) {
			ship.move("RIGHT");
		}
		if (keys[2] == true) {
			ship.move("UP");
		}
		if (keys[3] == true) {
			ship.move("DOWN");
		}
		if (keys[4] == true) {
			
			shots.add(new Ammo(ship.getX() + ship.getWidth()/2, ship.getY(), 1));
			
			
		}
		
		//add code to move Ship, Alien, etc.
		
		for (Ammo a : shots) {
			a.moveAndDraw(graphToBack);
		}
		for (Alien a : alienList) {
			a.move("");
		}
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{/*
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();*/
		
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'H' : keys[0]=true; break;
			case 'J' : keys[1]=true; break;
			case 'U' : keys[2]=true; break;
			case 'N' : keys[3]=true; break;
			case ' ' : keys[4]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{/*
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();*/
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'H' : keys[0]=false; break;
			case 'J' : keys[1]=false; break;
			case 'U' : keys[2]=false; break;
			case 'N' : keys[3]=false; break;
			case ' ' : keys[4]= false; break;
		}
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

