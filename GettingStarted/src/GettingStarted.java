  
//Add Phidgets Library 
import com.phidget22.*;

public class GettingStarted {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{
        
        //Create 
        DigitalInput redButton = new DigitalInput();
        boolean STATE = false;

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
            Thread.sleep(100);
        }
    }
}