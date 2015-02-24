package attackEng;

import main.AttackInit;

public class MobList extends AttackInit {

	Mob[] mobList = new Mob[AttackInit.mobNumber];
	public MobList() {
		for (int slot = 0; slot <= AttackInit.mobNumber; slot++) {
			System.out.println("Attempt" + slot);
			mobList[slot] = new Mob(setName(slot),setType(slot));
		}
	}
	
	public String getName(int slot){
		return mobList[slot].getName();
	}
	
	public int getHealth(int slot) {
		return mobList[slot].getHealth();
	}
	
	
	
	
	
	
	
}
