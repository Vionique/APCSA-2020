package finalProject;

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
	
	private Ship ship;
	private JFrame frame;
	private JPanel gamePanel;
	private JLabel icon;
	private boolean[] keys;
	private BufferedImage back;
	public EndlessGame() {
		super("ENDLESS MODE TEST");
		
		initGame();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		repaint();
		
		
	}
	public EndlessGame(JFrame j) {
		frame = j;
		keys = new boolean[6];
		
		this.addKeyListener(this);
		new Thread(this).start();
		

		
		

		
	}

	public void initGame() {
		
		setSize(800,600);
		
		gamePanel = new JPanel();
		

		
		URL url = getClass().getResource("shipSmallOne.jpg");
		Image image;
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		icon = new JLabel(new ImageIcon(image));
		icon.setSize(100, 100);
		icon.setBounds(100, 200, 50, 50);

		gamePanel.setLayout(null);
		gamePanel.setOpaque(false);
		gamePanel.add(icon);
		getContentPane().add(gamePanel);
		//gamePanel.setVisible(true);
		//ship.draw(graphToBack);

		getContentPane().setBackground(Color.BLACK);
		setVisible(true);
	}
	
	public JLabel getIcon() {
		return icon;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

