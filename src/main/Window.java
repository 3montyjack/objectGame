package main;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Window implements ActionListener{
	
	int item = 0;
	
	JFrame window = new JFrame();
	

	Player player = new Player();
	Zomble zomble = new Zomble(player);
	
	JLayeredPane mainP = new JLayeredPane();
	JLayeredPane attackP = new JLayeredPane();
	JLayeredPane potionP = new JLayeredPane();
	
	JLabel Phealth = new JLabel("Player Health: " + player.getHealth());
	JLabel Ehealth = new JLabel("Enemy Health: " + zomble.getHealth());
	JLabel label = new JLabel("No Error");
	JLabel elabel = new JLabel("Weapon");

	JButton AMButton = new JButton("Attack");
	JButton BMButton = new JButton("Potion");
	JButton CMButton = new JButton("Exit");
	
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
		window.add(mainP);
		window.add(potionP);
		window.add(attackP);
		
		window.add(label);
		window.add(elabel);
		window.add(Ehealth);
		window.add(Phealth);
		
		window.add(Mbox);
		window.add(Pbox);
		window.add(Abox);
		
		elabel.setAlignmentY(110);
		
		Mbox.setBounds(10, 310, 120, 150);
		Pbox.setBounds(10, 310, 120, 150);
		Abox.setBounds(10, 310, 120, 150);
		
		Mbox.add(AMButton);
		Mbox.add(BMButton);
		Mbox.add(CMButton);
		
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
		
		AMButton.addActionListener(this);
		BMButton.addActionListener(this);
		CMButton.addActionListener(this);
		
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
		CMButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
		APButton.setAlignmentY(Component.TOP_ALIGNMENT);
		BPButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		CPButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		DAButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
		AAButton.setAlignmentY(Component.TOP_ALIGNMENT);
		BAButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		CAButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		DAButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
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
		System.out.println("Window");
		Mbox.setVisible(false);
		Abox.setVisible(true);
		Pbox.setVisible(false);
	}
	
	public void update() {
		Phealth.setText("Player Health: " + player.getHealth());
		Ehealth.setText("Enemy Health: " + zomble.getHealth());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		int action = Integer.parseInt(e.getActionCommand());

		 switch(action) {
		 
		 case 1:
			 	System.out.print("ATTACK!!");
			    setAttackPlane();   
		 case 2: 
			    setPotionPlane();
		 case 3:
			    System.exit(0);
		 case 4:
			 	zomble.slash(player.currentSlot());
			 	setMainPlane();
			 	zomble.attack();
			 	update();
		 case 5:
			 	zomble.stab(player.currentSlot());
			 	setMainPlane();
			 	zomble.attack();
			 	update();
		 case 6:
			 	zomble.poke(player.currentSlot());
			 	setMainPlane();
			 	zomble.attack();
			 	update();
		 case 7:
			    setMainPlane();
		 case 8:
			 	player.smallPotion();
			 	setMainPlane();
			 	zomble.attack();
			 	update();
		 case 9:
				player.mediumPotion();
			 	setMainPlane();
			 	zomble.attack();
			 	update();
		 case 10:
			 	player.largePotion();
			 	setMainPlane();
			 	zomble.attack();
			 	update();
		 case 11:
			    System.exit(10);
		 default:
			 	System.out.println("Error");
		         
		 }	
	}
	
}
