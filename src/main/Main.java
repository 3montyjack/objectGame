package main;

public class Main {

	static Cube ha = new Cube();
	static Window window = new Window();
	static Player player = new Player();
	static Cube cube = new Cube();
	
	public static void main(String[] args) {
		new Window();
		new Cube();
		
		window.setMainPlane();
		ha.getItem();
		window.setBounds(0);
		player.setInv(cube);
		
	}
	

}
