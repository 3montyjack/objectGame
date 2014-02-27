package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Window {
	
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
		
		setBounds(0);
		
		AMButtonS();
		BMButtonS();
		CMButtonS();
		
		AAButtonS();
		BAButtonS();
		CAButtonS();
		DAButtonS();
		
		APButtonS();
		BPButtonS();
		CPButtonS();
		DPButtonS();
		
	}
	

	public void AMButtonS() {
		AMButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    setBounds(2);
			    label.setText("Nothing");
			  } 
			} );
	}
	
	public void BMButtonS() {
		BMButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    setBounds(1);
			    label.setText("Nothing");
			  } 
			} );
	}
	
	public void CMButtonS() {
		CMButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    System.exit(0);
			  } 
			} );
	}
	
	public void AAButtonS() {
		AAButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    //TODO Program Attacks
				  label.setText("Not Programmed Yet");
			  } 
			} );
	}
	
	public void BAButtonS() {
		BAButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    //TODO Program Attacks
				  label.setText("Not Programmed Yet");
			  } 
			} );
	}
	
	public void CAButtonS() {
		CAButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    //TODO Program Attacks
				  label.setText("Not Programmed Yet");
			  } 
			} );
	}
	
	public void DAButtonS() {
		DAButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    setBounds(0);
			  } 
			} );
	}
	
	public void APButtonS() {
		APButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    //TODO Potion effects
				  label.setText("Not Programmed Yet");
			  } 
			} );
	}
	
	public void BPButtonS() {
		BPButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    //TODO Potion effects
				  label.setText("Not Programmed Yet");
			  } 
			} );
	}
	
	public void CPButtonS() {
		CPButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    //TODO Potion effects
				  label.setText("Not Programmed Yet");
			  } 
			} );
	}
	
	public void DPButtonS() {
		DPButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    setBounds(0);
			  } 
			} );
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
	
	

}
