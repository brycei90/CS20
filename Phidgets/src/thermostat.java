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

import java.util.Scanner;

import com.phidget22.*;
import com.phidget22.*;

public class thermostat {

	public static void main(String[] args) throws Exception
	{
	
		//variables
        int setTemp = 21, temp;
        double realTemp;
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
        	realTemp = temperatureSensor.getTemperature();
        	
        	
        	if(greenButton.getState() == true)
        	{
        		setTemp += 1;
        		System.out.println("Set temp: " + setTemp + " real temp: " + realTemp);
        	}else if(redButton.getState() == true)
        	{
        		setTemp -= 1;
        		System.out.println("Set temp: " + setTemp + " real temp: " + realTemp);
        	}
        	
        	temp = (int)realTemp;
        	if((setTemp == temp + 2)||(setTemp == temp + 1)||(setTemp == temp))
        	{
        		greenLED.setState(true);
        		redLED.setState(false);
        	}else if((setTemp == temp - 2)||(setTemp == temp - 1))
        	{
        		greenLED.setState(true);
        		redLED.setState(false);
        	}else
        	{
        		redLED.setState(true);
        		greenLED.setState(false);
        	}
        	Thread.sleep(130);
            }

        
		}
		
	}

