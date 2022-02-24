package chapter6_ClassObjects;

public class HomeAreaCalculator {

	public static void main(String[] args) {
	    
		/******************
		 * RECTANGLE 1
		 ******************/
		
		//Create an instance of the Rectangle class
		Rectangle room1= new Rectangle();
		room1.setLength(50);
		room1.setWidth(25);
		double areaOfRoom1= room1.calculateArea();
		
		
		/******************
		 * RECTANGLE 2
		 ******************/
		
		Rectangle room2= new Rectangle(30, 75);
		double areaOfRoom2= room2.calculateArea();
		double totalArea= areaOfRoom1+areaOfRoom2;
		
		System.out.println("Area of both room is: " +totalArea);
		

	}

}
