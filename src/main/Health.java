package main;


public class Health {
	
	int health;
	
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
