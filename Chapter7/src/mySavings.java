/*

Program:.java          Last Date of this Revision: April 12, 2022
 
Purpose: 

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
class gui {
	public static void main(String[] args) {

        //Creating the Frame
        JFrame frame = new JFrame("My Savings!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
       
        //Creating the panel at bottom and adding components


        
       
        JPanel panel = new JPanel(); // the panel is not visible in output
        GridLayout layout = new GridLayout(2,2);
        
        JButton P = new JButton("add a penny");
        JButton N = new JButton("add a nickel");
        JButton D = new JButton("add a dime");
        JButton Q = new JButton("add a quarter");
        
    	panel.setLayout(layout);
 
    	panel.add(P);
    	panel.add(N);
    	panel.add(D);
    	panel.add(Q);

        
    	JPanel panel2 = new JPanel();

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
    	

    	
    	
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.getContentPane().add(BorderLayout.CENTER, panel2);
       // frame.getContentPane().setBackground(color.black);
        frame.setVisible(true);

        
        
    }


	
	
	
}
