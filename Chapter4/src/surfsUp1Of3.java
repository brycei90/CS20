/*
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose: prompts the user for the wave height then displays a message if the waves are 6 feet or over.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/

import java.util.Scanner;
public class surfsUp1Of3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner wave = new Scanner(System.in); //scanner wave size
		
		
		System.out.println("What is the wave height today?");
		
		
		int WS = wave.nextInt(); //declaring wave size
		
		if(WS > 6);
			System.out.println("Great day for surfing!");
		
		

	}

}
/*screen dump
What is the wave height today?
6
Great day for surfing!

*/