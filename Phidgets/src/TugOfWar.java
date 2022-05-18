import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugOfWar {
	    public static void main(String[] args) throws Exception
	    {
	    	int PG = 0, PR = 0;
	    	
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
	            if((PR >= 20)&&(PR > PG)) 
	            {
	            	System.out.println("Red wins");
	            }
	            else if((PG >= 20)&&(PG > PR))
	            {
	            	System.out.println("Green wins");
	            }
	            Thread.sleep(150);
	        }
	    }
}
