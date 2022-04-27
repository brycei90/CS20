
public class exampleWork {

	public static void main(String[] args) {
		
		final int num_elements = 10;
		
		int[] numbers = new int[num_elements];
		
		//stores numbers
		for(int i = 0; i < num_elements; i++) 
		{
			numbers[i] = i;	
		}
		
		//displays count down
		System.out.println("CountDown");
		
		for(int i = 0; i < num_elements; i++)
		{	
			System.out.println(numbers[i]);	
		}
		
	}

}
