/*

Program:.java          Last Date of this Revision: April 27, 2022
 
Purpose: prompts the user for the number of students in the class and then prompts the user for each students name and stores the names in an array. after the names have been entered,
the application should display the title then list the names in the array!

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("How many students are in your class");
		
		int studentA = userinput.nextInt();
		
		String[] studentN = new String[studentA]; 
		
		//stores names
		for(int i = 0; i < studentA; i++)
		{
			Scanner Uinput = new Scanner(System.in);
			System.out.println("Please input all the students names: ");
			String names = Uinput.next();
			studentN[i] = names;
			
		}
		
		System.out.println("Student Roster: ");
		
		//displays names
		for(int i = 0; i < studentA; i++)
		{
			System.out.println(studentN[i]);
		}

	}

}

/* screen dump

How many students are in your class
2
Please input all the students names: 
elyas
Please input all the students names: 
bryce
Student Roster: 
elyas
bryce



*/