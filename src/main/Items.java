package main;

public class Items {
	
	int damage;
	String name;
	
	public void item(int id){
	
		switch (id) {
		
			case 1000:
				name = "LongSword";
				damage = 10;
				break;
				
			case 1001:
				name = "ShortSword";
				damage = 5;
				break;
				
		}
	}
	
}
