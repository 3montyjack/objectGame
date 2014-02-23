package main;

public class GameObject {

	public int type;
	
	public void update() {
		
	}
	
	public int getType() {
		return type;
	}
	
	protected void init(int type) {
		this.type = type;
	}
	
}
