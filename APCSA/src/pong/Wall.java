package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block {
	
	public Wall() {
		super(0,0, 500, 10);
	}
	public Wall(int x, int y, String orientation) {
		super(x, y);
		if (orientation.equalsIgnoreCase("V")) {
			setHeight(500);
			setWidth(10);
		}
		if (orientation.equalsIgnoreCase("H")) {
			setWidth(500);
			setHeight(10);
		}
	}
	public Wall(int x, int y, int w, int h) {
		super(x, y, w, h);
	}
}

