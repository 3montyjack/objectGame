package attackEng;

public class Inventory {

	private int[] inv;
	private int iSize = 4;
	private int firstFree = 0;
	
	public Inventory(int size) {
		inv = new int[size];
		for (int ehh:inv) {
			inv[ehh] = 0;
		}
		iSize = size;
	}
	
	public Inventory() {
		inv = new int[iSize];
		for (int ehh:inv) {
			inv[ehh] = 0;
		}
	}
	
	public boolean add(int item) {
		for (int i = 0; i < iSize; i++) {
			if (inv[i]==item) {
				System.out.println(i);
				return false;
			}
		}
		inv[firstFree] = item;
		nextFree();
		return true;
		
	}
	
	public int getSlot(int slot) {
		return getID(inv[slot]);
	}
	
	public int getID(int item) {
		return ItemList.getID(item);
		
	}
	public boolean checkItemThere(int slot) {
		if (getSlot(slot) != 0) {
			return false;
		}
		return true;
	}
	
	public void nextFree() {
		for (int i = 0; i < iSize; i++) {
			if (inv[i]==0) {
				firstFree = i;
				return;
			}
		} 
		firstFree = 0;
		
	}
	
	public void remove(int item) {
		for (int number:inv) {
			if (number == item) {
				inv[item] = 0;
				firstFree = item;
			}
		}
	}
}
