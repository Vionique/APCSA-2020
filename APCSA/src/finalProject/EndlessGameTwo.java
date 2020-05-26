package finalProject;

import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import starfighter.AlienHorde;
import starfighter.Bullets;
import starfighter.Ship;

public class EndlessGameTwo  implements KeyListener, Runnable{
	
	private GameShip ship;
	private ObstaclePanel obstacles;
	
	private Obstacle obstacleTest;
	private JLabel obstacleIcon;
	
	private JFrame frame;
	private JPanel gamePanel;
	private JLabel shipIcon;
	private boolean[] keys;
	private BufferedImage back;
	
	private boolean isRunning = true;
	public EndlessGameTwo(JFrame j, JPanel p) {
		frame = j;
		gamePanel = p;
		initGame();
		
	}


	public void initGame() {
		keys = new boolean[7];
		keys[6] = true;
		
		
		
		
		frame.setFocusable(true);
		frame.requestFocusInWindow();

		
		
		gamePanel.setLayout(null);
		gamePanel.setOpaque(false);
		
		ship = new GameShip(100, 200, 50, 50, 20);		
		shipIcon = new JLabel(new ImageIcon(ship.getImage()));
		ship.draw(gamePanel, shipIcon);
		
		obstacleTest = new Obstacle(600,400, 30);
		obstacleIcon = new JLabel(new ImageIcon(obstacleTest.getImage()));
		obstacleTest.draw(gamePanel, obstacleIcon);
		
		obstacles = new ObstaclePanel();
		obstacles.allObstaclesMove(gamePanel);

		/*for (JLabel o : obstacles.getObstacles()) {
			gamePanel.add(o);
		}*/
		frame.getContentPane().add(gamePanel);
		
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setVisible(true);
		
		frame.addKeyListener(this);
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		while(isRunning)
   		try
	   	{
			
	   		while(isRunning)
	   		{
	   			runGame();
	   		   Thread.currentThread().sleep(100);
	           frame.repaint();
	           
	           
	           
	         }
	   		
	      }catch(Exception e)
	      {
	    	  System.out.println("run() error");
	    	  //runGame();
	    	  //loseGame();
	      }	
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		
		if (keys[0] == true) {
			ship.moveAndDraw("UP", gamePanel, shipIcon);

			
		}
		if (keys[1] == true) {
			ship.moveAndDraw("LEFT", gamePanel, shipIcon);
		}
		if (keys[2] == true) {
			ship.moveAndDraw("DOWN", gamePanel, shipIcon);
		}
		if (keys[3] == true) {
			ship.moveAndDraw("RIGHT", gamePanel, shipIcon);
		}
		if (keys[4] == true) {
			System.out.println("SPACE");
		}
		if (keys[5] == true) {
			System.out.println("");
		}
		if (keys[6] == true) {
			//obstacleTest.moveAndDraw("", gamePanel, obstacleIcon);
			
			
			
		}
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// from OuterSpace, Starfighter Project

		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'A' : keys[1]=true; break;
			case 'S' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
			case ' ' : keys[4]=true; break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'A' : keys[1]=false; break;
			case 'S' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
			case ' ' : keys[4]= false; break;
		}
		

	}
	
	public void removeGameShip() {
		gamePanel.remove(shipIcon);
		
	}
	
	public void loseGame() {
		
	}
	public void runGame() {
		obstacles.allObstaclesMove(gamePanel);
		if (obstacles.checkAllCollisions(ship)) {
     	   isRunning = false;
        }
		//obstacleTest.draw( gamePanel, obstacleIcon);
	}
}

