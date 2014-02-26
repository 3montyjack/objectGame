package main;

public class ItemList {
	private static int maxItems = 10;
	private static Item[] items = null;
	
	public static void setup () 
	{
		
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
}
