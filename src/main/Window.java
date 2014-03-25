package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import attackEng.ItemList;
import attackEng.Player;
import attackEng.Zomble;

public class Window implements ActionListener{
	
	int screen = 0;
	
	JFrame window = new JFrame();

	Player player = new Player();
	Zomble zomble = new Zomble(player);
	ItemList items = new ItemList();
	
	JLabel Phealth = new JLabel("Player Health: " + player.getHealth());
	JLabel Ehealth = new JLabel("Enemy Health: " + zomble.getHealth());
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
	
	Box pBox = Box.createVerticalBox();
	Box lBox = Box.createVerticalBox();
	
	public void Start() {
		
		window.setTitle("MMO");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		lBox.add(Ehealth);
		lBox.add(Phealth);
		lBox.add(eWeapon);
		lBox.add(pWeapon);
		lBox.add(eMove);
		lBox.add(pMove);
		
		AButton.setActionCommand("1");
		BButton.setActionCommand("2");
		CButton.setActionCommand("3");
		DButton.setActionCommand("11");
		
		AButton.addActionListener(this);
		BButton.addActionListener(this);
		CButton.addActionListener(this);
		DButton.addActionListener(this);
		
		ItemList.setup(11);
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
			
			AButton.setText("Small Potion");
			BButton.setText("Medium Potion");
			CButton.setText("Large Potion");
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
			 update();
			 break;
		 case 5:
			 action(5);
			 setPlane(0);
			 update();
			 break;
		 case 6:
			 action(6);
			 setPlane(0);
			 update();
			 break;
		 case 7:
			 setPlane(0);
			 break;
		 case 8:
			 action(1);
			 setPlane(0);
			 update();
			 break;
		 case 9:
			 action(2);
			 setPlane(0);
			 update();
			 break;
		 case 10:
			 action(3);
			 setPlane(0);
			 update();
			 break;
		 case 11:
			 player.setHealth(100);
			 zomble.setHealth(100);
			 AButton.setEnabled(true);
			 BButton.setEnabled(true);
			 update();
			 break;
		 default:
			 System.out.println("Error");
			 break;
		 }
	}
	
	private void action(int pMove) {
	 	if (player.getDead()) {
	 		label.setText("Player is Dead");
	 		AButton.setEnabled(false);
	 		BButton.setEnabled(false);
	 	} else {
		 	playerMove(pMove);
	 	}
	 	
	 	if (zomble.getDead()) {
	 		label.setText("Zombie is Dead");
	 		AButton.setEnabled(false);
	 		BButton.setEnabled(false);
	 	} else if (player.getDead()) {
	 		AButton.setEnabled(false);
	 		BButton.setEnabled(false);
	 	} else {
		 	zomble.move();
		 	update();
		 	if (player.getDead()) {
		 		AButton.setEnabled(false);
		 		BButton.setEnabled(false);
		 	}
	 	}
	}
	
	public void playerMove(int value) {
		System.out.println("Attack");
		switch (value) {
			case 1:
				System.out.println("002");
				zomble.slash(player.currentSlot());
				player.setAction(1);
				break;
			case 2:
				zomble.stab(player.currentSlot());
				player.setAction(1);
				break;
			case 3:
				zomble.poke(player.currentSlot());
				player.setAction(1);
				break;
			case 4:
				player.smallPotion();
				player.setAction(2);
				break;
			case 5:
				player.mediumPotion();
				player.setAction(2);
				break;
			case 6:
				player.largePotion();
				player.setAction(2);
				break;
			default:
				label.setText("error 001");	
				break;
		}
	}
	
	public void update() {
		Phealth.setText("Player Health: " + player.getHealth());
		Ehealth.setText("Enemy Health: " + zomble.getHealth());
		eWeapon.setText("Enemy weapon: " + items.getName(zomble.getWeapon()));
		pWeapon.setText("Player weapon: " + items.getName(player.getWeapon()));
		eMove.setText("Enemy move: " + zomble.getAction());
		pMove.setText("Player move: " + player.getAction());
		
	}
	
	
}
