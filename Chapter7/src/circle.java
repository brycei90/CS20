

public class circle {
		
		private static final double PI = 3.14;
		private double radius;
		
		public circle() {
			
			radius = 1; //default radius
			
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


			circle spot = new circle();
			
			spot.setRadius(3);
			System.out.println("Circle Radius: " + spot.getRadius());
			System.out.println("Circle circumference: " + spot.circumference());
			
		}
	

}

