package main;

public class Main {

	static Cube ha = new Cube();
	static Window window = new Window();
	
	public static void main(String[] args) {
		new Window();
		new Cube();
		
		window.setMainPlane();
		ha.getItem();
		
		window.setBounds(0);
		
		
	}
	

}
