package main;

public class Attack {
	
	public int slash(int item) {
		int sD = 10;
		int damage =ItemList.getDamage(item) + sD;
		return damage;
	}
	
	public int stab(int item) {
		int sD = 5;
		int damage =ItemList.getDamage(item) + sD;
		return damage;
	}
	
	public int poke(int item) {
		int sD = 1;
		int damage =ItemList.getDamage(item) + sD;
		return damage;
	}
}
