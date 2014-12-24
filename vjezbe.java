import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ZadatakPrvi {
	public static JButton dugme; 
	public static JButton dugme2;
	
	public static void main(String[] args) {
		JFrame gui = new JFrame();
		JPanel pan = new JPanel();
		Dimension dim = new Dimension(600, 600);
		
	    dugme = new JButton("Dugme");
		final JButton dugme2 = new JButton("Dugme2");
		pan.add(dugme);
		pan.add(dugme2);
		gui.add(pan);
		
		dugme.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dugme.setText("Kliknuto");
				dugme2.setText("Dugme dva");
				
			}
		});
		
		dugme2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dugme2.setText("Kliknuto");
				dugme.setText("Dugme dva");
				
			}
		});
		
		gui.setSize(300, 300);
		gui.setMaximumSize(dim);
		gui.setTitle("Kliknuto");
		
		gui.setVisible(true);
		gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);

	}
	
		
	}

