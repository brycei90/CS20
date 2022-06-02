import com.phidget22.DigitalOutput;

public class BlinkLED {

	public static void main(String[] args) throws Exception
	{
		//Create 
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open 
        redLED.open(1000);
        greenLED.open(1000);
        
        //Use your Phidgets 
        while(true){
        	greenLED.setState(true);
        	Thread.sleep(1000);
        	greenLED.setState(false);
        	Thread.sleep(1000);
            redLED.setState(true);
            Thread.sleep(1000);
            redLED.setState(false);
            Thread.sleep(1000);
        }

	}

}