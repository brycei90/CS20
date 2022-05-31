/*

Program:.java          Last Date of this Revision: May 31, 2022
 
Purpose: tug of war application that who ever clicks faster will win and the winners button will flash.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugOfWar {
	    public static void main(String[] args) throws Exception
	    {
	    	//variables
	    	int PG = 0, PR = 0, PWR = 0, PWG = 0;
	    	boolean STATE = false;
	    	
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
	        
	        //Use your Phidgets 
	        while(true){

	            if(redButton.getState() == true)
	            {
	            	redLED.setState(true);
	                PR += 1;
	            }else {
	                redLED.setState(false);       
	            }
	            if(greenButton.getState() == true)
	            {
	            	greenLED.setState(true);
	                PG += 1;
	            }else {
	                greenLED.setState(false);       
	            }
	            PWR = PR - PG;
	            PWG = PG - PR;
	            
	        	if((redButton.getState() != STATE)||(greenButton.getState() != STATE))
	        	{
	        		STATE = redButton.getState();
	        		STATE = greenButton.getState();
	        		System.out.println("green: " + PWG + " red: " + PWR);
	        	}
	            if(PWR >= 10)//red team clicked faster 
	            {
	            	PWG = 0;
	            	greenLED.setState(false);
	            	for(int i = 0; i < 10; i++)
	            	{
		            	redLED.setState(true);
		                Thread.sleep(100);
		                redLED.setState(false);
		                Thread.sleep(100);
		                
	            	}
	            	break;
	            }
	            else if(PWG >= 10)//green team clicked faster
	            {
	            	PWR = 0;
	            	redLED.setState(false);
	            	for(int i = 0; i < 10; i++)
	            	{
		            	greenLED.setState(true);
		                Thread.sleep(100);
		                greenLED.setState(false);
		                Thread.sleep(100);
		                
	            	}
	            	break;

	            }
	        	
	            Thread.sleep(120);	        		
	        }
	    }
}
