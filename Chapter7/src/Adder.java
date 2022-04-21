/*

Program:.java          Last Date of this Revision: April 12, 2022
 
Purpose: the adder game prompts a player for the answer to an addition problem. The adder game creates a problem from two randomly selected integers between 0-20. Adder allows
the player three tries to enter a correct answer. If the correct answer is entered on the first try, the player is award 5 points. if the correct answer is entered on the second try
3 points are awarded. the correct answer on the third try earns 1 point. if after three tires the correct answer is still not entered the player receives no points and the correct answer is displayed. 
the game continues until 999 is entered as an answer. at the end of the game, adder displays the players score.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Adder implements ActionListener{

	 public static JFrame frame = new JFrame("Adder!");
     public static JPanel panel = new JPanel();
     public static JPanel panel2 = new JPanel();
     public static JPanel panel3 = new JPanel();
	
	 JLabel questions = new JLabel(" ");
	 JButton sub = new JButton("submit.");
	 JTextField res = new JTextField(5);
     JLabel rW = new JLabel(" ");
	 
	 int resp, num1, num2;
	 
	public Adder(){
		
		//GridLayout layout = new GridLayout(5,1);

		//panel.setLayout(layout);
		
		panel.add(res);
		panel.add(sub);
		panel2.add(questions);
		panel3.add(rW);
		
		num1 = (int )(Math.random() * 20 + 1);
		num2 = (int )(Math.random() * 20 + 1);
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == sub) {
			
			resp = Integer.parseInt(res.getText());
			
			if((num1 + num2) == resp) {
				
				rW.setText("correct!");
				
			}else if((num1 + num2) != resp){
				
				rW.setText("Wrong answer! " + answer);
				
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder a = new Adder();
		
		
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.getContentPane().add(BorderLayout.WEST, panel2);
        frame.getContentPane().add(BorderLayout.CENTER, panel3);
        frame.setVisible(true);
		
	}

}
