package attackEng;

import main.AttackInitial;

public class Mob {
	
	Health health;
	
	String name = "";
	int type;
	public Mob(String name, int type) {
		
		this.name = name;
		this.type = type;
		switch (type){
			case 1:
				makeHuman();
				break;
			case 2:
				makeZombie();
				break;
			case 3:
				makeAlien();
				break;
			default:
				
				break;
		}
		
		
	}

	private void makeAlien() {
		health = new Health(AttackInitial.alienHealth);
		
	}

	private void makeZombie() {
		health = new Health(AttackInitial.zombieHealth);
		
	}

	private void makeHuman() {
		health = new Health(AttackInitial.humanHealth);
		
		
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health.getHealth();
	}

}
