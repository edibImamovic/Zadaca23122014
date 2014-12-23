import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ExFirst {

	public static void main(String[] args) {
		ButtonHandler handler = new ButtonHandler();
		ButtonHandlerSecond handlerSecond = new ButtonHandlerSecond();
		
		JFrame gui = new JFrame(); /
		JPanel pan = new JPanel();
		
		JButton btn1 = new JButton("YES"); // Dugme prvo
		JButton btn2 = new JButton("NO"); // Dugme drugo
		

		btn1.addActionListener(handler);
		btn2.addActionListener(handlerSecond);
		
		gui.add(pan); 
		gui.setSize(400, 100);//Velicina prozora
		gui.setTitle("Age Verification Box"); //title
		JLabel lbl = new JLabel();
		lbl.setText("                      Are you over 18 years old?" ); //ne znam kako da centriram pa sam klikao space :)
		
		pan.add(btn1); //dugme
		pan.add(btn2); //drugo dugme
		
		/**
		 * lokacija dugmica i teksta
		 */
		
		pan.setLayout(new BorderLayout());
		pan.add(btn1, BorderLayout.WEST);
		pan.add(btn2, BorderLayout.EAST);
		pan.add(lbl, BorderLayout.CENTER);
		
		gui.setVisible(true); //da je false , nista se nebi vidjelo
		gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE); //da nebi bilo 20 pokrenutih java programa nakon iksiranja

	}
	
	
	/**
	 * Handler za prvo dugme.
	 * @author
	 *
	 */
	private static class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "You are allowed to enter");
			
		}
		
	}
	/**
	 * Handler za drugo dugme
	 * @author
	 *
	 */
	private static class ButtonHandlerSecond implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "You may not be allowed to enter");
			
		}
		
	}

}
