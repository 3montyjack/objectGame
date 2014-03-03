package main;

public class Potion
{

	Potion(int type)
	{
		switch (type) 
		{
		case 1:
			mediumPotion();
		case 2:
			largePotion();
		default:
			smallPotion();
		
		}
	}

	private int mediumPotion() {
		// TODO Auto-generated method stub
		int health = 10;
		return health;
	}

	private int largePotion() {
		// TODO Auto-generated method stub
		int health = 20;
		return health;
	}

	private int smallPotion() {
		// TODO Auto-generated method stub
		int health = 5;
		return health;
	}
}
