package attackEng;



public class Player extends Mob {

	Inventory inventory = new Inventory(10);
	
	public Player() {
		
	}
	
	public int currentSlot = 1;
	
	public int currentSlot() {
		return currentSlot;
	}
	
	public boolean addItem(Item item) {
		if (inventory.add(item)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public int getWeapon() {
		return currentSlot;
	}
	
	
	
	
	
}
