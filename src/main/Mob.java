package main;


public class Mob {
	
	Attack attack = new Attack();
	Health health = new Health(100);
	Energy energy = new Energy();
	Potion potion = new Potion();

	
	
	public boolean getDead() {
		if (health.getHealth() <= 0) {
			health.setHealth(0);
			return true;
		} else {
			return false;
		}	
	}
	public void looseHealth(int ammount) {
		health.looseHealth(ammount);
	}
	
	public void setHealth(int ammount) {
		health.setHealth(ammount);
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
	//These are on the player that it is casted on, like player.slash deducts from the players health
	public void slash(int item) {
		looseHealth(attack.slash(item));
	}
	
	public void stab(int item) {
		looseHealth(attack.stab(item));
	}
	
	public void poke(int item) {
		looseHealth(attack.poke(item));
	}

	public void smallPotion() {
		gainHealth(potion.smallPotion());
	}
	
	public void mediumPotion() {
		gainHealth(potion.mediumPotion());
	}
	
	public void largePotion() {
		gainHealth(potion.largePotion());
	}
	
}
