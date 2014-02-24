package main;


public class Player extends Mob {
	
	Item item = new Item();
	static int[] inventory = {0,0,0,0,0,0,0,0,0,0};
	 
	 
	public static void setInv(int slot, int value) {
		 inventory[slot] = value;
	}
	 
	public static int checkSlot(int slot) {
		int value = inventory[slot];
		return value;
	}
	 
	public void printNameItem(int slot) {
		item.getName(inventory[slot]);
	}
	 
	public static void addItem(Item item) {
		 
	}
}
