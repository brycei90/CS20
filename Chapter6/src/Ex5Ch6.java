import java.text.DecimalFormat;
import java.util.Scanner;

/*

Program:.java          Last Date of this Revision: March 30, 2022
 
Purpose: create an add coins application that prompts the user for the number of pennies, nickels, dimes, and quarters, and then displays their total dollar amount.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class Ex5Ch6 {

	public static void getDollarAmount() {
		// TODO Auto-generated method stub
		Scanner Quarters = new Scanner(System.in);
		
		System.out.println("Please input the amount of Quarters: "); 

		int Q1 = Quarters.nextInt();
		
		double Q = Q1 * 0.25; //defines number of quarters and value
		 
		Scanner dimes = new Scanner(System.in); 
		
		System.out.println("Please input the amount of Dimes: ");

		int D1 = dimes.nextInt();
		
		double D = D1 * 0.1; //defines number of dimes and value
		
		Scanner nickels = new Scanner(System.in);
		
		System.out.println("Please input the amount of Nickels: ");

		int N1 = nickels.nextInt();
		
		double N = N1 * 0.05; //defines number of nickels and value
		
		
		Scanner pennies = new Scanner(System.in);
		
		System.out.println("Please input the amount of Pennies: ");

		int P1 = pennies.nextInt();
		
		double P = P1 * 0.01; //defines number of pennies and value
		
		
		double total = P + N + D + Q;
		
		String output = DecimalFormat.getCurrencyInstance().format(total); //this basically puts & in front of the number
		
		System.out.println(output);
		
	}

	public static void main(String[] args) {
		
		getDollarAmount();
		
	}
	
}

/* screen dump


Please input the amount of Quarters: 
3
Please input the amount of Dimes: 
2
Please input the amount of Nickels: 
1
Please input the amount of Pennies: 
8
$1.08



*/