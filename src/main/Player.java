package main;


public class Player extends Mob {
	
	Item item = new Item();
	Inventory inventory = new Inventory(10);
	 
	 
	public void setInv(Item value) {
		 inventory.add(value);
	}
	 
	public static int checkSlot(int slot) {
		int value = 0;
		return value;
	}
	 
	public void printNameItem(int slot) {
		item.getName(inventory.get(slot));
	}
	 
	public static void addItem(Item item) {
		 
	}
}
