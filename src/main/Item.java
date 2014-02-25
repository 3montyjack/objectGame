package main;

public class Item extends GameObject {
	
	protected String name;
	protected int damage;
	protected int energy;
	protected Player player;
	protected int id;
	
	protected void init(int id, int type, String name, int damage, int energy) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.energy = energy;
		this.damage = damage;
	}
	
	public String getName(Item item) {
		
		return name;
		
	}
	
	public int getId(){
		return id;
	}
	
	public void getItem() {
		System.out.println("You just got a " + name + "!");
		Player.addItem(this);
	}
	
	
	
	
	
}
