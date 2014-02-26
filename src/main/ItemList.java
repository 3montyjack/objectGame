package main;

public class ItemList {
	
	private static Item[] items = null;
	
	public static void setup () 
	{
		
		items[0] = (10, "Sword", 3, 4);
		ItemList.items = new Item[10];
	}
	
}
