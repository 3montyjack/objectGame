package main;

public class Attack {
	
	public int slash(int item) {
		int sD = 15;
		return ItemList.getDamage(item) + sD;
	}
	
	public int stab(int item) {
		int sD = 10;
		return ItemList.getDamage(item) + sD;
	}
	
	public int poke(int item) {
		int sD = 5;
		return ItemList.getDamage(item) + sD;
	}
}
