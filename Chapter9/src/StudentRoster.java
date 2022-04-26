/*

Program:.java          Last Date of this Revision: April 26, 2022
 
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
		
		System.out.println("Please input all the students names: ");

	}

}

