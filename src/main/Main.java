package main;

import javax.swing.SwingUtilities;

import attackEng.Inventory;

public class Main {
	
	public static void main(String args[]) {
		
        SwingUtilities.invokeLater(new Runnable() {
                
				public void run() {
					Inventory inv = new Inventory();
                	//MapReader map;
					
                    Window wind = new Window();
                    wind.Start();
                    System.out.println(inv.add(1));
					System.out.println(inv.add(1));
					System.out.println(inv.add(2));
					System.out.println(inv.add(2));
                }
        });
    }

	
}
