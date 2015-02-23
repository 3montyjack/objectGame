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
			//Item type, Item Name, Item Bonus Damage, Item Energy, ItemID.
			items[i] = new Item(ItemReader.getResultInt(i,0),
								ItemReader.getResultStr(i,1),
								ItemReader.getResultInt(i,2),
								ItemReader.getResultInt(i,3),
								ItemReader.getResultInt(i,4));
			//System.out.println(i);
		}
		
	}
	
	/*private void runDefault() {
		
		items[1] = new Item(1,"Hand",0,0);
		items[2] = new Item(1,"Sword",5,5);
		items[3] = new Item(1,"Mace",10,10);
		items[4] = new Item(1,"NotAdded",0,0);
		items[5] = new Item(1,"NotAdded",0,0);
		items[6] = new Item(1,"NotAdded",0,0);
		items[7] = new Item(1,"NotAdded",0,0);
		items[8] = new Item(1,"NotAdded",0,0);
		items[9] = new Item(1,"NotAdded",0,0);
		items[10] = new Item(1,"Holy Hand Granade",0,0);
		items[11] = new Item(1,"Small Potion",10,0);
		items[12] = new Item(1,"Medium Potion",20,0);
		items[13] = new Item(1,"Large Potion",30,0);
	}*/

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
	
	public static int getID(int item) {
		return items[item].getID();
	}
	
	public static String getNameID(int ID) {
		for (int i = 0; i < Player.iSize();i++) {
			if (ID == items[i].getID()) {
				return items[i].getName();
			}
		}
		return null;
	}
}
