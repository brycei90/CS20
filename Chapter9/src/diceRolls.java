import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*

Program:.java          Last Date of this Revision: April 28, 2022
 
Purpose: counts the frequency of dice roll outcomes. a roll is simulated by generating two random numbers between 1 and 6. the outcome of each roll is then used to increment the counter 
in the element at the index corresponding to the outcome. Now modify the program so it rolls 3 dices.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class diceRolls implements ActionListener{

	public static JFrame frame = new JFrame("Dice Rolls!");
    public static JPanel panel = new JPanel();
    public static JPanel panel2 = new JPanel();
	
    JTextField input = new JTextField(10);
    JLabel rolls = new JLabel("Input number of rolls");
    JButton sub = new JButton("Submit.");
    JLabel output = new JLabel(" ");
    
	int numRolls, outcome;
	int[] outcomes = new int[13];
    
	public diceRolls()
	{
		
		GridLayout layout = new GridLayout(3,2);
		panel.setLayout(layout);
		panel.add(rolls);
		panel.add(input);
		panel.add(sub);
		panel.add(output);
		
		sub.addActionListener(this);
		
		
		
	}
	
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource() == sub) {
					
					numRolls = Integer.parseInt(rolls.getText());
					
					for(int roll = 0; roll < numRolls; roll++)
					{
						outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
						outcomes[outcome] += 1;
								
					}
					for(int i = 2; i <= 12; i++)
					{
						System.out.println(outcomes[i]);
						output.setText(output.getText() + "\n" + i + ": " + outcomes[i]);
					}
					
				}
	
			}
	
	
	public static void main(String[] args) 
	{
		diceRolls dR = new diceRolls();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.getContentPane().add(BorderLayout.WEST, panel2);
        frame.setVisible(true);
	}

}
