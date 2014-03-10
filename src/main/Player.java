package main;


public class Player extends Mob {

	private int weapon;
	Inventory inventory = new Inventory(10);
	
	public Player() {
		
	}
	
	public int currentSlot = 1;
	
	int currentSlot() {
		return currentSlot;
	}
	
	public boolean addItem(Item item) {
		if (inventory.add(item)) {
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public int getWeapon() {
		return currentSlot;
	}
	
	
	
}
