package main;


public class Player extends Mob {

	Inventory inventory = new Inventory(10);
	
	
	public int currentSlot = 0;
	
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
	
	
	
	
}
