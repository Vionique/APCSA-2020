package finalProject;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Instructions extends JFrame{
	
	private JLabel objective;
	private JLabel objectiveOne;
	private JLabel objectiveTwo;
	private JLabel objectiveThree;
	private JLabel objectiveFour;
	private JLabel objectiveFive;
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
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		objective = new JLabel();
		objective.setText("OBJECTIVES:");
		objective.setBounds(0,0 , 400, 50);
		objective.setFont(new Font("", Font.PLAIN, 20));
		
		objectiveOne = new JLabel();
		objectiveTwo = new JLabel();
		objectiveThree = new JLabel();
		objectiveFour = new JLabel();
		objectiveFive = new JLabel();
		
		objectiveOne.setText("Dodge incoming obstacles to protect your ship in an endless ");
		objectiveTwo.setText("flight simulation! Aim for a highscore by seeing how long ");
		objectiveThree.setText("you can survive. Use your ship's blast function to destroy ");
		objectiveFour.setText("incoming obstacles, or use your ship's shields to prevent ");
		objectiveFive.setText("obstacles from damaging your ship.");
		
		objectiveOne.setBounds(2,25 , 400, 50);
		objectiveTwo.setBounds(2,50 , 400, 50);
		objectiveThree.setBounds(2,75 , 400, 50);
		objectiveFour.setBounds(2,100 , 400, 50);
		objectiveFive.setBounds(2, 125, 400, 50);
		
		directions = new JLabel();
		directions.setText("DIRECTIONS:");
		directions.setFont(new Font("", Font.PLAIN, 20));
		directions.setBounds(0, 175, 400, 50);
		
		directionsOne = new JLabel();
		directionsOne.setText("1. Dodge incoming obstacles using WASD \n");
		directionsOne.setBounds(0, 200, 400, 50);
		directionsTwo = new JLabel();
		directionsTwo.setText("2. Buy upgrades from the \"Upgrades\" button\n");
		directionsTwo.setBounds(0, 225, 400, 50);
		directionsThree = new JLabel();
		directionsThree.setBounds(0, 250, 400, 50);
		directionsThree.setText("3. Use upgrades by pressing the SPACE key\n");
		directionsFour = new JLabel();
		directionsFour.setBounds(0, 275, 400, 50);
		directionsFour.setText("4. Swap through upgrades by hitting 'E'");
		
		
		panel.add(objective);
		panel.add(objectiveOne);
		panel.add(objectiveTwo);
		panel.add(objectiveThree);
		panel.add(objectiveFour);
		panel.add(objectiveFive);
		
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