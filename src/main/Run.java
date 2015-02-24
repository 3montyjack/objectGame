package main;

import javax.swing.SwingUtilities;

import attackEng.MobList;

public class Run {

	
	MobList mobs;
	
	private Run() {
		
	}
	public static void main(String[] args) {
		mobs = new MobList();
		 	SwingUtilities.invokeLater(new Runnable() {

				public void run() {
					
					for (int i = 0; i < 5; i++)
					{
						System.out.println(mobs.getHealth(i));
						System.out.println(mobs.getName(i));
						System.out.println(mobs.getType(i));
					}
					
				}
		 		
		 	});
		 }

	}


