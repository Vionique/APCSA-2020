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
import java.util.concurrent.TimeUnit;

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
	
	private Homescreen frame;
	private JPanel gamePanel;
	private JLabel shipIcon;
	
	private JLabel shieldLabel;
	private int shieldRechargeCounter;
	private int shieldDurationCounter;
	
	private JLabel blastLabel;
	public JLabel usingBlastLabel;
	private int blastRechargeCounter;
	private int blastDurationCounter;
	private boolean shieldIsSelected;
	
	
	
	private boolean[] keys;
	private BufferedImage back;
	
	private int scoreCounter;
	
	
	private boolean isRunning = true;
	public EndlessGameTwo(Homescreen j, JPanel p, GameShip s) {
		frame = j;
		gamePanel = p;
		
		scoreCounter = 0;
		shieldRechargeCounter = 0;
		shieldDurationCounter = 0;
		
		//Don't need blastDuration Counter
		blastRechargeCounter = 0;
		blastDurationCounter = 0;
		
		ship = s;
		initGame();
		
	}


	public void initGame() {
		keys = new boolean[6];
		
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		
		gamePanel.setLayout(null);
		gamePanel.setOpaque(false);
		
		shieldLabel = new JLabel();
		setLabelImage(shieldLabel, "selectshieldOn.png");
		shieldLabel.setBounds(0, 515, 75, 65);
		shieldIsSelected = true;
		
		blastLabel = new JLabel();
		setLabelImage(blastLabel, "blastOn.png");
		blastLabel.setBounds(75, 515, 75, 65);
		
		
		shipIcon = new JLabel();
		setLabelImage(shipIcon, "shipSmall.jpg");
		ship.setPos(100, 200);	
		
		usingBlastLabel = new JLabel();
		setLabelImage(usingBlastLabel, "blast" + ship.getBlastRadius() + ".png");
		usingBlastLabel.setVisible(false);
		
		ship.draw(gamePanel, shipIcon);
		
		//obstacleTest = new Obstacle(600,400, 30);
		//obstacleIcon = new JLabel(new ImageIcon(obstacleTest.getImage()));
		//obstacleTest.draw(gamePanel, obstacleIcon);
		
		obstacles = new ObstaclePanel(this);
		obstacles.allObstaclesMove(gamePanel);

		gamePanel.add(shieldLabel);
		gamePanel.add(blastLabel);
		gamePanel.add(usingBlastLabel);
		gamePanel.add(shipIcon);
		
		frame.getContentPane().add(gamePanel);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setVisible(true);
		
		frame.addKeyListener(this);
		new Thread(this).start();
	}
	
	@Override
	public void run() {
   		try
	   	{
			
	   		while(isRunning)
	   		{
	   			runGame();
	   			Thread.currentThread().sleep(100);
	   			frame.repaint();
	   		}
	   		loseGame();
	   		
	      }
   		catch(Exception e){
	    	  System.out.println("run() error");

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
			
			if (ship.getShieldRecharged() && shieldIsSelected) {
				setLabelImage(shieldLabel, isShieldSelected() + "shieldOff.png");
				ship.setShield(true);
				setLabelImage(shipIcon, "smallShipWithShield.jpg");
				ship.setShieldRecharged(false);
				shieldRechargeCounter = 0;
			}
			
			if (ship.getBlastRecharged() && !shieldIsSelected) {
				setLabelImage(blastLabel, isBlastSelected() + "blastOff.png");
				ship.setBlastOn(true);
				ship.setBlastRecharged(false);
				//
				//ship.drawBlast(this);
				blastRechargeCounter = 0;
				
				for (int i = 10; i <= ship.getBlastRadius(); i += 10) {
					blastAnimation(i);
					
				}
				
				
			}
		}
		if (keys[5] == true) {
			shieldIsSelected = !shieldIsSelected;
			setLabelImage(shieldLabel, isShieldSelected() + "shield" + shieldAvailable() + ".png");
			setLabelImage(blastLabel, isBlastSelected() + "blast" + blastAvailable() + ".png");
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
			case 'E' : keys[5]=true; break;
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
			case ' ' : keys[4]=false; break;
			case 'E' : keys[5]=false; break;
		}
		

	}
	
	public void removeGameShip() {
		ship.setPos(800, 600);
		gamePanel.remove(shipIcon);	
		gamePanel.removeAll();
	}
	public void removeObstacles() {
		obstacles.removeAll(gamePanel);
		frame.getContentPane().remove(gamePanel);
	}
	
	public void loseGame() {
		frame.returnHome();
		gamePanel.removeAll();
		frame.setHighScore(scoreCounter / 3);
	}
	public void runGame() {
		obstacles.allObstaclesMove(gamePanel);
		if (obstacles.checkAllCollisions(ship)) {
     	   isRunning = false;
        }
		scoreCounter++;
		if (scoreCounter % 3 == 0) {
			frame.setScorePoints(frame.getScore() + 1, frame.getPoints(), gamePanel);
		}
		if (scoreCounter % 10 == 0) {
			frame.setScorePoints(frame.getScore(), frame.getPoints() + 1, gamePanel);
		}
		chargePowerUps();
		
	}
	
	public void chargePowerUps() {
		shieldRechargeCounter++;
		blastRechargeCounter++;
		if (shieldRechargeCounter >= ship.getShieldRecharge()) {
			setLabelImage(shieldLabel, isShieldSelected() + "shieldOn.png");
			ship.setShieldRecharged(true);
		}
		if (ship.getShieldOn()) {
			setLabelImage(shipIcon, "smallShipWithShield.jpg");
			shieldDurationCounter++;
			System.out.println(shieldDurationCounter);
			if (shieldDurationCounter >= ship.getShieldTime()) {
				ship.setShield(false);
				setLabelImage(shipIcon, "shipSmall.jpg");
				shieldDurationCounter = 0;
				System.out.println("shipShieldOff");
			}
		}
		
		if (blastRechargeCounter >= ship.getBlastRecharge()) {
			setLabelImage(blastLabel, isBlastSelected() + "blastOn.png");
			ship.setBlastRecharged(true);
		}
		
		if (blastRechargeCounter >= 7) {
			usingBlastLabel.setVisible(false);
		}
		/*if (ship.getBlastOn()) {
			blastDurationCounter++;
			System.out.println(blastDurationCounter);
			if (blastDurationCounter >= ship.getBlast)
		}*/
	}
	
	
	public String isShieldSelected() {
		if (shieldIsSelected) {
			return "select";
		}
		return "";
	}
	public String isBlastSelected() {
		if (shieldIsSelected) {
			return "";
		}
		return "select";
	}
	public String shieldAvailable() {
		if (ship.getShieldRecharged()) {
			return "On";
		}
		return "Off";
	}
	public String blastAvailable() {
		if (ship.getBlastRecharged()) {
			return "On";
		}
		return "Off";
	}
	
	
	
	
	
	public void setRunning(boolean bool) {
		isRunning = bool;
	}
	public void setLabelImage(JLabel label, String str) {
		try {
		    Image img = ImageIO.read(getClass().getResource(str));
		    label.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("image " + str + " error");
		}
	}
	public void blastAnimation(int i) {
		usingBlastLabel.setVisible(true);
		setLabelImage(usingBlastLabel, "blast" + i + ".png");
		usingBlastLabel.setBounds(ship.getXPos() + ship.getWidth()/2 - i, ship.getYPos() + ship.getHeight()/2 - i
					, i * 2, i * 2);
		System.out.println("blast" + i);
		obstacles.checkAllBlasts(usingBlastLabel); 
		frame.repaint();
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void callRepaint() {
		frame.repaint();
	}

}

