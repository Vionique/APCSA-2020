package starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private ArrayList<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for (int row = 1; row < 5; row++) { // 6, 5, 6, 5
			if (row % 2 == 1) {
				for (int i = 0; i < 8; i++) {
					aliens.add(new Alien(90 * i + 45, row * 40, 30,30, (int) (Math.random() * 3) - 1));
				}
			}
			else {
				for (int i = 0; i < 7; i++) {
					aliens.add(new Alien(90 * i + 90, row * 40, 30,30,(int) (Math.random() * 3)-1));
				}
			}
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a : aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		int count = (int) (Math.random() * 10);
		for (Alien a : aliens) {
			a.move("side");
		}
		
		if (count == 0) {
			for (Alien a : aliens) {
				a.move("down");
			}
		}
		
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (Ammo ammo : shots) {
			for (int i = 0; i < aliens.size(); i++) {
				if (ammo.getX() >= aliens.get(i).getX() && 
						ammo.getX() <= aliens.get(i).getX() + aliens.get(i).getWidth()
						&& ammo.getY() == aliens.get(i).getY() + aliens.get(i).getHeight()
						) {
					aliens.remove(i);
					
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
