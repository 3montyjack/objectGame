package main;

import java.io.IOException;

import javax.swing.SwingUtilities;

import envEng.MapReader;

public class Main {

	public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                	
                    Window wind = new Window();
                    wind.Start();
                    try {
						MapReader map = new MapReader();
					} catch (IOException e) {
						System.out.println("Error");
						e.printStackTrace();
					}
                    //System.out.println(ItemReader.getResultStr(11, 2));
                }
        });
    }

	
}
