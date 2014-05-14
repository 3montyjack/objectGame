package attackEng;

import java.io.IOException;

public class ItemList {

	private static Item[] items = null;
	
	private static ItemReader input = null;
	
	public ItemList() {
		
		try {
			input = new ItemReader();
		} catch (IOException e) {
			System.out.print("Error in main");
			e.printStackTrace();
		}
		
		ItemList.items = new Item[input.getAItems()];
		
		for (int i=0; i < input.getAItems();i++) {
			//Item type, Item Name, Item Bonus Damage, Item Energy
			items[i] = new Item(ItemReader.getResultInt(i,0),
								ItemReader.getResultStr(i,1),
								ItemReader.getResultInt(i,2),
								ItemReader.getResultInt(i,3));
			//System.out.println(i);
		}
		
	}
	
	public Item fetch(int index) {
		if(index<ItemList.items.length) {
			return ItemList.items[index];
	    }
		return null;
	}
	
	public static int getDamage(int item) {
		return items[item].getDamage();
	}
	
	public static int getEnergy(int item) {
		return items[item].getEnergy();
	}
	
	public static int getType(int item) {
		return items[item].getType();
		
	}
	
	public static String getName(int item) {
		return items[item].getName();
	}
}
