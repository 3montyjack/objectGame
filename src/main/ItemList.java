package main;

public class ItemList {

	private static Item[] items = null;
	
	public static void setup (int maxItems) 
	{
		items[0].damage = 3;
		items[0].energy = 3;
		items[0].name = "Wooden Sword";
		items[0].type = 1;
		
		
		ItemList.items = new Item[maxItems];
		for (int i = 0; i < maxItems; i++)
		{
			ItemList.items[i] = new Item(10,"Sword",3,4);
		}
	}
	
	public static Item fetch(int index)
	{
		if(index<ItemList.items.length)
	      {
	                return ItemList.items[index];
	      }
	      return null;
	}
	
	public static int getDamage(int item) 
	{
		int damage =items[item].getDamage();
		return damage;
	}
	
	public static int getEnergy(int item)
	{
		int energy = items[item].getEnergy();
		return energy;
	}
	
	public static int getType(int item) 
	{
		int type = items[item].getType();
		return type;
		
	}
	
	public static String getName(int item)
	{
		String name = items[item].getName();
		return name;
	}
}
