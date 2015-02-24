package attackEng;

import main.AttackInitial;

public class MobList {

	Mob[] mobList;
	public MobList() {
		mobList = new Mob[AttackInitial.mobNumber];
		for (int slot = 0; slot <= AttackInitial.mobNumber; slot++) {
			mobList[slot] = new Mob(AttackInitial.getName(slot),AttackInitial.getType(slot));
		}
	}
	
	public String getName(int slot){
		return mobList[slot].getName();
	}
	
	public int getHealth(int slot) {
		return mobList[slot].getHealth();
	}
	
	
	
	
	
	
	
}
