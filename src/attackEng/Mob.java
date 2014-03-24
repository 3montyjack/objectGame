package attackEng;



public class Mob {
	
	Attack attack = new Attack();
	Health health = new Health(100);
	Energy energy = new Energy();
	Potion potion = new Potion();
	String action;
	
	
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
	
	public void setEnergy(int ammount) {
		health.setHealth(ammount);
	}
	
	public void useEnergy(int ammount) {
		energy.useEnergy(ammount);
	}
	
	public int getHealth() {
		return health.getHealth();
	}
	
	public int getEnergy() {
		return energy.getHealth();
	}
	
	public boolean getDead() {
		if (getHealth() <= 0) {
			setHealth(0);
			return true;
		} else {
			return false;
		}	
	}
	
	public boolean getNotEnoughEnergy(int drain) {
		if (getEnergy()<= drain) {
			return true;
		} else {
			return false;
		}
	}
	
	//These are on the player that it is casted on, like player.slash deducts from the players health
	public void slash(int item) {
		System.out.println("003");
		looseHealth(attack.slashDmg(item));
	}
	
	public void stab(int item) {
		looseHealth(attack.stabDmg(item));
	}
	
	public void poke(int item) {
		looseHealth(attack.pokeDmg(item));
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
	
	public void setAction(int value) {
		//1 = attack, 2 = potion
		switch (value) {
			case 1:
				action = "Attack";
			case 2:
				action = "Potion";
			default: 
				action = null;
		}
	}
	
	public String getAction() {
		return action;
	}
	
}
