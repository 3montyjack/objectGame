package main;


public class Mob {
	
	Health aHealth = new Health();
	
	public boolean pDeath() {
		if (aHealth.getHealth() < 0) {
			return true;
		} else {
			return false;
		}	
	}
	public void damage(int ammount) {
		aHealth.damage(ammount);
	}
	
	
}
