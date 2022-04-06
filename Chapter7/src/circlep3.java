/*

Program:.java          Last Date of this Revision: April 4, 2022
 
Purpose: modify the circle class to include a class method named displayAreaFormula, as shown in the previous section.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class circlep3 {

	private static final double PI = 3.14;
	private double radius;
	
	public circlep3() { //constructor
		
		radius = 1; //default radius
		
	}
	public circlep3(double r) { //overloaded constructor
		
		radius = r; //circle object created with radius r
		
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
	public static void displayAreaFormula() {
		
		System.out.println("The formula for the area of a circle is A = PI * r * r");
		
	}
	
	public static void main(String[] args) {


		circlep3 spot = new circlep3();
		
		spot.setRadius(3);
		circlep3.displayAreaFormula();
		System.out.println("Circle Radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + spot.circumference());
		
		
	}
	
	
}
/* screen dump
 
 

The formula for the area of a circle is A = PI * r * r
Circle Radius: 3.0
Circle circumference: 18.84





*/