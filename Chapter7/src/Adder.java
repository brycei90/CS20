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
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Adder implements ActionListener{

	 public static JFrame frame = new JFrame("Adder!");
     public static JPanel panel = new JPanel();
     public static JPanel panel2 = new JPanel();
	
	
	public Adder(){
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder a = new Adder();
		
		
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.getContentPane().add(BorderLayout.CENTER, panel2);
        frame.setVisible(true);
		
	}

}
