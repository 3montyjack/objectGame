package main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Window {
	
	JFrame window = new JFrame();
	JLayeredPane PButtons = new JLayeredPane();

	static JButton AButton = new JButton("Attack");
	static JButton BButton = new JButton("Potion");
	static JButton CButton = new JButton("Back");

	public static void AButtonC(String name) {
		AButton.setText(name);
	}
	
	public static void BButtonC(String name) {
		BButton.setText(name);
	}
	
	public static void CButtonC(String name) {
		CButton.setText(name);
	}
	
	public Window() {
		window.setTitle("MMO");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayeredPane(PButtons);
		PButtons.add(AButton);
		PButtons.add(BButton);
		PButtons.add(CButton);
		AButton.setBounds(10, 350, 100, 30);
		BButton.setBounds(10, 390, 100, 30);
		CButton.setBounds(10, 430, 100, 30);
		
		
	}

}
