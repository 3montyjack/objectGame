package main;

import java.io.IOException;

import javax.swing.SwingUtilities;

import envEng.MapReader;
import attackEng.ItemReader;

public class Main {
	
	public static void main(String args[]) {
		
        SwingUtilities.invokeLater(new Runnable() {
                
				public void run() {
                	
                    Window wind = new Window();
                    wind.Start();
                    
                    try {
						new MapReader();
					} catch (IOException e) {
						System.out.println("ErrorPlz");
						e.printStackTrace();
					}
                    
                    MapWindow wind2= new MapWindow();
                    
                    
                    System.out.println(ItemReader.getResultStr(11, 2));
                }
        });
    }

	
}
