/*

Program:.java          Last Date of this Revision: May 23, 2022
 
Purpose: reads the temperature of the room

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import com.phidget22.*;

public class TempReader //°F = (°C × 1.8) + 32
{

	public static void main(String[] args) throws Exception
	{
		double F = 0;
		//Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);

        F = (temperatureSensor.getTemperature() * 1.8) + 32;
        
        //Use your Phidgets 
        while (true) {
            System.out.println("Temperature: " + F + " °F" );
            Thread.sleep(150);
        }
	}

}
