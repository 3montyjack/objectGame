package attackEng;

public class Item 
{
	
	protected int type;
	protected String name;
	protected int damage;
	protected int energy;
	protected int ID;
	
	public Item(int type, String name, int damage, int energy, int ID)
	{
		this.name = name;
		this.type = type;
		this.energy = energy;
		this.damage = damage;
		this.ID = ID;
	}
	
	public String getName() 
	{
		return name;
		
	}
	
	public int getDamage() 
	{
		return damage;
		
	}
	
	public int getEnergy() 
	{
		return energy;
		
	}
	
	public int getType() 
	{
		return type;
		
	}
	
	public int getID() 
	{
		return ID;
		
	}
	
	
	
	
}
