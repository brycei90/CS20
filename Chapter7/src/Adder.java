/*

Program:.java          Last Date of this Revision: April 12, 2022
 
Purpose: the adder game prompts a player for the answer to an addition problem. The adder game creates a problem from two randomly selected integers between 0-20. Adder allows
the player three tries to enter a correct answer. If the correct answer is entered on the first try, the player is award 5 points. if the correct answer is entered on the second try
3 points are awarded. the correct answer on the third try earns 1 point. if after three tries the correct answer is still not entered the player receives no points and the correct answer is displayed. 
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
	
     //variables
     int resp, num1, num2, answer, WR = 0, point = 0;
     
     //components
	 JLabel questions = new JLabel(" ");
	 JButton sub = new JButton("submit.");
	 JTextField res = new JTextField(5);
     JLabel rW = new JLabel(" ");
	 JButton start = new JButton("Start?");
	 JLabel points = new JLabel("You have: " + point + " points!");
	 
	 
	 
	 
	public Adder(){//constructor
		
		//actionListeners
		sub.addActionListener(this);
		start.addActionListener(this);
		
		
		GridLayout layout = new GridLayout(2,2);

		panel.setLayout(layout);
		
		panel2.setLayout(layout);
	
		//adding components
		panel.add(res);
		panel.add(sub);
		panel2.add(start);
		panel2.add(questions);
		panel3.add(rW);
		panel3.add(points);
		
		//num generators
		num1 = (int )(Math.random() * 20 + 1);
		num2 = (int )(Math.random() * 20 + 1);
		
		answer = num1 + num2;
		

		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == start) {
			
			questions.setText("What is the answer to: " + num1 + " + " + num2);
		
	
		}else if((num1 + num2) == resp) {//first try
				
			resp = Integer.parseInt(res.getText());
			
				rW.setText("correct!");
				
				questions.setText(num1 + " + " + num2);
				
				
			
				if(WR == 0) {
					
					point = 5;
					
				}
					
	
		}else if(((num1 + num2) == resp)&&(WR == -1)) {//second try
					
					rW.setText("correct!");
					
					questions.setText(num1 + " + " + num2);
					
					point = 3;
					
		}else if(((num1 + num2) == resp)&&(WR == -2)) {//third try
				
				rW.setText("correct!");
				
				questions.setText(num1 + " + " + num2);
				
				point = 1;
					
			
				
		}else if((e.getSource() == sub&&(num1 + num2) != resp)){
			
			rW.setText("Wrong answer! " + answer);

			WR += -1;//each time they answer wrong, WR is to track that

			System.out.println(WR);
			
		}else if(WR == -3){
			
				rW.setText("You tried three times! 0 points awarded!");
			
				WR = 0;
				
				point += 0;
				
		}else if(resp == 999) {
				
				//outputs score
				
		}
			
			
		}
		
		
	
	
	public static void main(String[] args) {
		

		Adder a = new Adder();
		
        frame.setSize(400, 400);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.getContentPane().add(BorderLayout.WEST, panel2);
        frame.getContentPane().add(BorderLayout.CENTER, panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		
	}

}
