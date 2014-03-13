package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import attackEng.ItemList;
import attackEng.Player;
import attackEng.Zomble;

public class Window implements ActionListener{
	
	int item = 0;
	
	JFrame window = new JFrame();
	

	Player player = new Player();
	Zomble zomble = new Zomble(player);
	ItemList items = new ItemList();
	
	JLayeredPane mainP = new JLayeredPane();
	JLayeredPane attackP = new JLayeredPane();
	JLayeredPane potionP = new JLayeredPane();
	
	JLabel Phealth = new JLabel("Player Health: " + player.getHealth());
	JLabel Ehealth = new JLabel("Enemy Health: " + zomble.getHealth());
	JLabel label = new JLabel("No Error");
	JLabel elabel = new JLabel("Weapon");
	JLabel eWeapon = new JLabel("Enemy weapon: ");
	JLabel pWeapon = new JLabel("Player weapon: ");
	
	JButton AMButton = new JButton("Attack");
	JButton BMButton = new JButton("Potion");
	JButton CMButton = new JButton("Exit");
	JButton DMButton = new JButton("Restart");
	
	JButton APButton = new JButton("Small Potion");
	JButton BPButton = new JButton("Medium Potion");
	JButton CPButton = new JButton("Large Potion");
	JButton DPButton = new JButton("Back");
	
	JButton AAButton = new JButton("Slash");
	JButton BAButton = new JButton("Stab");
	JButton CAButton = new JButton("Poke");
	JButton DAButton = new JButton("Back");
	
	Box Mbox = Box.createVerticalBox();
	Box Abox = Box.createVerticalBox();
	Box Pbox = Box.createVerticalBox();
	
	
	public void Start() {
		window.setTitle("MMO");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//This is giving me so much trouble
		window.add(label);
		window.add(elabel);
		window.add(Ehealth);
		window.add(Phealth);
		window.add(eWeapon);
		window.add(pWeapon);
		
		window.add(Abox);
		window.add(Mbox);
		window.add(Pbox);

		
		elabel.setAlignmentY(110);
		
		Mbox.setBounds(10, 310, 120, 150);
		Pbox.setBounds(10, 310, 120, 150);
		Abox.setBounds(10, 310, 120, 150);
		
		Mbox.add(AMButton);
		Mbox.add(BMButton);
		Mbox.add(CMButton);
		Mbox.add(DMButton);
		
		Pbox.add(APButton);
		Pbox.add(BPButton);
		Pbox.add(CPButton);
		Pbox.add(DPButton);
		
		Abox.add(AAButton);
		Abox.add(BAButton);
		Abox.add(CAButton);
		Abox.add(DAButton);
		
		label.setBounds(0, 0, 200, 30);
		Ehealth.setBounds(350, 0 , 150, 30);
		Phealth.setBounds(350, 30 , 150, 30);
		eWeapon.setBounds(350, 60 , 150, 30);
		pWeapon.setBounds(350, 90 , 150, 30);
		
		AMButton.addActionListener(this);
		BMButton.addActionListener(this);
		CMButton.addActionListener(this);
		DMButton.addActionListener(this);
		
		AAButton.addActionListener(this);
		BAButton.addActionListener(this);
		CAButton.addActionListener(this);
		DAButton.addActionListener(this);
		
		APButton.addActionListener(this);
		BPButton.addActionListener(this);
		CPButton.addActionListener(this);
		DPButton.addActionListener(this);
		
		AMButton.setActionCommand("1");
		BMButton.setActionCommand("2");
		CMButton.setActionCommand("3");
		DMButton.setActionCommand("11");
		
		AAButton.setActionCommand("4");
		BAButton.setActionCommand("5");
		CAButton.setActionCommand("6");
		DAButton.setActionCommand("7");
		
		APButton.setActionCommand("8");
		BPButton.setActionCommand("9");
		CPButton.setActionCommand("10");
		DPButton.setActionCommand("7");
		
		AMButton.setAlignmentY(Component.TOP_ALIGNMENT);
		BMButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		CMButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		DMButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
		APButton.setAlignmentY(Component.TOP_ALIGNMENT);
		BPButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		CPButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		DAButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
		AAButton.setAlignmentY(Component.TOP_ALIGNMENT);
		BAButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		CAButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		DAButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
		/*
		AMButton
		BMButton
		CMButton
		
		APButton
		BPButton
		CPButton
		DAButton
		
		AAButton
		BAButton
		CAButton
		DAButton
		*/
		
		window.setBackground(Color.gray);
		
		AMButton.setFocusable(false);
		BMButton.setFocusable(false);
		CMButton.setFocusable(false);
		CMButton.setFocusable(false);
		
		APButton.setFocusable(false);
		BPButton.setFocusable(false);
		CPButton.setFocusable(false);
		DAButton.setFocusable(false);
		
		AAButton.setFocusable(false);
		BAButton.setFocusable(false);
		CAButton.setFocusable(false);
		DAButton.setFocusable(false);
		
		ItemList.setup(11);
		
		setMainPlane();
		
	}
	
