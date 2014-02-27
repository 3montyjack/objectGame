package main;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Window implements ActionListener {
	
	
	
	static JFrame window = new JFrame();
	
	static JLayeredPane main = new JLayeredPane();
	static JLayeredPane attack = new JLayeredPane();
	static JLayeredPane potion = new JLayeredPane();
	
	static JLabel health = new JLabel("Health: " + Player.getHealth());
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
	
	
	
	public Window() {
		window.setTitle("MMO");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.add(label);
		window.add(health);
		
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
		
		label.setBounds(0, 0, 200, 30);
		health.setBounds(400, 0 , 100, 30);
		
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
		DPButton.setActionCommand("11");
		
		setBounds(0);
		
	}
	
	public void setPotionPlane() {
		setBounds(1);
	}
	
	public void setMainPlane() {
		setBounds(0);
	}
	
	public void setAttackPlane() {
		setBounds(2);
	}
	
	//Had trouble with the buttons becoming full page because other buttons had the same position as eachother, this is my solution
	//Is it better to just change the name and do some checks to see what page it is on?
	
	public void setBounds(int which)
	{
		int x = 10;
		
		if (which == 1) 
		{
			AMButton.setBounds(10, 350*x, 100, 30);
			BMButton.setBounds(10, 390*x, 100, 30);
			CMButton.setBounds(10, 430*x, 100, 30);
			
			APButton.setBounds(10, 310, 100, 30);
			BPButton.setBounds(10, 350, 100, 30);
			CPButton.setBounds(10, 390, 100, 30);
			DPButton.setBounds(10, 430, 100, 30);
			
			AAButton.setBounds(10, 310*x*x, 100, 30);
			BAButton.setBounds(10, 350*x*x, 100, 30);
			CAButton.setBounds(10, 390*x*x, 100, 30);
			DAButton.setBounds(10, 430*x*x, 100, 30);
		} 
		else if (which == 2)
		{
			AMButton.setBounds(10, 350*x, 100, 30);
			BMButton.setBounds(10, 390*x, 100, 30);
			CMButton.setBounds(10, 430*x, 100, 30);
			
			APButton.setBounds(10, 310*x*x, 100, 30);
			BPButton.setBounds(10, 350*x*x, 100, 30);
			CPButton.setBounds(10, 390*x*x, 100, 30);
			DPButton.setBounds(10, 430*x*x, 100, 30);
			
			AAButton.setBounds(10, 310, 100, 30);
			BAButton.setBounds(10, 350, 100, 30);
			CAButton.setBounds(10, 390, 100, 30);
			DAButton.setBounds(10, 430, 100, 30);
		} 
		else 
		{
			AMButton.setBounds(10, 350, 100, 30);
			BMButton.setBounds(10, 390, 100, 30);
			CMButton.setBounds(10, 430, 100, 30);
			
			APButton.setBounds(10, 310*x, 100, 30);
			BPButton.setBounds(10, 350*x, 100, 30);
			CPButton.setBounds(10, 390*x, 100, 30);
			DPButton.setBounds(10, 430*x, 100, 30);
			
			AAButton.setBounds(10, 310*x*x, 100, 30);
			BAButton.setBounds(10, 350*x*x, 100, 30);
			CAButton.setBounds(10, 390*x*x, 100, 30);
			DAButton.setBounds(10, 430*x*x, 100, 30);
		}

		
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		int action = Integer.getInteger(e.getActionCommand());

		 switch(action) {
		 case 1:
			    setBounds(2);
			    label.setText("Nothing");
		 case 2: 
			    setBounds(1);
			    label.setText("Nothing");
		 case 3:
			    System.exit(0);
		 case 4:
			    //TODO Program Attacks
				  label.setText("Not Programmed Yet");
		 case 5:
			    //TODO Program Attacks
				  label.setText("Not Programmed Yet");
		 case 6:
			    //TODO Program Attacks
				  label.setText("Not Programmed Yet");
		 case 7:
			    setBounds(0);
		 case 8:
			    //TODO Program Potions
				  label.setText("Not Programmed Yet");
		 case 9:
			    //TODO Program Potions
				  label.setText("Not Programmed Yet");
		 case 10:
			    //TODO Program Potions
				  label.setText("Not Programmed Yet");
		 case 11:
			    setBounds(0);
		         
		 }
		
	}
	
	

}
