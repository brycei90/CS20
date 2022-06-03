import com.phidget22.TemperatureSensor;
/*

Program:.java          Last Date of this Revision: May 31, 2022
 
Purpose: closes teh phidget or terminates the program after use

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class ClosingPhidgets {

	public static void main(String[] args) throws Exception
	{
		//Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        
        temperatureSensor.open(1000);
        
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );

	}

}
