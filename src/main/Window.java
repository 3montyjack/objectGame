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
	JLabel eEnergy = new JLabel("Enemy energy: None");
	JLabel pEnergy = new JLabel("Player energy: None");
	
	JButton AButton = new JButton("Attack");
	JButton BButton = new JButton("Potion");
	JButton DButton = new JButton("Item");
	JButton EButton = new JButton("Exit");
	JButton FButton = new JButton("Restart");

	
	private int width = 500;
	private int height = 500;
	
	ItemList list = new ItemList();
	
	Box pBox = Box.createVerticalBox();
	Box lBox = Box.createVerticalBox();
	
	public void Start() {
		
		window.setTitle("MMO");
		window.setBounds(0,5,width, height);
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		
		AButton.setFocusable(false);
		BButton.setFocusable(false);
		EButton.setFocusable(false);
		FButton.setFocusable(false);
		
		window.add(pBox);
		window.add(lBox);
		
		window.add(label);
		
		label.setBounds(0, 0, 200, 30);
		lBox.setBounds(340, 10, 150, 150);
		pBox.setBounds(10, 310, 120, 150);
		
		pBox.add(AButton);
		pBox.add(BButton);
		pBox.add(DButton);
		pBox.add(EButton);
		pBox.add(FButton);
		
		lBox.add(eHealth);
		lBox.add(pHealth);
		lBox.add(eWeapon);
		lBox.add(pWeapon);
		lBox.add(eMove);
		lBox.add(pMove);
		lBox.add(eEnergy);
		lBox.add(pEnergy);
		
		eHealth.setForeground(Color.LIGHT_GRAY);
		pHealth.setForeground(Color.LIGHT_GRAY);
		eWeapon.setForeground(Color.LIGHT_GRAY);
		pWeapon.setForeground(Color.LIGHT_GRAY);
		eMove.setForeground(Color.LIGHT_GRAY);
		pMove.setForeground(Color.LIGHT_GRAY);
		label.setForeground(Color.LIGHT_GRAY);
		pEnergy.setForeground(Color.LIGHT_GRAY);
		eEnergy.setForeground(Color.LIGHT_GRAY);
		
		AButton.setActionCommand("1");
		BButton.setActionCommand("2");
		EButton.setActionCommand("3");
		FButton.setActionCommand("11");
		
		AButton.setBackground(Color.LIGHT_GRAY);
		BButton.setBackground(Color.LIGHT_GRAY);
		DButton.setBackground(Color.LIGHT_GRAY);
		EButton.setBackground(Color.LIGHT_GRAY);
		FButton.setBackground(Color.LIGHT_GRAY);
		
		AButton.addActionListener(this);
		BButton.addActionListener(this);
		DButton.addActionListener(this);
		EButton.addActionListener(this);
		FButton.addActionListener(this);
		
	}
	
	public void setPlane(int mode) {
		//mode 1: potion 2: Attack 3: Main
		screen = mode;
		switch (screen) {
		case 1:
			
			AButton.setActionCommand("4");
			BButton.setActionCommand("5");
			EButton.setActionCommand("6");
			FButton.setActionCommand("7");
			
			AButton.setText(ItemList.getName(10));
			BButton.setText(ItemList.getName(11));
			EButton.setText(ItemList.getName(12));
			FButton.setText("Back");
			
			FButton.setVisible(true);
			
			break;
		case 2:
			
			AButton.setActionCommand("8");
			BButton.setActionCommand("9");
			EButton.setActionCommand("10");
			FButton.setActionCommand("7");
			
			AButton.setText("Slash");
			BButton.setText("Stab");
			EButton.setText("Poke");
			FButton.setText("Back");
			
			break;
		case 3:
			
		default: 
			
			AButton.setActionCommand("1");
			BButton.setActionCommand("2");
			EButton.setActionCommand("3");
			FButton.setActionCommand("11");
			
			AButton.setText("Attack");
			BButton.setText("Potion");
			EButton.setText("Exit");
			FButton.setText("Restart");
			
			
			break;
		
		}
	}
	
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
			 //System.out.println("004");
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
	 		DButton.setEnabled(false);
	 	} else {
		 	playerMove(pMove);
	 	}
	 	
	 	if (eng.getZDead()) {
	 		label.setText("Zombie is Dead");
	 		AButton.setEnabled(false);
	 		BButton.setEnabled(false);
	 		DButton.setEnabled(false);
	 	} else if (eng.getPDead()) {
	 		AButton.setEnabled(false);
	 		BButton.setEnabled(false);
	 		DButton.setEnabled(false);
	 	} else {
		 	eng.zMove();
		 	if (eng.getPDead()) {
		 		AButton.setEnabled(false);
		 		BButton.setEnabled(false);
		 		DButton.setEnabled(false);
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
		 update();
	}
	
	public void update() {
		pHealth.setText("Player Health: " + eng.getPHealth());
		eHealth.setText("Enemy Health: " + eng.getZHealth());
		pWeapon.setText("Player weapon: " + eng.getPWeapon());
		eWeapon.setText("Enemy weapon: " + eng.getZWeapon());
		eMove.setText("Enemy move: " + eng.getZAction());
		pMove.setText("Player move: " + eng.getPAction());
		eEnergy.setText("Enemy energy: " + eng.getZEnergy());
		pEnergy.setText("Player energy: " + eng.getPEnergy());
		
	}
	
	
}
