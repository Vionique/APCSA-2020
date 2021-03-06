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

public class EndlessGame extends JFrame implements KeyListener, Runnable{
	
	private GameShip ship;
	private JFrame frame;
	private JPanel gamePanel;
	private JLabel shipIcon;
	private boolean[] keys;
	private BufferedImage back;
	public EndlessGame() {
		super("ENDLESS MODE TEST");
		
		initGame();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		repaint();
		
		
	}


	public void initGame() {
		keys = new boolean[6];
		
		this.addKeyListener(this);
		new Thread(this).start();
		
		
		setSize(800,600);
		
		gamePanel = new JPanel();
		gamePanel.setLayout(null);
		gamePanel.setOpaque(false);
		
		ship = new GameShip(100, 200, 50, 50);		
		shipIcon = new JLabel(new ImageIcon(ship.getImage()));
		ship.draw(gamePanel, shipIcon);
		
		
		getContentPane().add(gamePanel);
		getContentPane().setBackground(Color.BLACK);
		setVisible(true);
	}
	
	@Override
	public void run() {
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
}

