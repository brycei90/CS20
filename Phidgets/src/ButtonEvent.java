import com.phidget22.*;
/*

Program:.java          Last Date of this Revision: May 31, 2022
 
Purpose: instead of using a while loop and continually checking for data input the data comes to the computer! Also tracks the state of the button

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/

public class ButtonEvent {

	public static void main(String[] args) throws Exception 
	{
        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if(e.getState() == true)
                {
                	System.out.println("state: pressed");
                }
                else
                {
                	System.out.println("state: unpressed");
                }
            }
        });
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if(e.getState() == true)
                {
                	System.out.println("state: pressed");
                }
                else
                {
                	System.out.println("state: unpressed");
                }
            }
        });
        //Open
        redButton.open(1000);
        greenButton.open(1000);
        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
	}
}
