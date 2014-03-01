package main;


public class Player extends Mob {

	Inventory inventory = new Inventory(10);
	
	int currentSlot = 0;
		 
	public static int checkSlot(int slot) {
		int value = 0;
		
		return value;
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
