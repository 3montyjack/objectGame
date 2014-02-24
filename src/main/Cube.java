package main;

public class Cube extends Item {

	
	public Cube() {
		init(1,"Cube", 5, 5);
	}
	
	public void getItem() {
		System.out.println("You just got a " + name + "!");
		Player.addItem(this);
	}
}
