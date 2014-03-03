package main;


public class Player extends Mob {

	Inventory inventory = new Inventory(10);
	
	public static int currentSlot = 0;
	
	
	
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
