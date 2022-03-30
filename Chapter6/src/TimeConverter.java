/*
Program:.java          Last Date of this Revision: March 29, 2022
 
Purpose: a time converter application that allows the user to choose among converting hours to minutes, days to hours, minutes to hours, or hours to days.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like hour to minutes, days to hours, minutes to hours, or hours to days");
		
		String TT = input.nextLine();
		
		switch(TT) {
		
		case ("hour to minutes"): //similar to if statement depending on their response
			Scanner userinput = new Scanner(System.in);
		
			System.out.println("please input your hours");
		
			int hour = userinput.nextInt();
		
			int mins = hour * 60; //converts time
		
			System.out.println(hour + " hours in minutes is: " + mins + " minutes"); //outputs conversion
		break;
		
		case ("days to hours"): 
			Scanner userinput2 = new Scanner(System.in);
		
			System.out.println("please input your days");
		
			int hour2 = userinput2.nextInt();
		
			int mins2 = hour2 * 60; //converts time
		
			System.out.println(hour2 + " days in hours is: " + mins2 + " hours");//outputs conversion
		break;
		
		case ("minutes to hours"): 
			Scanner userinput3 = new Scanner(System.in);
		
			System.out.println("please input your minutes");
		
			double hour3 = userinput3.nextDouble();
		
			double mins3 = hour3 / 60; //converts time
		
			System.out.println(hour3 + " minutes in hours is: " + mins3 + " hours");//outputs conversion
		break;
		
		case ("hours to days"): 
			Scanner userinput4 = new Scanner(System.in);
		
			System.out.println("please input your hours");
		
			double hour4 = userinput4.nextDouble();
		
			double mins4 = hour4 / 24; //converts time
		
			System.out.println(hour4 + " hours in days is: " + mins4 + " days");//outputs conversion
		break;
		
		}
		
		
		
		
		
	}

}
