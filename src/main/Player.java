package main;


public class Player extends Mob {
	 static int[] inventory = {0,0,0,0,0,0,0,0,0,0};
	 
	 
	 public static void setInv(int slot, int value) {
		 inventory[slot] = value;
	 }
	 
	 public static int checkSlot(int slot) {
		 int value = inventory[slot];
		 return value;
	 }
}
