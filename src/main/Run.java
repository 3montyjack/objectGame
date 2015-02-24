package main;

import javax.swing.SwingUtilities;

public class Run {

	public static AttackInitial attack;
	
	private Run() {
		
	}
	public static void main(String[] args) {
		 	SwingUtilities.invokeLater(new Runnable() {

				public void run() {
					attack = new AttackInitial();
					
				}
		 		
		 	});
		 }

	}


