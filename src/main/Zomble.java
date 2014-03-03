package main;

public class Zomble extends Mob {
	
	Player player;
	
	public Zomble(Player inputs) {
		player = inputs;
	}
	
	void attack() {
		makeMove();
	}
	
	@SuppressWarnings("unused")
	private int checkPHealth() {
		return player.getHealth();
	}

	void makeMove()
	{
		if  (checkHealth() <= 10) 
		{
			largePotion();
		} else {
			player.stab(2);
		}
	}

	@SuppressWarnings("unused")
	private void checkEnergy() {
		// TODO Make energy checks
			
	}

	private int checkHealth() {
		return getHealth();
	}
	
	
}


