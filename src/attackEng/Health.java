package attackEng;


public class Health {
	
	int health;
	
	public Health(int startingHealth) {
		setHealth(startingHealth);
	}
	
	int getHealth() {
		return health;
	}
	
	
	void setHealth(int ammount) {
		health = ammount;
		
	}
	
	void looseHealth(int ammount) {
		health = health - ammount;
	}
	
	void gainHealth(int ammount) {
		health = health + ammount;
	}
}
