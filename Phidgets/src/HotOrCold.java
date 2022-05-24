import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class HotOrCold {

	public static void main(String[] args) throws Exception
	{
		double F = 0, T = 0;
		//Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //address
        redLED.setHubPort(0);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(1);
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
        	}
        	else if((T > 24)||(T < 20))
        	{
        		redLED.setState(true);
        	}
            System.out.println("Temperature: " + T + " °C" );
            Thread.sleep(150);
        }

	}

}
