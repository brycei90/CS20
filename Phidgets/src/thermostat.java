/*

Program:.java          Last Date of this Revision: May 31, 2022
 
Purpose: reads the temperature of the room, and there is a set temperature. The user clicks the green button it adds 1 to the set temperature
the red button decreases the set temperature by 1. if the set temperature is within 2 of the room temperature then the green led is lit
if the set temperature is not within 2 then the red led is lit.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;
import com.phidget22.*;
import com.phidget22.*;

public class thermostat {

	public static void main(String[] args) throws Exception
	{
	
		//variables
    	int i, T, temp = 21;
    	double TI;
    	boolean STATE = false;
    	

    	
    	//create
    	TemperatureSensor temperatureSensor = new TemperatureSensor();
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
        temperatureSensor.open(1000);
        
        //Use your Phidgets 
        while(true){
        	TI = temperatureSensor.getTemperature();
        	T = (int)TI;
        	
        	if(redButton.getState() == true)
        	{
        		temp -= 1;
        		STATE = redButton.getState();
        		System.out.println("set temperature is: " + temp);
            	System.out.println("current temperature is: " + temperatureSensor.getTemperature());
        	}
        	if(greenButton.getState() == true)
        	{
        		temp += 1;
        		STATE = greenButton.getState();	
        		System.out.println("set temperature is: " + temp);
            	System.out.println("current temperature is: " + temperatureSensor.getTemperature());
        	}
        	if((temp == T + 2)||(temp == T + 1)||(temp == T))
        	{
        		greenLED.setState(true);
        		redLED.setState(false);
        	}
        	else if((temp == T - 2)||(temp == T - 1))
        	{
        		greenLED.setState(true);
        		redLED.setState(false);
        	}
        	else 
        	{
        		greenLED.setState(false);
        		redLED.setState(true);
        	}
        	Thread.sleep(130);
            }
        
        
		}
		
	}

