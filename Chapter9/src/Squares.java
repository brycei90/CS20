import java.util.Scanner;

/*

Program:.java          Last Date of this Revision: April 27, 2022
 
Purpose: stores the square of an elements index in an integer array of 5 elements for example, the third element, which has index 2, should store 4. the application should then display
the value of each element in the array!

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class Squares {

	public static void main(String[] args) 
	{
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please input a number that is greater than or equal to 5!");
		
		int num = userinput.nextInt();
		
		
		
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
