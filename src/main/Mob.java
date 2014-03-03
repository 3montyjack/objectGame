package main;


public class Mob {
	
	static Attack attack = new Attack();
	static Health health = new Health(100);
	Energy energy = new Energy();
	static Potion potion = new Potion();

	
	
	public boolean getDead() {
		if (health.getHealth() < 0) {
			return true;
		} else {
			return false;
		}	
	}
	public static void looseHealth(int ammount) {
		health.looseHealth(ammount);
	}
	
	public static void gainHealth(int ammount) {
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
		looseHealth(attack.slash(item));
	}
	
	public static void stab(int item) {
		looseHealth(attack.stab(item));
	}
	
	public static void poke(int item) {
		looseHealth(attack.poke(item));
	}

	public static void smallPotion() {
		gainHealth(potion.smallPotion());
	}
	
	public static void mediumPotion() {
		gainHealth(potion.mediumPotion());
	}
	
	public static void largePotion() {
		gainHealth(potion.largePotion());
	}
	
	
	
	
}
