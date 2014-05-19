package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JWindow;
import envEng.MapReader;


public class MapWindow extends JComponent {

	private static final long serialVersionUID = 1L;
	JWindow wind = new JWindow();
	private int width = 500;
	private int height = 500;
	
	
	public MapWindow() {
		wind.setVisible(true);
		wind.setBounds(100, 100, width, height);
	}
	
	public void draw (Graphics g) {
		g.setColor(new Color(123,74,18));
		for (int x = 0; x < MapReader.getMapW();x++) {
			for (int y = 0; y < MapReader.getMapH(); y++) {
				if (MapReader.checkNumb(x,y) == 1) {
					g.drawLine(x, y, x+1, y+1);
					System.out.print(13);
				}
				System.out.print(15);
				System.out.println();
			}
			System.out.println("Hello");
		}
		repaint();
		
	}
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        draw(g);
    }
}
