package main;

public class Zomble extends Mob {
	
	AI ai = new AI();
	
	void attack() {
		makeMove();
	}
	
	@SuppressWarnings("unused")
	private int checkPHealth() {
		return Player.getHealth();
	}

	void makeMove()
	{
		if  (checkHealth() <= 10) 
		{
			mediumPotion();
		} else {
			Player.stab(0);
		}
	}

	@SuppressWarnings("unused")
	private void checkEnergy() {
		// TODO Make energy checks
			
	}

	private int checkHealth() {
		// TODO Auto-generated method stub
		return getHealth();
	}
	
	
}


