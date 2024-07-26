package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	Random r = new Random();
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener(e -> { 
			String num1 = JOptionPane.showInputDialog("enter a number");
			String num2 = JOptionPane.showInputDialog("enter a number");
			
			int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
			
			JOptionPane.showMessageDialog(null, "the sum of those two numbers is " + sum);
			
		} );
		
		randNumber.addActionListener(e -> { 
			
			JOptionPane.showMessageDialog(null, r.nextInt());
			
		} );
		
		tellAJoke.addActionListener(e -> { 
			
			JOptionPane.showMessageDialog(null, "What did one wall say to the other wall?");
			JOptionPane.showMessageDialog(null, "Let's meet in the corner :)");

			
		} );
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
