import com.phidget22.*;

public class ButtonEvents {
	//Handle Exception               
	public static void main(String[] args) throws Exception
	{
		
	       
	        //Create
	        DigitalInput redButton = new DigitalInput();

	        //Address
	        redButton.setIsHubPortDevice(true);
	        redButton.setHubPort(0);

	        //Event 
	        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {
	                System.out.println("State: " + e.getState());
	            }
	        });

	        //Open
	        redButton.open(1000);

	        //Keep program running
	        while (true) {
	            Thread.sleep(150);
	        }

	}

}
