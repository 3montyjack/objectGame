package main;

import java.io.IOException;

import javax.swing.SwingUtilities;

import envEng.ItemReader;

public class Main {

	public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                	ItemReader maze = null;
					try {
						maze = new ItemReader();
					} catch (IOException e) {
						System.out.print("Error in main");
						e.printStackTrace();
					}
                    Window wind = new Window();
                    //wind.Start();
                    maze.getResult(2, 2);
                    
                }
        });
    }

	
}
