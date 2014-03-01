package main;


public class Mob {
	
	static Attack attack = new Attack();
	static Health health = new Health(100);
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
	
	public static int getHealth() {
		return health.getHealth();

	}
	//These are on the player that it is casted on, like player.slash deducts from the players health
	public static void slash(int item) {
		health.looseHealth(attack.slash(item));
	}
	
	public static void stab(int item) {
		health.looseHealth(attack.stab(item));
	}
	
	public static void poke(int item) {
		health.looseHealth(attack.poke(item));
	}
	
	
	
	
	
}
