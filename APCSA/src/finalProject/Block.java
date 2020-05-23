package finalProject;

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public abstract class Block{
	private int xPos, yPos, width, height, speed;
	private Color color;
	
	public Block() {
		setPos(0,0);
		setSize(10,10);
		setSpeed(0);
		setColor(Color.BLACK);
	}
	public Block(int x, int y) {
		setPos(x, y);
		setSize(10,10);
		setSpeed(0);
		setColor(Color.BLACK);
	}
	public Block(int x, int y, int w, int h) {
		setPos(x, y);
		setSize(w, h);
		setSpeed(0);
		setColor(Color.BLACK);
	}
	public Block(int x, int y, int w, int h, int s) {
		setPos(x, y);
		setSize(w, h);
		setSpeed(s);
		setColor(Color.BLACK);
	}
	public Block(int x, int y, int w, int h, int s, Color col) {
		setPos(x, y);
		setSize(w, h);
		setSpeed(s);
		setColor(col);
	}
	
	public void setXPos(int x) {
		xPos = x;
	}
	public void setYPos(int y) {
		yPos = y;
	}
	public void setPos(int x, int y) {
		setXPos(x);
		setYPos(y);
	}
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public void setSize(int w, int h) {
		setWidth(w);
		setHeight(h);
	}
	public void setSpeed(int s) {
		speed = s;
	}
	public void setColor(Color c) {
		color = c;
	}
	
	public int getXPos() {
		return xPos;
	}
	public int getYPos() {
		return yPos;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getSpeed() {
		return speed;
	}
	public Color getColor() {
		return color;
	}
	
	public abstract void move(String direction);
	public abstract void moveAndDraw(Graphics window, String direction);
	public abstract void draw(Graphics window);
	public String toString()
	{
		return getXPos() + " " + getYPos() + " " + getWidth() + " " + getHeight();
	}
}

