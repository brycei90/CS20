
import java.util.Scanner;
/*

Program:.java          Last Date of this Revision: March 30, 2022
 
Purpose: modify the prime number application created in chapter 5 exercise 1 to include a method named isPrime().

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class Ex3ch6 {
	   
		public static void isPrime() {
		
		 
		boolean prime = true;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Please input a number");
		
		int num = input.nextInt(); //grabs number in question
		
		//prime numbers are evenly divisble by itself and 1.
		
		int i=2;
		while(i<= num/2) //performs loop if i which is 2 less than or equal to the inputed number divided by 2
		{
		   if(num % i == 0) // if the remainder of 2 of the number is 0 then it is not prime
		   {
			prime = false;
			break;
		   }
		   i++;
		}
		if(prime) {
			   System.out.println(num + " is a Prime Number");
		}else {
			   System.out.println(num + " is not a Prime Number");
		}
		
		

	}

		public static void main(String[] args) {
			
			isPrime();
			
		}
		
}
/*screen dump
 * 
 * 
 * 
Please input a number
7
7 is a Prime Number
 * 
 */


