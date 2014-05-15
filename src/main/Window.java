package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import attackEng.AttackEng;
import attackEng.ItemList;

public class Window implements ActionListener{
	
	private int screen = 0;
	
	JFrame window = new JFrame();
	
	AttackEng eng = new AttackEng();
	
	JLabel pHealth = new JLabel("Player Health: " + eng.getPHealth());
	JLabel eHealth = new JLabel("Enemy Health: " + eng.getZHealth());
	JLabel label = new JLabel("No Error");
	JLabel elabel = new JLabel("Weapon");
	JLabel eWeapon = new JLabel("Enemy weapon: None");
	JLabel pWeapon = new JLabel("Player weapon: None");
	JLabel eMove = new JLabel("Enemy move: None");
	JLabel pMove = new JLabel("Player move: None");
	
	JButton AButton = new JButton("Attack");
	JButton BButton = new JButton("Potion");
	JButton CButton = new JButton("Exit");
	JButton DButton = new JButton("Restart");
	
	ItemList list = new ItemList();
	
	Box pBox = Box.createVerticalBox();
	Box lBox = Box.createVerticalBox();
	
	public void Start() {
		
		window.setTitle("MMO");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		
		AButton.setFocusable(false);
		BButton.setFocusable(false);
		CButton.setFocusable(false);
		DButton.setFocusable(false);
		
		window.add(pBox);
		window.add(lBox);
		
		window.add(label);
		
		label.setBounds(0, 0, 200, 30);
		lBox.setBounds(340, 10, 150, 150);
		pBox.setBounds(10, 310, 120, 150);
		
		pBox.add(AButton);
		pBox.add(BButton);
		pBox.add(CButton);
		pBox.add(DButton);
		
		lBox.add(eHealth);
		lBox.add(pHealth);
		lBox.add(eWeapon);
		lBox.add(pWeapon);
		lBox.add(eMove);
		lBox.add(pMove);
		
		eHealth.setForeground(Color.WHITE);
		pHealth.setForeground(Color.WHITE);
		eWeapon.setForeground(Color.WHITE);
		pWeapon.setForeground(Color.WHITE);
		eMove.setForeground(Color.WHITE);
		pMove.setForeground(Color.WHITE);
		label.setForeground(Color.WHITE);
		
		AButton.setActionCommand("1");
		BButton.setActionCommand("2");
		CButton.setActionCommand("3");
		DButton.setActionCommand("11");
		
		AButton.addActionListener(this);
		BButton.addActionListener(this);
		CButton.addActionListener(this);
		DButton.addActionListener(this);
		
	}
	
	public void setPlane(int mode) {
		//mode 1: potion 2: Attack 3: Main
		screen = mode;
		switch (screen) {
		case 1:
			
			AButton.setActionCommand("4");
			BButton.setActionCommand("5");
			CButton.setActionCommand("6");
			DButton.setActionCommand("7");
			
			AButton.setText(ItemList.getName(10));
			BButton.setText(ItemList.getName(11));
			CButton.setText(ItemList.getName(12));
			DButton.setText("Back");
			
			DButton.setVisible(true);
			break;
		case 2:
			
			AButton.setActionCommand("8");
			BButton.setActionCommand("9");
			CButton.setActionCommand("10");
			DButton.setActionCommand("7");
			
			AButton.setText("Slash");
			BButton.setText("Stab");
			CButton.setText("Poke");
			DButton.setText("Back");
			break;
		default: 
			
			AButton.setActionCommand("1");
			BButton.setActionCommand("2");
			CButton.setActionCommand("3");
			DButton.setActionCommand("11");
			
			AButton.setText("Attack");
			BButton.setText("Potion");
			CButton.setText("Exit");
			DButton.setText("Restart");
			
			break;
		
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		int action = Integer.parseInt(e.getActionCommand());

		 switch(action) {
		 
		 case 1:
			 setPlane(2);
			 break;
		 case 2: 
			 setPlane(1);
			 break;
		 case 3:
			 System.exit(0);
			 break;
		 case 4:
			 System.out.println("004");
			 action(4);
			 setPlane(0);
			 break;
		 case 5:
			 action(5);
			 setPlane(0);
			 break;
		 case 6:
			 action(6);
			 setPlane(0);
			 break;
		 case 7:
			 setPlane(0);
			 break;
		 case 8:
			 action(1);
			 setPlane(0);
			 break;
		 case 9:
			 action(2);
			 setPlane(0);
			 break;
		 case 10:
			 action(3);
			 setPlane(0);
			 break;
		 case 11:
			 restart();
			 break;
		 default:
			 System.out.println("Error");
			 break;
		 }
	}
	
	public void action(int pMove) {
	 	if (eng.getPDead()) {
	 		label.setText("Player is Dead");
	 		AButton.setEnabled(false);
	 		BButton.setEnabled(false);
	 	} else {
		 	playerMove(pMove);
	 	}
	 	
	 	if (eng.getZDead()) {
	 		label.setText("Zombie is Dead");
	 		AButton.setEnabled(false);
	 		BButton.setEnabled(false);
	 	} else if (eng.getPDead()) {
	 		AButton.setEnabled(false);
	 		BButton.setEnabled(false);
	 	} else {
		 	eng.zMove();
		 	if (eng.getPDead()) {
		 		AButton.setEnabled(false);
		 		BButton.setEnabled(false);
		 	}
	 	}
	 	update();
	}
	
	public void playerMove(int value) {
		System.out.println("Attack");
		eng.pMove(value);
	}
	
	public void restart() {
		 eng.setPHealth(100);
		 eng.setZHealth(100);
		 AButton.setEnabled(true);
		 BButton.setEnabled(true);
	}
	
	public void update() {
		pHealth.setText("Player Health: " + eng.getPHealth());
		eHealth.setText("Enemy Health: " + eng.getZHealth());
		pWeapon.setText("Player weapon: " + eng.getPWeapon());
		eWeapon.setText("Enemy weapon: " + eng.getZWeapon());
		eMove.setText("Enemy move: " + eng.getZAction());
		pMove.setText("Player move: " + eng.getPAction());
		
	}
	
	
}
