import java.lang.Math;//import this if math.random is giving you a hard time.
public class RandomStats {

	public static void main(String[] args) 
	{
		//declaring array that is 1 d		// indices or a single index - max is 10 it goes 0,1,2,3,4,5,6,7,8,9
		int[] outcomes = new int[10]; //array name  //this is a box that holds data int [10] means there is 10 spots in the box 
		int outcome;
		//have to use a for loop to traverse the array
		for(int i = 0; i < 100; i++)//creating the for loop
		{
			outcome = (int)(10*Math.random());
			outcomes[outcome/* random num in array */ ] += 1; //this populates your array 
		}
		//displaying the information in the array
		for(int i = 0; i < 10; i++)
		{
			System.out.println(outcomes[i]); //displays the array vertically
			//System.out.print(" " + outcomes[i]); displays the array horizontally
		}
	}

}
