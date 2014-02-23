package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class Window {
	
	JFrame window = new JFrame();
	static JLayeredPane main = new JLayeredPane();
	static JLayeredPane attack = new JLayeredPane();
	static JLayeredPane potion = new JLayeredPane();

	static JButton AMButton = new JButton("Attack");
	static JButton BMButton = new JButton("Potion");
	static JButton CMButton = new JButton("Back");
	
	static JButton APButton = new JButton("Small Potion");
	static JButton BPButton = new JButton("Medium Potion");
	static JButton CPButton = new JButton("Large Potion");
	static JButton DPButton = new JButton("Back");
	
	static JButton AAButton = new JButton("Slash");
	static JButton BAButton = new JButton("Stab");
	static JButton CAButton = new JButton("Poke");
	static JButton DAButton = new JButton("Back");

	
	public Window() {
		window.setTitle("MMO");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayeredPane(main);
		window.setLayeredPane(potion);
		
		main.add(AMButton);
		main.add(BMButton);
		main.add(CMButton);
		
		potion.add(APButton);
		potion.add(BPButton);
		potion.add(CPButton);
		potion.add(DPButton);
		
		attack.add(APButton);
		attack.add(BPButton);
		potion.add(CPButton);
		potion.add(DPButton);
		
		AMButton.setBounds(10, 350, 100, 30);
		BMButton.setBounds(10, 390, 100, 30);
		CMButton.setBounds(10, 430, 100, 30);
		
		APButton.setBounds(10, 310, 100, 30);
		BPButton.setBounds(10, 350, 100, 30);
		CPButton.setBounds(10, 390, 100, 30);
		DPButton.setBounds(10, 430, 100, 30);
		
	}
	
	public static void setMainPlane() {
		main.setVisible(true);
		potion.setVisible(false);
	}
	
	public static void setPotionPlane() {
		main.setVisible(false);
		potion.setVisible(true);
	}

}
