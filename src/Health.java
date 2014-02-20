

public class Health {
	
	int health;
	
	int getHealth() {
		return health;
	}
	
	
	void setHealth(int ammount) {
		health = ammount;
		
	}
	
	void damage(int ammount) {
		health = health - ammount;
	}
	
	void heal(int ammount) {
		health = health + ammount;
	}
}
