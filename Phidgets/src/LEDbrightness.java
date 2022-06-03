import com.phidget22.*;
/*

Program:.java          Last Date of this Revision: May 31, 2022
 
Purpose: controls LED brightness

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class LEDbrightness {

	public static void main(String[] args) throws Exception{

	    

	        //Create 
	        DigitalOutput redLED = new DigitalOutput();

	        //Address 
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);

	        //Open 
	        redLED.open(1000);

	        //Use your Phidgets with Duty Cycle 
	        redLED.setDutyCycle(0.1);
	        Thread.sleep(1000);
	        redLED.setDutyCycle(0.0);
	    

	}

}
