/*

Program:.java          Last Date of this Revision: April 12, 2022
 
Purpose: 

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
	static JFrame frame = new JFrame("My Savings!");
	 JButton P = new JButton("add a penny");
     JButton N = new JButton("add a nickel");
     JButton D = new JButton("add a dime");
     JButton Q = new JButton("add a quarter");
     static JPanel panel = new JPanel();
     static JPanel panel2 = new JPanel();
       
     public gui()  {
        
        GridLayout layout = new GridLayout(2,2);
        
        P.addActionListener(this);
        N.addActionListener(this);
        D.addActionListener(this);
        Q.addActionListener(this);
        
    	panel.setLayout(layout);
 
    	panel.add(P);
    	panel.add(N);
    	panel.add(D);
    	panel.add(Q);
        
        
    	

    	GridLayout layout2 = new GridLayout(20, 20);
    	
        JLabel label = new JLabel("Enter amount you want to take out: ");
        JTextField tf = new JTextField(15);
    	JLabel screen = new JLabel("asdf ");
    	JLabel total = new JLabel("TOTTALLLLLL");
       
    	panel2.setLayout(layout2);
    	panel2.add(label);
    	panel2.add(tf);
    	
    	//int removalA = Integer.parseInt(tf.getText());
    	
    	// make it so they can not remove over the amount inputed

       }
       
    	@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
    		if(e.getSource() == P) {
    			
    			System.out.println("BOOM BITCH");
    			
    		}
    		else if(e.getSource() == N) {
    			
    			
    			
    		}
    		else if(e.getSource() == D) {
    			
    			
    			
    		}
    		else if(e.getSource() == Q) {
    			
    			
    			
    		}
    		
			
			
		}

    	public static void main(String[] args){

            //Creating the Frame
    		
    		
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 400);
            frame.getContentPane().add(BorderLayout.EAST, panel);
            frame.getContentPane().add(BorderLayout.CENTER, panel2);
            frame.setVisible(true);

            
            
            
    	}

       
        
    }


	
	
	


