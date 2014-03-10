package main;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                	//New_Window window= new New_Window();
                    Window main=new Window();
                    main.Start();
                    //window.Start();
                }
        });
    }

	
}
