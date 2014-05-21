package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import envEng.MapReader;


public class MapWindow {
	JFrame wind = new JFrame();
	private int width = 500;
	private int height = 500;
	Paint p = new Paint();
	
	
	
	public MapWindow() {
		wind.setVisible(true);
		wind.setBounds(505, 0, width, height);
		wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wind.add(p);
		
	}
		

}

@SuppressWarnings("serial")
class Paint extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.clearRect(0, 0, getWidth(), getHeight());
		//System.out.print("100");
		draw(g);
		repaint();
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
		for (int x = 0; x < MapReader.getMapW();x++) {
			for (int y = 0; y < MapReader.getMapH(); y++) {
				if (MapReader.checkNumb(x,y) == 0) {
					g.drawRect(x, y, 10*x+10, 10*y+10);
				}
			}
		}
	}
}
