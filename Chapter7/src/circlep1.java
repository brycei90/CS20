/*

Program:.java          Last Date of this Revision: April 4, 2022
 
Purpose: modify the circle class to include a member method named circumference.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class circlep1 { //the code is in circle

	public static void main(String[] args) {
		
		circle spot = new circle();
		
		spot.setRadius(3);
		System.out.println("Circle Radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + spot.circumference());
		

	}

}
/* screen dump

Circle Radius: 3.0
Circle circumference: 18.84



*/