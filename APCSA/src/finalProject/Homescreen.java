package finalProject;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
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
		endlessButton.setBackground(Color.BLACK);
		endlessButton.addActionListener(this);
		
		instructionsButton = new JButton();
		instructionsButton.setText("Instructions");
		instructionsButton.setBounds(275, 400, 250, 25);
		instructionsButton.addActionListener(this);
		
		upgradeButton = new JButton();
		upgradeButton.setText("Upgrades");
		upgradeButton.setBounds(275,  350, 250, 25);
		upgradeButton.addActionListener(this);
		
		panel.add(endlessButton);
		panel.add(instructionsButton);
		panel.add(upgradeButton);
		
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
		if (e.getSource().equals(endlessButton)) {
			panel.setVisible(false);
			EndlessGame game = new EndlessGame();
		}
		if (e.getSource().equals(upgradeButton)) {
			
		}
	}
	
}

