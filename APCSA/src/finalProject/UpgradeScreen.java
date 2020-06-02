package finalProject;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpgradeScreen extends JPanel implements ActionListener{
	
	private Homescreen frame;
	private JPanel upgradePanel;
	private JButton menuButton;
	
	private JButton plusSpeedButton;
	private JButton minusSpeedButton;
	private JLabel speedLabel;
	
	private JButton plusShieldTimeButton;
	private JButton minusShieldTimeButton;
	private JLabel shieldTimeLabel;
	
	private JButton plusShieldRechargeButton;
	private JButton minusShieldRechargeButton;
	private JLabel shieldRechargeLabel;
	
	private JButton plusBlastRadiusButton;
	private JButton minusBlastRadiusButton;
	private JLabel blastRadiusLabel;
	
	private JButton plusBlastRechargeButton;
	private JButton minusBlastRechargeButton;
	private JLabel blastRechargeLabel;
	
	private int points;
	
	
	public UpgradeScreen(Homescreen j, JButton menu) {
		frame = j;
		menuButton = menu;
		points = frame.getPoints();
		initScreen();
	}
	
	public void initScreen() {
		upgradePanel = new JPanel();
		upgradePanel.setLayout(null);
		upgradePanel.setOpaque(false);
		
		
		//Speed Components
		plusSpeedButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("plus.png"));
		    plusSpeedButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("plus speed button error");
		}
		plusSpeedButton.setBounds(550, 200, 40, 40);
		plusSpeedButton.addActionListener(this);
		
		minusSpeedButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("minus.png"));
		    minusSpeedButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("minus speed button error");
		}
		minusSpeedButton.setBounds(200, 200, 40, 40);
		minusSpeedButton.addActionListener(this);
				
		speedLabel = new JLabel();
		speedLabel.setText("Ship Speed :: " + frame.getShip().getSpeed());
		speedLabel.setBounds(350,200,100,40);
		
		
		//shieldTime Components
		plusShieldTimeButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("plus.png"));
		    plusShieldTimeButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("plus shield time button error");
		}
		plusShieldTimeButton.setBounds(550, 250, 40, 40);
		plusShieldTimeButton.addActionListener(this);
		
		minusShieldTimeButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("minus.png"));
		    minusShieldTimeButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("minus shield time button error");
		}
		minusShieldTimeButton.setBounds(200, 250, 40, 40);
		minusShieldTimeButton.addActionListener(this);
				
		shieldTimeLabel = new JLabel();
		shieldTimeLabel.setText("Shield Duration Time :: " + frame.getShip().getShieldTime());
		shieldTimeLabel.setBounds(325,250,200,40);
		
		
		
		//shieldRecharge Components
		plusShieldRechargeButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("plus.png"));
		    plusShieldRechargeButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("plus shield recharge button error");
		}
		plusShieldRechargeButton.setBounds(550, 300, 40, 40);
		plusShieldRechargeButton.addActionListener(this);
		
		minusShieldRechargeButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("minus.png"));
		    minusShieldRechargeButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("minus shield recharge button error");
		}
		minusShieldRechargeButton.setBounds(200, 300, 40, 40);
		minusShieldRechargeButton.addActionListener(this);
				
		shieldRechargeLabel = new JLabel();
		shieldRechargeLabel.setText("Shield Recharge Time :: " + frame.getShip().getShieldRecharge());
		shieldRechargeLabel.setBounds(325,300,200,40);
		
		
		
		//blastRadius Components
		plusBlastRadiusButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("plus.png"));
		    plusBlastRadiusButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("plus blast radius button error");
		}
		plusBlastRadiusButton.setBounds(550, 350, 40, 40);
		plusBlastRadiusButton.addActionListener(this);
		
		minusBlastRadiusButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("minus.png"));
		    minusBlastRadiusButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("minus blast radius button error");
		}
		minusBlastRadiusButton.setBounds(200, 350, 40, 40);
		minusBlastRadiusButton.addActionListener(this);
				
		blastRadiusLabel = new JLabel();
		blastRadiusLabel.setText("Blast Radius :: " + frame.getShip().getBlastRadius());
		blastRadiusLabel.setBounds(350,350,200,40);
		
		
		//blastRecharge Components
		plusBlastRechargeButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("plus.png"));
		    plusBlastRechargeButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("plus blast recharge button error");
		}
		plusBlastRechargeButton.setBounds(550, 400, 40, 40);
		plusBlastRechargeButton.addActionListener(this);
		
		minusBlastRechargeButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("minus.png"));
		    minusBlastRechargeButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("minus blast recharge button error");
		}
		minusBlastRechargeButton.setBounds(200, 400, 40, 40);
		minusBlastRechargeButton.addActionListener(this);
				
		blastRechargeLabel = new JLabel();
		blastRechargeLabel.setText("Blast Recharge Time :: " + frame.getShip().getBlastRecharge());
		blastRechargeLabel.setBounds(325,400,200,40);
		
		
		
		upgradePanel.add(plusSpeedButton);
		upgradePanel.add(minusSpeedButton);
		upgradePanel.add(speedLabel);
		
		upgradePanel.add(plusShieldTimeButton);
		upgradePanel.add(minusShieldTimeButton);
		upgradePanel.add(shieldTimeLabel);
		
		upgradePanel.add(plusShieldRechargeButton);
		upgradePanel.add(minusShieldRechargeButton);
		upgradePanel.add(shieldRechargeLabel);
		
		upgradePanel.add(plusBlastRadiusButton);
		upgradePanel.add(minusBlastRadiusButton);
		upgradePanel.add(blastRadiusLabel);
		
		upgradePanel.add(plusBlastRechargeButton);
		upgradePanel.add(minusBlastRechargeButton);
		upgradePanel.add(blastRechargeLabel);
		
		upgradePanel.add(menuButton);
		frame.updateNumLabels(upgradePanel, Color.BLACK);
		upgradePanel.setVisible(true);
		
		
		frame.getContentPane().add(upgradePanel);
		frame.setVisible(true);
	}

	public void removePanel() {
		upgradePanel.setVisible(false);
		frame.remove(upgradePanel);
	}
	public void updateLabel() {
		speedLabel.setText("Ship Speed :: " + frame.getShip().getSpeed());
		shieldTimeLabel.setText("Shield Duration Time :: " + frame.getShip().getShieldTime());
		shieldRechargeLabel.setText("Shield Recharge Time :: " + frame.getShip().getShieldRecharge());
		blastRadiusLabel.setText("Blast Radius :: " + frame.getShip().getBlastRadius());
		blastRechargeLabel.setText("Blast Recharge Time :: " + frame.getShip().getBlastRecharge());
		frame.updateNumLabels(upgradePanel, Color.BLACK);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (frame.getPoints() >= 10) {
			if (e.getSource().equals(plusSpeedButton)) {
				if (frame.getShip().getSpeed() < 40) {
					frame.getShip().setSpeed(frame.getShip().getSpeed() + 1);
					frame.setPoints(frame.getPoints() - 30);
				}
			}
			if (e.getSource().equals(minusSpeedButton)) {
				if (frame.getShip().getSpeed() > 1) {
					frame.getShip().setSpeed(frame.getShip().getSpeed() - 1);
					frame.setPoints(frame.getPoints() + 10);
				}
			}
			if (e.getSource().equals(plusShieldTimeButton)) {
				if (frame.getShip().getShieldTime() < 60) {
					frame.getShip().setShieldTime(frame.getShip().getShieldTime() + 1);
					frame.setPoints(frame.getPoints() - 10);
				}
			}
			if (e.getSource().equals(minusShieldTimeButton)) {
				if (frame.getShip().getShieldTime() > 0) {
					frame.getShip().setShieldTime(frame.getShip().getShieldTime() - 1);
					frame.setPoints(frame.getPoints() + 10);
				}
			}
			if (e.getSource().equals(plusShieldRechargeButton)) {
				if (frame.getShip().getShieldRecharge() < 60) {
					frame.getShip().setShieldRecharge(frame.getShip().getShieldRecharge() + 1);
					frame.setPoints(frame.getPoints() + 10);
				}
			}
			if (e.getSource().equals(minusShieldRechargeButton)) {
				if (frame.getShip().getShieldRecharge() > 10) {
					frame.getShip().setShieldRecharge(frame.getShip().getShieldRecharge() - 1);
					frame.setPoints(frame.getPoints() - 10);
				}
			}
			if (e.getSource().equals(plusBlastRadiusButton)) {
				if (frame.getShip().getBlastRadius() < 60) {
					frame.getShip().setBlastRadius(frame.getShip().getBlastRadius() + 10);
					frame.setPoints(frame.getPoints() - 100);
				}
			}
			if (e.getSource().equals(minusBlastRadiusButton)) {
				if (frame.getShip().getBlastRadius() > 20) {
					frame.getShip().setBlastRadius(frame.getShip().getBlastRadius() - 10);
					frame.setPoints(frame.getPoints() + 100);
				}
			}
			if (e.getSource().equals(plusBlastRechargeButton)) {
				if (frame.getShip().getBlastRecharge() < 100) {
					frame.getShip().setBlastRecharge(frame.getShip().getBlastRecharge() + 1);
					frame.setPoints(frame.getPoints() + 10);
				}
			}
			if (e.getSource().equals(minusBlastRechargeButton)) {
				if (frame.getShip().getBlastRecharge() > 10) {
					frame.getShip().setBlastRecharge(frame.getShip().getBlastRecharge() - 1);
					frame.setPoints(frame.getPoints() - 10);
				}
			}
			
			updateLabel();
		}
			
	}
	
}



