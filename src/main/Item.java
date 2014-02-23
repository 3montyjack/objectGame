package main;

public class Item extends GameObject {
	
	protected static String name;
	protected int damage;
	protected int energy;
	
	protected void init(int type, String name, int damage, int energy) {
		Item.name = name;
		this.type = type;
		this.energy = energy;
		this.damage = damage;
	}
	
	public void getItem() {
		
	}
	
	
}
