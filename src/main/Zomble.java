package main;

public class Zomble extends Mob {
	
	AI ai = new AI();
	
	void attack() {
		ai.makeMove();
	}
	
	
}

class AI extends Zomble{

	@SuppressWarnings("unused")
	private int checkPHealth() {
		// TODO Auto-generated method stub
		return Player.getHealth();
	}

	void makeMove()
	{
		// TODO Auto-generated method stub
		if  (checkHealth() <= 10) 
		{
			Zomble.mediumPotion();
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
		return Zomble.getHealth();
	}
}

