package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class Window extends JFrame{
	
	static JFrame window = new JFrame();
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
		
		window.add(potion);
		window.add(main);
		window.add(attack);
		
		window.add(AMButton);
		window.add(BMButton);
		window.add(CMButton);
		
		window.add(APButton);
		window.add(BPButton);
		window.add(CPButton);
		window.add(DPButton);
		
		window.add(AAButton);
		window.add(BAButton);
		window.add(CAButton);
		window.add(DAButton);
		
		AMButton.setBounds(10, 350, 100, 30);
		BMButton.setBounds(10, 390, 100, 30);
		CMButton.setBounds(10, 430, 100, 30);
		
		APButton.setBounds(10, 310, 100, 30);
		BPButton.setBounds(10, 350, 100, 30);
		CPButton.setBounds(10, 390, 100, 30);
		DPButton.setBounds(10, 430, 100, 30);
		
		AAButton.setBounds(10, 310, 100, 30);
		BAButton.setBounds(10, 350, 100, 30);
		CAButton.setBounds(10, 390, 100, 30);
		DAButton.setBounds(10, 430, 100, 30);
		
	}
	
	
	
	public void mainBs(boolean set) {
		AMButton.setVisible(set);
		BMButton.setVisible(set);
		CMButton.setVisible(set);
	}
	
	public void potionBs(boolean set) {
		APButton.setVisible(set);
		BPButton.setVisible(set);
		CPButton.setVisible(set);
	}
	
	public void attackBs(boolean set) {
		AAButton.setVisible(set);
		BAButton.setVisible(set);
		CAButton.setVisible(set);
	}
	
	public void setPotionPlane() {
		mainBs(false);
		potionBs(true);
		attackBs(false);
	}
	
	public void setMainPlane() {
		mainBs(true);
		potionBs(false);
		attackBs(false);
	}
	
	public void setAttackPlane() {
		mainBs(false);
		potionBs(false);
		attackBs(true);
	}
	
	

}
