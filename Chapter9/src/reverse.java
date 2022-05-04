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
 
Purpose: application that stores the number corresponding to the elements index in an integer array of 10 elements. for example, the second element, which as index 1 should store 1.
the application should then display the title count down and then list numbers stored in the array in reverse order.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class reverse implements ActionListener{

	//creating frame and components
	public static JFrame frame = new JFrame("reverse.");
    public static JPanel panel = new JPanel();
    public static JPanel panel2 = new JPanel();
	
    JButton sub = new JButton("Submit");
    JTextField TF = new JTextField(5);
	JLabel title = new JLabel("Input a number greater than 10: ");
    JLabel list1 = new JLabel(" ");
    JTextField list2 = new JTextField(" ");
	
    //declaring variables
    int x, num, i, numbers, numb;
    
	public reverse(){
		
		//adding action listener(s)
		sub.addActionListener(this);
		
    	//the layout that I am using
		GridLayout layout = new GridLayout(3,2);
		panel.setLayout(layout);
		panel2.setLayout(layout);
		panel.add(title);
		panel.add(TF);
		panel.add(sub);
		panel2.add(list1);
		panel2.add(list2);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == sub)
		{	
				
			
			num = Integer.parseInt(TF.getText());
			
			x = num - 10;
			
			int[] numbers = new int[num];
			
			
			
			for(i = 0; i < num; i++) 
			{
				numbers[i] = i;	
			}
			
			//displays count down
			list1.setText("CountDown: ");
			
			for(i = num - 1; i >= x; i--)
			{	
				list2.setText(list2.getText() + "\n" + numbers[i]);	
			}
			
		}
	
	}
	
	
	public static void main(String[] args) {
		
		reverse r = new reverse();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.getContentPane().add(BorderLayout.WEST, panel2);
        frame.setVisible(true);
		
	}

}
