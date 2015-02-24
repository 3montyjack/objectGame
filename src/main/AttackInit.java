package main;


public class AttackInit {
	
	//Health of Mobs
	public static int 
	humanHealth = 100,
	zombieHealth = 100,
	alienHealth = 100;
	
	//Health of Mobs
	public static int 
	humanArmor = 10,
	zombieArmor = 10,
	alienArmor = 10;
	
	//Mob List			
	int[] mobType = 
		{1,
		 2,
		 3,
		 1,
		 1,
		 2,
		 3,
		 3,
		 2,
		 2};
	
	String[] mobName = 
		{"Player",
		 "Me",
		 "Nupe",
		 "Caka",
		 "Enemy",
		 "Enemy",
		 "Enemy",
		 "Enemy",
		 "Enemy",
		 "Enemy"};
	
	public int mobNumber = mobType.length-1;
	
	
	
	//Types List 1 = human, 2 = zombie, 3 = alien
	

	public int setType(int slot) {
		return mobType[slot];
	}
	
	public int getType(int slot) {
		return setType(slot);
	}
	
	public String setName(int slot) {
		return mobName[slot];
	}
	
	public String getName(int slot) {
		return setName(slot);
	}
	
}
