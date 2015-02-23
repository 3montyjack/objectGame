package attackEng;



public class Player extends Mob {

	
	
	public Player() {
		inv = new Inventory();
	}
	
	public boolean addItem(int item) {
		return inv.add(item);
	}
	
	
}
