package attackEng;



public class Mob {
	
	private Damage damage = new Damage();
	private Health health = new Health(100);
	private Energy energy = new Energy(100);
	public String action = "1";

	
	
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
		return energy.getEnergy();
	}
	
	public boolean getDead() {
		if (getHealth() <= 0) {
			setHealth(0);
			return true;
		} else {
			return false;
		}	
	}
	
	public boolean getEEnergy(int drain) {
		if (getEnergy()<= drain) {
			return true;
		} else {
			return false;
		}
	}
	
	//These are on the player that it is casted on, like player.slash deducts from the players health
	public void slash(int item) {
		if (checkItem(ItemList.getType(item)-1)) {
			System.out.println("003");
			looseHealth(damage.slashDmg(item));
			setAction(1);
		} else {
			System.out.println("Item not a Weapon");
		}

	}
	
	public void stab(int item) {
		if (checkItem(ItemList.getType(item)-1)) {
			looseHealth(damage.stabDmg(item));
			setAction(1);
		} else {
			System.out.println("Item not a Weapon");
		}
	}
	
	public void poke(int item) {
		if (checkItem(ItemList.getType(item)-1)) {
			looseHealth(damage.pokeDmg(item));
			setAction(1);
		} else {
			System.out.println("Item not a Weapon");
		}
	}

	public void smallPotion() {
		gainHealth(damage.Potion(10));
		setAction(2);
	}
	
	public void mediumPotion() {
		gainHealth(damage.Potion(11));
		setAction(2);
	}
	
	public void largePotion() {
		gainHealth(damage.Potion(12));
		setAction(2);
	}
	
	public void setAction(int value) {
		//1 = attack, 2 = potion
		switch (value) {
			case 1:
				//System.out.println("006");
				action = "Attack";
			case 2:
				action = "Potion";
			default: 
				action = "Null";
		}
	}
	
	private boolean checkItem(int type) {
		if (type == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getAction() {
		return action;
	}
	
}
