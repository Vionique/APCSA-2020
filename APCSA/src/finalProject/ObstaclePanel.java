package finalProject;

import java.awt.Image;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ObstaclePanel{
	ArrayList<Obstacle> obstacleList;
	ArrayList<JLabel> iconList;
	EndlessGameTwo game;
	
	public ObstaclePanel(EndlessGameTwo g) {
		obstacleList = new ArrayList<Obstacle>();
		iconList = new ArrayList<JLabel>();
		game = g;
		//this.setOpaque(false);
		//this.setLayout(null);
		makeObstacles (5);
	}
	
	public void makeObstacles(int num) {
		//obstacleList.add(new Obstacle(400,400,30));
		//obstacleList.add(new Obstacle(300,200,30));
		for (int i = 0; i < num; i++) {
			obstacleList.add(new Obstacle((int) (Math.random() * 400) + 800,(int) (Math.random() * 500), 15));
		}
		for(Obstacle o : obstacleList) {
			JLabel tempLabel =new JLabel(new ImageIcon(o.getImage()));
			tempLabel.setBounds(o.getXPos(), o.getYPos(), 100,100);
			iconList.add(tempLabel);
			//this.add(tempLabel);
		}
	}
	public void allObstaclesMove(JPanel panel) {
		/*for (Obstacle o : obstacleList) {
			
			o.moveAndDraw("",panel, new JLabel(new ImageIcon(o.getImage())));
		}*/
		for (int i = 0; i < obstacleList.size(); i++) {
			iconList.get(i).setIcon(new ImageIcon(obstacleList.get(i).getImage()));
			obstacleList.get(i).moveAndDraw("",panel, iconList.get(i));
		}
	}
	
	public ArrayList<JLabel> getObstacles(){
		ArrayList<JLabel> temp = new ArrayList<JLabel>();
		for (Obstacle o : obstacleList) {
			JLabel tempLabel =new JLabel (new ImageIcon(o.getImage()));
			tempLabel.setLocation(o.getXPos(), o.getYPos());
			temp.add(tempLabel);
		}
		return temp;
	}
	
	public boolean checkAllCollisions(GameShip ship) {
		for (int i = 0; i < iconList.size(); i++) {
			if (obstacleList.get(i).checksCollision(ship)) {
				//obstacleList.remove(i);
				//iconList.remove(i);
				return true;
			}
		}
		return false;
	}

	public void removeAll(JPanel panel) {

		for (int i = 0; i < obstacleList.size(); i++) {
			
			panel.remove(iconList.get(i));
			
		}
		while (obstacleList.size() != 0) {
			obstacleList.remove(0);
		}
		

	}
	public void checkAllBlasts(JLabel blastIcon) {
		for (int i = 0; i < obstacleList.size(); i++) {
			if (obstacleList.get(i).checksBlast(blastIcon)) {
				try {
				    Image img = ImageIO.read(getClass().getResource("explode.png"));
				    obstacleList.get(i).setImage(4);
				    iconList.get(i).setIcon(new ImageIcon(img));
				} 
				catch (Exception ex) {
					System.out.println("image " + "explode.png" + " error");
				}
				
				/*//iconList.get(i).setVisible(false);
				obstacleList.remove(i);
				iconList.remove(i);
				obstacleList.add(new Obstacle((int) (Math.random() * 400) + 800,(int) (Math.random() * 500), 15));
				
				iconList.add(new JLabel(new ImageIcon(obstacleList.get(obstacleList.size() - 1).getImage())));
				iconList.get(iconList.size() - 1).setBounds(obstacleList.get(obstacleList.size() - 1).getXPos(), 
						obstacleList.get(obstacleList.size() - 1).getYPos(), 
						100, 100);
				
		*/
				//obstacleList.get(i).setPos((int) (Math.random() * 400) + 800,(int) (Math.random() * 500));
				//iconList.get(i).setBounds(obstacleList.get(i).getXPos(), obstacleList.get(i).getYPos(), iconList.get(i).getWidth(), iconList.get(i).getHeight());
				
		
				
			}
		}
	}
}

