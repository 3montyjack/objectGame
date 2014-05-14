package attackEng;

public class Damage {
	
	public int slashDmg(int item) {
		int sD = 15;
		return ItemList.getDamage(item) + sD;
	}
	
	public int stabDmg(int item) {
		int sD = 10;
		return ItemList.getDamage(item) + sD;
	}
	
	public int pokeDmg(int item) {
		int sD = 5;
		return ItemList.getDamage(item) + sD;
	}
	
	public int slashErg(int item) {
		int sD = 15;
		return ItemList.getEnergy(item) + sD;
	}
	
	public int stabErg(int item) {
		int sD = 10;
		return ItemList.getEnergy(item) + sD;
	}
	
	public int pokeErg(int item) {
		int sD = 5;
		return ItemList.getEnergy(item) + sD;
	}
	
	public int Potion(int item) {
		return ItemList.getDamage(item);
	}
}
