import java.util.Scanner;

/*

Program:.java          Last Date of this Revision: April 28, 2022
 
Purpose: stores the square of an elements index in an integer array of 5 elements for example, the third element, which has index 2, should store 4. the application should then display
the value of each element in the array!

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class Squares {

	public static void main(String[] args) 
	{
		//stores number
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please input a number that is greater than or equal to 5!");
		
		int num = userinput.nextInt();
		
		int x = num - 5;//creates the array so it has 5 elements.
		
		int squareNumbers = num * num;//square the input number
		
		int[] numbers = new int[squareNumbers];
		
		
		for(int i = x; i < num; i++) 
		{
			numbers[i] = i;	
		}
		
		//displays count down
		System.out.println("the square of all the numbers before your inputted number is: ");
		
		for(int i = x; i < num; i++)
		{	
			System.out.println(numbers[i] * numbers[i]);	
		
		}

	}
}
/* screen dump

Please input a number that is greater than or equal to 5!
6
the square of all the numbers before your inputted number is:  
1
4
9
16
25

*/