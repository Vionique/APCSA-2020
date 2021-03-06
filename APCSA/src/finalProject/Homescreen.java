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
	private EndlessGameTwo game;
	
	private UpgradeScreen upgrades;
	
	private JButton menuButton;
	
	public JLabel scoreLabel;
	public int score;
	public JLabel pointsLabel;
	public int points;
	private JLabel highScoreLabel;
	public int highScore;
	
	private JLabel titleLabel;
	private JLabel nameLabel;
	
	private JLabel testLabel;
	
	private GameShip ship;
	
	public Homescreen() {
		super("Final Project");
		
		initDisplay();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		repaint();
	}
	
	
	public void initDisplay() {
		setSize(WINDOWWIDTH, WINDOWHEIGHT);
		
		ship = new GameShip(100, 200, 50, 50);
		
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
		
		
		URL url = getClass().getResource("shipSmall.jpg");
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
		
		highScoreLabel = new JLabel();
		highScore = 0;
		highScoreLabel.setText("High Score :: " + highScore);
		highScoreLabel.setForeground(Color.BLACK);
		highScoreLabel.setBounds(0, 550, 100, 25);
		
		titleLabel = new JLabel();
		titleLabel.setText("APCSA Final Project - Dodger");
		titleLabel.setBounds(300, 0, 200, 25);
		
		nameLabel = new JLabel();
		nameLabel.setText("Gabby Kang");
		nameLabel.setBounds(350, 30, 100, 25);
		
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
		panel.add(highScoreLabel);
		panel.add(titleLabel);
		panel.add(nameLabel);
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
			//try will only activate when clicking MenuButton from EndlessGame
			try {
				game.removeGameShip();
				game.setRunning(false);
				getContentPane().remove(gamePanel);
			}
			catch(Exception ex) {
				System.out.println("no game error");
			}
			
			try {
				upgrades.removePanel();
			}
			catch(Exception ex) {
				System.out.println("upgrades-menu error");
			}
			
			
			
			
			
			updateNumLabels(panel, Color.BLACK);
			getContentPane().setBackground(Color.WHITE);
			setVisible(true);
			
			getContentPane().add(panel);
			panel.setVisible(true);
		}
		if (e.getSource().equals(endlessButton)) {
			getContentPane().remove(panel);
			
			setScorePoints(0, getPoints(), gamePanel);
			updateNumLabels(gamePanel, Color.WHITE);
			
			gamePanel.add(menuButton);
			gamePanel.setVisible(true);
			
			
			
			game = new EndlessGameTwo(this, gamePanel, ship);

		}
		if (e.getSource().equals(upgradeButton)) {
			getContentPane().remove(panel);
			getContentPane().remove(gamePanel);
			
			upgrades = new UpgradeScreen(this, menuButton);
		}
		
	}
	
	public void setScorePoints(int s, int p, JPanel panel) {
		score = s;
		points = p;
		
		updateNumLabels(panel, Color.WHITE);
	}
	
	public void setHighScore(int s) {
		if (s > highScore) {
			highScore = s;
		}
		highScoreLabel.setText("High Score :: " + highScore);
	}
	public void updateNumLabels(JPanel panel, Color col) {
		scoreLabel.setText("Score :: " + score);
		pointsLabel.setText("Points :: " + points);
		scoreLabel.setForeground(col);
		pointsLabel.setForeground(col);
		panel.remove(scoreLabel);
		panel.add(scoreLabel);
		panel.remove(pointsLabel);
		panel.add(pointsLabel);
	}
	public int getScore() {
		return score;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int p) {
		points = p;
	}
	
	
	public void returnHome() {
		
		game.removeGameShip();
		game.removeObstacles();
		
		
		
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
	public GameShip getShip() {
		return ship;
	}
}

