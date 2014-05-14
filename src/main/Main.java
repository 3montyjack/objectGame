package main;

import javax.swing.SwingUtilities;

import attackEng.ItemReader;

public class Main {

	public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                	
                    Window wind = new Window();
                    wind.Start();
                    //System.out.println(ItemReader.getResultStr(11, 2));
                }
        });
    }

	
}
