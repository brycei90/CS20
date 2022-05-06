import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*

Program:.java          Last Date of this Revision: May 6, 2022
 
Purpose: counts the frequency of dice roll outcomes. a roll is simulated by generating two random numbers between 1 and 6. the outcome of each roll is then used to increment the counter 
in the element at the index corresponding to the outcome. Now modify the program so it rolls 3 dices.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class diceRolls implements ActionListener{
	//creating components
	public static JFrame frame = new JFrame("Dice Rolls!");
    public static JPanel panel = new JPanel();
    public static JPanel panel2 = new JPanel();
	
    JTextField input = new JTextField(10);
    
    JLabel rolls = new JLabel("Input number of rolls");
    JButton sub = new JButton("Submit.");
    JTextField output = new JTextField(" ");
    
    //declaring variables
	int numRolls = 0, di1, di2, di3, outcome, roll, i;
	int[] outcomes = new int[19];
   
	
	public diceRolls()//constructor
	{
		//layouts that I am using
		GridLayout layout = new GridLayout(10,10);
		GridLayout layout2 = new GridLayout(2,2);
		panel.setLayout(layout);
		panel2.setLayout(layout2);
		
		//adding components to the panel
		panel.add(rolls);
		panel.add(input);
		panel.add(sub);
		panel2.add(output);
		
		//actionListener(s)
		sub.addActionListener(this);
		
		
		
	
	}
			public void actionPerformed(ActionEvent e) 
			{
				
				//understanding the code: the index (i) is what is rolled for ex. 15, and the outcomes, is how many times that 15 is rolled.
				if(e.getSource() == sub) {//action listener is working + the button works
					numRolls = Integer.parseInt(input.getText());//user input gets converted to int
					
					for(roll = 0; roll < numRolls; roll++)
					{   //random number generator acting as a dice roll
						outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
						outcomes[outcome] += 1;
						
					}
					for(i = 3; i <= 18; i++)
					{ //displays information to user.
						output.setText(output.getText() + i + ": " + outcomes[i] + ", ");
						//the i is the index of the element and outcomes[i] is the number associated with the index
					}
					
				}
	
			}
	
	
	public static void main(String[] args) 
	{
		diceRolls dR = new diceRolls();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 200);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.add(panel2);
        frame.setVisible(true);
	}

}
