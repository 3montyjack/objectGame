package main;

import attackEng.Mob;
import attackEng.MobList;

public class AttackInitial {
	MobList list;
	public AttackInitial() {
		list = new MobList();
	}
	
	//Health of Mobs
	public static int 
	humanHealth = 100,
	zombieHealth = 100,
	alienHealth = 100;
	
	//Mob List			
	static int[] mobType = 
		{0,
		 0,
		 0,
		 0,
		 0,
		 0,
		 0,
		 0,
		 0,
		 0};
	
	static String[] mobName = 
		{"Player",
		 "Enemy",
		 "Enemy",
		 "Enemy",
		 "Enemy",
		 "Enemy",
		 "Enemy",
		 "Enemy",
		 "Enemy",
		 "Enemy"};
	
	public static int mobNumber = mobType.length;
	
	
	
	//Types List 1 = human, 2 = zombie, 3 = alien
	

	public static int getType(int slot) {
		return mobType[slot];
	}
	
	public static String getName(int slot) {
		return mobName[slot];
	}
	
}
