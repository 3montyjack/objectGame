package main;


public class Player extends Mob {
	

	Inventory inventory = new Inventory(10);
	 
	 
	public void setInv(Item value) {
		 inventory.add(value);
	}
	 
	public static int checkSlot(int slot) {
		int value = 0;
		return value;
	}
	
	
	public static void addItem(Item item) {
		 
	}
}
