package main;


public class Mob {
	
	Health health = new Health();
	Energy energy = new Energy();
	
	public boolean getDead() {
		if (health.getHealth() < 0) {
			return true;
		} else {
			return false;
		}	
	}
	public void looseHealth(int ammount) {
		health.looseHealth(ammount);
	}
	
	public void gainHealth(int ammount) {
		health.gainHealth(ammount);
	}
	
	public void gainEnergy(int ammount) {
		energy.useEnergy(ammount);
	}
	
	public void useEnergy(int ammount) {
		energy.useEnergy(ammount);
	}
	
	public int getHealth() {
		return health.getHealth();

	}
	
	
	
	
	
	
}
