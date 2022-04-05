/*

Program:.java          Last Date of this Revision: April 4, 2022
 
Purpose: modify the circle class to include an overloaded constructor that accepts the radius of the circle object, as shown in the previous section.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class circlep2 {

	private static final double PI = 3.14;
	private double radius;
	
	public circlep2() { //constructor
		
		radius = 1; //default radius
		
	}
	public circlep2(double r) { //constructor
		
		radius = r; 
		
	}
	public void setRadius(double newRadius) {
		
		radius = newRadius; //changes radius of the circle
		
	}
	
	public double area() {
		
		double circleArea;
		
		circleArea = PI * radius * radius; //calculates circle area
		return(circleArea);
		
	}
	
	public double getRadius() {
		
		return(radius); // returns radius of circle
		
	}
	
	public double circumference() {
		
		double circleCircumference;
		
		circleCircumference = 2 * PI * radius; //calculates the circumference
		return(circleCircumference);
		
	}
	
	public static void main(String[] args) {


		circlep2 spot = new circlep2();
		
		spot.setRadius(3);
		System.out.println("Circle Radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + spot.circumference());
		
	}
}


/* screen dump
 * 
 * 
Circle Radius: 3.0
Circle circumference: 18.84
 * 
 * 
 * 
 * 
 */

