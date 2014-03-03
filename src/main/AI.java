package main;

public class AI {

	private int checkPHealth() {
		// TODO Auto-generated method stub
		return Player.getHealth();
	}

	static void makeMove()
	{
		// TODO Auto-generated method stub
		if  (checkHealth() <= 10) 
		{
			Zomble.mediumPotion();
		} else {
			Player.stab(0);
		}
	}

	private void checkEnergy() {
		// TODO Make energy checks
		
		
	}

	private static int checkHealth() {
		// TODO Auto-generated method stub
		return Zomble.getHealth();
	}
}