	public void setPotionPlane() {
		Mbox.setVisible(false);
		Abox.setVisible(false);
		Pbox.setVisible(true);
	}
	
	public void setMainPlane() {
		Mbox.setVisible(true);
		Abox.setVisible(false);
		Pbox.setVisible(false);
		
	}
	
	public void setAttackPlane() {
		Mbox.setVisible(false);
		Abox.setVisible(true);
		Pbox.setVisible(false);
	}
	
	public void update() {
		Phealth.setText("Player Health: " + player.getHealth());
		Ehealth.setText("Enemy Health: " + zomble.getHealth());
		eWeapon.setText("Enemy weapon: " + items.getName(player.getWeapon()));
		pWeapon.setText("Player weapon: " + items.getName(player.getWeapon()));
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		int action = Integer.parseInt(e.getActionCommand());

		 switch(action) {
		 
		 case 1:
			 setAttackPlane();
			 break;
		 case 2: 
			 setPotionPlane();
			 break;
		 case 3:
			 System.exit(0);
			 break;
		 case 4:
			 playerMove(1);
			 setMainPlane();
			 update();
			 break;
		 case 5:
			 playerMove(2);
			 setMainPlane();
			 update();
			 break;
		 case 6:
			 playerMove(3);
			 setMainPlane();
			 update();
			 break;
		 case 7:
			 setMainPlane();
			 break;
		 case 8:
			 playerMove(4);
			 setMainPlane();
			 update();
			 break;
		 case 9:
			 playerMove(5);
			 setMainPlane();
			 update();
			 break;
		 case 10:
			 playerMove(6);
			 setMainPlane();
			 update();
			 break;
		 case 11:
			 player.setHealth(100);
			 zomble.setHealth(100);
			 AMButton.setEnabled(true);
			 BMButton.setEnabled(true);
			 update();
			 break;
		 default:
			 System.out.println("Error");
			 break;
		 }
	}
	
	private void playerMove(int value) {
	 	if (player.getDead()) {
	 		label.setText("Player is Dead");
	 		AMButton.setEnabled(false);
	 		BMButton.setEnabled(false);
	 	} else {
 			System.out.println("Player Attack");
 			switch (value) {
 			case 1:
 				zomble.slash(player.currentSlot());
 				break;
 			case 2:
 				zomble.stab(player.currentSlot());
 				break;
 			case 3:
 				zomble.poke(player.currentSlot());
 				break;
 			case 4:
 				player.smallPotion();
 				break;
 			case 5:
 				player.mediumPotion();
 				break;
 			case 6:
 				player.largePotion();
 				break;
 			default:
 				label.setText("error");	
 				break;
 			}
		 	
	 	}
	 	
	 	if (zomble.getDead()) {
	 		label.setText("Zombie is Dead");
	 		AMButton.setEnabled(false);
	 		BMButton.setEnabled(false);
	 	} else if (player.getDead()){
	 		AMButton.setEnabled(false);
	 		BMButton.setEnabled(false);
	 	} else {
		 	zomble.attack();
		 	update();
	 	}
	}
	
}
