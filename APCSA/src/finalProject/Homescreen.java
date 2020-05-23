package finalProject;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;


public class Homescreen extends JFrame implements ActionListener{

	private static final int WINDOWWIDTH = 800;
	private static final int WINDOWHEIGHT = 600;
	
	private JPanel panel;
	private JButton endlessButton;
	private JButton instructionsButton;
	private JButton upgradeButton;
	
	private JPanel gamePanel;
	
	
	private JButton menuButton;
	private JLabel scoreLabel;
	private int score;
	private JLabel pointsLabel;
	private int points;
	
	private JLabel testLabel;
	
	public Homescreen() {
		super("Final Project");
		
		initDisplay();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		repaint();
	}
	
	
	public void initDisplay() {
		setSize(WINDOWWIDTH, WINDOWHEIGHT);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		endlessButton = new JButton();
		endlessButton.setText("Endless Mode");
		endlessButton.setBounds(275, 300, 250, 25);
		endlessButton.addActionListener(this);
		
		instructionsButton = new JButton();
		instructionsButton.setText("Instructions");
		instructionsButton.setBounds(275, 400, 250, 25);
		instructionsButton.addActionListener(this);
		
		upgradeButton = new JButton();
		upgradeButton.setText("Upgrades");
		upgradeButton.setBounds(275,  350, 250, 25);
		upgradeButton.addActionListener(this);
		
		
		URL url = getClass().getResource("shipSmallOne.jpg");
		Image image;
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		testLabel = new JLabel(new ImageIcon(image));
		testLabel.setSize(100, 100);
		testLabel.setBounds(100, 200, 50, 50);
		
		
		
		
		
		menuButton = new JButton();
		menuButton.setText("MENU");
		menuButton.setBounds(700, 0, 100, 25);
		menuButton.addActionListener(this);
		
		scoreLabel = new JLabel();
		score = 0;
		scoreLabel.setText("Score :: " + score);
		scoreLabel.setForeground(Color.BLACK);
		scoreLabel.setBounds(0, 0, 100, 25);
		
		pointsLabel = new JLabel();
		points = 0; 
		pointsLabel.setText("Points :: " + points);
		pointsLabel.setForeground(Color.BLACK);
		pointsLabel.setBounds(0, 25, 100, 25);
		
		gamePanel = new JPanel();
		gamePanel.setLayout(null);
		gamePanel.setOpaque(false);
		gamePanel.add(menuButton);
		gamePanel.setVisible(false);
		gamePanel.add(pointsLabel);
		gamePanel.add(scoreLabel);
		
		panel.add(endlessButton);
		panel.add(instructionsButton);
		panel.add(upgradeButton);
		panel.add(scoreLabel);
		panel.add(pointsLabel);
		//panel.add(testLabel);
		
		getContentPane().add(panel);
		setVisible(true);
		panel.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(instructionsButton)) {
			Instructions help = new Instructions();
		}
		if (e.getSource().equals(menuButton)) {
			getContentPane().remove(gamePanel);
			getContentPane().add(panel);
			
			panel.remove(pointsLabel);
			pointsLabel.setForeground(Color.BLACK);
			panel.add(pointsLabel);
			panel.remove(scoreLabel);
			scoreLabel.setForeground(Color.BLACK);
			panel.add(scoreLabel);
			
			getContentPane().setBackground(Color.WHITE);
			setVisible(true);
			
			panel.setVisible(true);
		}
		if (e.getSource().equals(endlessButton)) {
			getContentPane().remove(panel);
			
			EndlessGame game = new EndlessGame();
			//((Component)game).setFocusable(true);

			gamePanel.remove(pointsLabel);
			pointsLabel.setForeground(Color.WHITE);
			gamePanel.add(pointsLabel);
			gamePanel.remove(scoreLabel);
			scoreLabel.setForeground(Color.WHITE);
			gamePanel.add(scoreLabel);
			
			getContentPane().add(gamePanel);
			getContentPane().setBackground(Color.BLACK);
			setVisible(true);
			
			gamePanel.setVisible(true);
		}
		if (e.getSource().equals(upgradeButton)) {
			
		}
		
	}
	
}

