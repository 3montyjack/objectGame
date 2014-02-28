package main;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Window {
	
	ActionClass actionEvent = new ActionClass();
	
	static JFrame window = new JFrame();
	
	static JLayeredPane mainP = new JLayeredPane();
	static JLayeredPane attackP = new JLayeredPane();
	static JLayeredPane potionP = new JLayeredPane();
	
	static JLabel Phealth = new JLabel("Player Health: " + Player.getHealth());
	static JLabel Ehealth = new JLabel("Enemy Health: " + Zomble.getHealth());
	static JLabel label = new JLabel("Nothing");

	static JButton AMButton = new JButton("Attack");
	static JButton BMButton = new JButton("Potion");
	static JButton CMButton = new JButton("Exit");
	
	static JButton APButton = new JButton("Small Potion");
	static JButton BPButton = new JButton("Medium Potion");
	static JButton CPButton = new JButton("Large Potion");
	static JButton DPButton = new JButton("Back");
	
	static JButton AAButton = new JButton("Slash");
	static JButton BAButton = new JButton("Stab");
	static JButton CAButton = new JButton("Poke");
	static JButton DAButton = new JButton("Back");
	
	static Box Mbox = Box.createVerticalBox();
	static Box Abox = Box.createVerticalBox();
	static Box Pbox = Box.createVerticalBox();
	
	
	public Window() {
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
		window.add(Ehealth);
		window.add(Phealth);
		
		mainP.add(Mbox);
		potionP.add(Pbox);
		attackP.add(Abox);
		
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
		
		AMButton.addActionListener(actionEvent);
		BMButton.addActionListener(actionEvent);
		CMButton.addActionListener(actionEvent);
		
		AAButton.addActionListener(actionEvent);
		BAButton.addActionListener(actionEvent);
		CAButton.addActionListener(actionEvent);
		DAButton.addActionListener(actionEvent);
		
		APButton.addActionListener(actionEvent);
		BPButton.addActionListener(actionEvent);
		CPButton.addActionListener(actionEvent);
		DPButton.addActionListener(actionEvent);
		
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
	
	public static void setPotionPlane() {
		//setBounds(1);
		mainP.setVisible(false);
		attackP.setVisible(false);
		potionP.setVisible(true);
	}
	
	public static void setMainPlane() {
		//setBounds(0);
		mainP.setVisible(true);
		attackP.setVisible(false);
		potionP.setVisible(false);
		
	}
	
	public static void setAttackPlane() {
		//setBounds(2);
		mainP.setVisible(false);
		attackP.setVisible(true);
		potionP.setVisible(false);
	}
}

class ActionClass implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		int action = Integer.parseInt(e.getActionCommand());

		 switch(action) {
		 
		 case 1:
			    Window.setAttackPlane();   
			    Window.label.setText("Nothing");
			    break;
		 case 2: 
			    Window.setPotionPlane();
			    Window.label.setText("Nothing");
			    break;
		 case 3:
			    System.exit(0);
			    break;
		 case 4:
			    //TODO Program Attacks
				Window.label.setText("Not Programmed Yet");
				break;
		 case 5:
			    //TODO Program Attacks
			 	Window.label.setText("Not Programmed Yet");
			 	break;
		 case 6:
			    //TODO Program Attacks
			 	Window.label.setText("Not Programmed Yet");
			 	break;
		 case 7:
			    Window.setMainPlane();
			    break;
		 case 8:
			    //TODO Program Potions
			 	Window.label.setText("Not Programmed Yet");
			 	break;
		 case 9:
			    //TODO Program Potions
			 	Window.label.setText("Not Programmed Yet");
			 	break;
		 case 10:
			   	//TODO Program Potions
			 	Window.label.setText("Not Programmed Yet");
			 	break;
		 case 11:
			    System.exit(10);
			    break;
		 default:
			 	System.out.println("Error");
			 	break;
		         
		 }
		
	}
	
	

}
