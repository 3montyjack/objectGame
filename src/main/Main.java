package main;

import java.io.IOException;

import javax.swing.SwingUtilities;

import envEng.MapReader;
import attackEng.ItemReader;

public class Main {
	
	public static void main(String args[]) {
		
        SwingUtilities.invokeLater(new Runnable() {
                
				public void run() {
                	//MapReader map;
                    Window wind = new Window();
                    wind.Start();
                    
                }
        });
    }

	
}
