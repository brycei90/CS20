import com.phidget22.*;
/*

Program:.java          Last Date of this Revision: May 31, 2022
 
Purpose: reads the button state

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class readButton {

	static boolean STATE = false;
	
	public static void main(String[] args) throws Exception
	{
		 //Create 
        DigitalInput redButton = new DigitalInput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);

        //Use your Phidgets 
        while(true){
        	
        	if(redButton.getState() != STATE)
        	{
        		System.out.println("Button State: " + redButton.getState());
        		STATE = redButton.getState();
        	}
        	
            
            Thread.sleep(150);
        }
        
	}
}