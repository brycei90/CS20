/*

Program:.java          Last Date of this Revision: April 7, 2022
 
Purpose: modify the circle class to override the equals() and toString() methods, as shown in the previous section.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
public class circlep4 {

	private static final double PI = 3.14;
	private double radius;
	
	public circlep4() { //constructor
		
		radius = 1; //default radius
		
	}
	public circlep4(double r) { //overloaded constructor
		
		radius = r; //circle object created with radius r
		
	}
	public void setRadius(double newRadius) {//modifier method
		
		radius = newRadius; //changes radius of the circle
		
	}
	
	
	public double area() {//accessor method
		
		double circleArea;
		
		circleArea = PI * radius * radius; //calculates circle area
		return(circleArea);
		
	}
	
	public double getRadius() {//accessor method
		
		return(radius); // returns radius of circle
		
	}
	
	public double circumference() {//accessor method
		
		double circleCircumference;
		
		circleCircumference = 2 * PI * radius; //calculates the circumference
		return(circleCircumference);
		
	}
	
	public boolean equals(Object c) {//accessor method
		circlep4 testObj = (circlep4)c;
		
		if(testObj.getRadius() == radius){//determines if object is equal to another circle object 	
			return(true); //true if objects have same radius
		}else {	
			return(false); //otherwise it is false
		}	
	}
	public String toString() {
		
			String circleString;
			
			circleString = "Circle has radius " + radius;
			return(circleString);
				
	}
	
	public static void displayAreaFormula() {
		
		System.out.println("The formula for the area of a circle is A = PI * r * r");
		
	}
	
	
	public static void main(String[] args) {
		circlep4 spot1 = new circlep4(3);
		circlep4 spot2 = new circlep4(4);
		
		if(spot1.equals(spot2)) {
			
			System.out.println("Objects are equal");
			
		}else {
			
			System.out.println("Objects are not equal");
			
		}
		System.out.println(spot1);
		System.out.println(spot2);
		
	}
	
	
}
/* screen dump
 
 

Objects are not equal
Circle has radius 3.0
Circle has radius 4.0






*/
