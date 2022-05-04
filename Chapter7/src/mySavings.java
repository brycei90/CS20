/*

Program:.java          Last Date of this Revision: April 12, 2022
 
Purpose: create a my savings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggay bank and then prompts the user to make a selection.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class gui implements ActionListener{

        //Creating the panel and adding components

	 public static JFrame frame = new JFrame("My Savings!");
     public static JPanel panel = new JPanel();
     public static JPanel panel2 = new JPanel(); 

     JButton P = new JButton("add a penny");
     JButton N = new JButton("add a nickel");
     JButton D = new JButton("add a dime");
     JButton Q = new JButton("add a quarter");
     JButton sub = new JButton("Submit");

  
     
     JLabel label = new JLabel("Enter amount you want to take out: ");
     JTextField tf = new JTextField(15);

 
     private double totalM = 0, removalA = 0;
     
 	 JLabel screen = new JLabel("Your total is: " + totalM);
     
     public gui()  {
        
        GridLayout layout = new GridLayout(2,2);
        
        P.addActionListener(this);
        N.addActionListener(this);
        D.addActionListener(this);
        Q.addActionListener(this);
        sub.addActionListener(this);

    	panel.setLayout(layout);
 
    	panel.add(P);
    	panel.add(N);
    	panel.add(D);
    	panel.add(Q);
        
        
    	panel2.add(label);
    	panel2.add(tf);
    	panel2.add(sub);
    	panel2.add(screen);

    	
    
    	
 

       }
  
    	@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

    		if(e.getSource() == P) {
    			
    		
    			totalM += 0.01;
    			
    		
    			
    		}
    		else if(e.getSource() == N) {
    			
    		
    			totalM += 0.05;
    			
    	
    			
    		}
    		else if(e.getSource() == D) {
    			
    			
    			totalM += 0.10;
    			
    			
    			
    		}
    		else if(e.getSource() == Q) {
    			
    		
    			totalM += 0.25;
    			
    			
    			
    		}
    		if(e.getSource() == sub) {
    			
    			removalA = Double.parseDouble(tf.getText());
    			
    			totalM -= removalA;
    			

    		}

    		//make it so they can see how many individual coins have been inputted.

			screen.setText("your total is: " + totalM);

		}
    	
     	public static void main(String[] args){

            //Creating the Frame
          
     		gui g = new gui();
     		
     		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 400);
            frame.getContentPane().add(BorderLayout.EAST, panel);
            frame.getContentPane().add(BorderLayout.CENTER, panel2);
            frame.setVisible(true);
            
            
            
    	}


       
        
    }


	
	
	


