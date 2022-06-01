import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

/*

Program:.java          Last Date of this Revision: May 31, 2022
 
Purpose: clicking the button gives you money and you can buy upgrades so your
click gives you more money!

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class MoneyGame implements ActionListener{

	static int money = 0, click = 1, cost = 10;
	static String shop;
	boolean STATE = false;
	
	public static JFrame frame = new JFrame("reverse.");
    public static JPanel panel = new JPanel();
    JLabel titleIO = new JLabel("costs: " + cost);
    JButton increaseOne = new JButton("increase click by 1");
    
    
	public MoneyGame()
	{
		increaseOne.addActionListener(this);
		
		panel.add(titleIO);
		panel.add(increaseOne);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == increaseOne)
		{
			cost += 10;
			click += 1;
			money -= cost;
			titleIO.setText("costs: " + cost);
		}
	}
	public static void main(String[] args) throws Exception
	{
		
		//variables
    	
    	

    	
    	//create
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
    	
        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        Scanner S = new Scanner(System.in);
        
        System.out.println("click the buttons to earn money! input 'S' and enter to open the shop!");
        
        shop = S.next();
        
        if(shop.equals("S"))
        {
        	MoneyGame MG = new MoneyGame();
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 200);
            frame.getContentPane().add(BorderLayout.EAST, panel);
            frame.setVisible(true);
        }
        //Use your Phidgets 
        while(true){

        	if(redButton.getState() == true)
        	{
        		money += click;
        	}
        	if(greenButton.getState() == true)
        	{
        		money += click;
        		System.out.println(" " +  money);
        	}
        	Thread.sleep(130);
            }
		
		

	}



}
