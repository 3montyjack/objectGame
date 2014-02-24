package main;

public class Item extends GameObject {
	
	protected String name;
	protected int damage;
	protected int energy;
	protected Player player;
	
	protected void init(int type, String name, int damage, int energy) {
		this.name = name;
		this.type = type;
		this.energy = energy;
		this.damage = damage;
	}
	
	public String getName(int item) {
		
		return name;
		
	}
	
	public void getItem() {
		System.out.println("You just got a " + name + "!");
		Player.addItem(this);
	}
	
	
	
	
}
