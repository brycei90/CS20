/*

Program:.java          Last Date of this Revision: May 31, 2022
 
Purpose: reads the temperature of the room, and if the temperature is within 24 and 20 then the green led will be lit

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class HotOrCold {

	public static void main(String[] args) throws Exception
	{
		double T = 0;
		//Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //address
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open 
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);
        //F = (temperatureSensor.getTemperature() * 1.8) + 32;
        
        //Use your Phidgets 
        
        while (true) {
        	T = temperatureSensor.getTemperature();

        	if((T > 20)&&(T < 24))
        	{
        		greenLED.setState(true);
        		redLED.setState(false);
        	}
        	else if((T > 24)||(T < 20))
        	{
        		redLED.setState(true);
        		greenLED.setState(false);
        	}
            System.out.println("Temperature: " + T + " °C" );
            Thread.sleep(150);
        }

	}

}
