package main;

public class Item 
{
	
	protected int type;
	protected String name;
	protected int damage;
	protected int energy;
	
	public Item(int type, String name, int damage, int energy)
	{
		this.name = name;
		this.type = type;
		this.energy = energy;
		this.damage = damage;
	}
	
	public String getName(Item item) 
	{
		return name;
		
	}
	
	public int getDamage(Item item) 
	{
		return damage;
		
	}
	
	public int getEnergy(Item item) 
	{
		return energy;
		
	}
	
	public int getType(Item item) 
	{
		return type;
		
	}
	
	
	
	
	
}
