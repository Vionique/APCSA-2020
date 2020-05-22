package finalProject;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Instructions extends JFrame{
	
	private JLabel objective;
	private JLabel description;
	private JLabel directions;
	private JLabel directionsOne;
	private JLabel directionsTwo;
	private JLabel directionsThree;
	private JLabel directionsFour;
	
	private JPanel panel;
	
	public Instructions() {
		super("HELP");
		
		setSize(400,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		objective = new JLabel();
		objective.setText("OBJECTIVES:");
		objective.setBounds(0,0 , 400, 50);
		objective.setFont(new Font("", Font.PLAIN, 20));
		
		directions = new JLabel();
		directions.setText("DIRECTIONS:");
		directions.setFont(new Font("", Font.PLAIN, 20));
		directions.setBounds(0, 25, 100, 50);
		
		directionsOne = new JLabel();
		directionsOne.setText("1. Dodge incoming obstacles using the arrow keys\n");
		directionsOne.setBounds(0, 50, 400, 50);
		directionsTwo = new JLabel();
		directionsTwo.setText("2. Buy upgrades from the \"Upgrades\" button\n");
		directionsTwo.setBounds(0, 75, 400, 50);
		directionsThree = new JLabel();
		directionsThree.setBounds(0, 100, 400, 50);
		directionsThree.setText("3. Use upgrades by pressing the SPACE key\n");
		directionsFour = new JLabel();
		directionsFour.setBounds(0, 125, 400, 50);
		directionsFour.setText("4. Swap through upgrades by hitting the SHIFT key");
		
		
		panel.add(objective);
		panel.add(directions);
		panel.add(directionsOne);
		panel.add(directionsTwo);
		panel.add(directionsThree);
		panel.add(directionsFour);
		
		setVisible(true);
		getContentPane().add(panel);
		panel.setVisible(true);
	}
}