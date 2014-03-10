package main;

public class ItemList {

	private static Item[] items = null;
	

	
	public static void setup (int maxItems) 
	{
		ItemList.items = new Item[maxItems];
		for (int i = 0; i < maxItems; i++)
		{
			//Default item?
			//Item type, Item Name, Item Bonus Damage, Item Energy
			ItemList.items[i] = new Item(0,null, 0, 0);
		}
		
		items[0] = new Item(1, "Hand", 0, 0);
		items[1] = new Item(1,"Sword", 5, 5);
		items[2] = new Item(1,"Mace", 10, 10);
		items[10] = new Item(1,"Zombie Staf", 100, 10);

	}
	
	public Item fetch(int index)
	{
		if(index<ItemList.items.length)
	      {
	                return ItemList.items[index];
	      }
	      return null;
	}
	
	public static int getDamage(int item) 
	{
		return items[item].getDamage();
	}
	
	public int getEnergy(int item)
	{
		return items[item].getEnergy();
	}
	
	public int getType(int item) 
	{
		return items[item].getType();
		
	}
	
	public static String getName(int item)
	{
		return items[item].getName();
	}
}
