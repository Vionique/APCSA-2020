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
	
	public UpgradeScreen(Homescreen j, JButton menu) {
		frame = j;
		menuButton = menu;
		initScreen();
	}
	
	public void initScreen() {
		upgradePanel = new JPanel();
		upgradePanel.setLayout(null);
		upgradePanel.setOpaque(false);
		
		plusSpeedButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("plus.png"));
		    plusSpeedButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("plus speed button error");
		}
		plusSpeedButton.setBounds(550, 300, 40, 40);
		plusSpeedButton.addActionListener(this);
		
		minusSpeedButton = new JButton();
		try {
		    Image img = ImageIO.read(getClass().getResource("minus.png"));
		    minusSpeedButton.setIcon(new ImageIcon(img));
		} 
		catch (Exception ex) {
			System.out.println("minus speed button error");
		}
		minusSpeedButton.setBounds(200, 300, 40, 40);
		minusSpeedButton.addActionListener(this);
				
		speedLabel = new JLabel();
		speedLabel.setText("Ship Speed :: " + frame.getShip().getSpeed());
		speedLabel.setBounds(350,300,100,40);
		
		upgradePanel.add(plusSpeedButton);
		upgradePanel.add(minusSpeedButton);
		upgradePanel.add(speedLabel);
		upgradePanel.add(menuButton);
		frame.updateNumLabels(upgradePanel, Color.BLACK);
		upgradePanel.setVisible(true);
		
		
		frame.getContentPane().add(upgradePanel);
		frame.setVisible(true);
	}

	public void removePanel() {
		frame.remove(upgradePanel);
	}
	public void updateLabel() {
		
		speedLabel.setText("Ship Speed :: " + frame.getShip().getSpeed());

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(plusSpeedButton)) {
			frame.getShip().setSpeed(frame.getShip().getSpeed() + 5);
			updateLabel();
		}
		if (e.getSource().equals(minusSpeedButton)) {
			frame.getShip().setSpeed(frame.getShip().getSpeed() - 5);
			updateLabel();
		}
		
			
	}
	
}



