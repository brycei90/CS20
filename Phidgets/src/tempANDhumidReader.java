import com.phidget22.*;
public class tempANDhumidReader {

	public static void main(String[] args) throws Exception
	{
		
		
		//Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);


        
        //Use your Phidgets 
        while(true){
            double H = humiditySensor.getHumidity();
            
            double T = temperatureSensor.getTemperature();
            if(H > 30) 
            {
            	System.out.println("Humidity: " + H);
            }
            if(H < 30)
            {
            	System.out.println("Humidity is low");
            }
            if(T > 21)
            {
            	System.out.println("Temperature: " + T);
            }
            if(T < 21)
            	
            {
            	System.out.println("Room is too cold");
            }
            //System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH, Temperature: " + temperatureSensor.getTemperature() + " �C" );
            Thread.sleep(300);
        }

        
	}

}
