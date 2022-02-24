package chapter6_ClassObjects;

import java.util.Scanner;

public class HomeCalculatorRedo {
	private Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		
		HomeCalculatorRedo calculator= new HomeCalculatorRedo();
		
		Rectangle kitchen= calculator.getRoom();
		Rectangle bathroom= calculator.getRoom();
		double area = calculator.calculateTotalArea(kitchen, bathroom);
		System.out.println("The total area is: " +area);
		calculator.scanner.close();
		
		
		
	}
	
	public double calculateTotalArea(Rectangle rect1, Rectangle rect2) {
		return rect1.calculateArea()+rect2.calculateArea();
	}
		public Rectangle getRoom() {
			
			System.out.println("Enter the length of your room: ");
			double length= scanner.nextDouble();
			
			
			System.out.println("Enter the width of your room: ");
			double width= scanner.nextDouble();
		
        	
			return new Rectangle(length, width);
			
			
			
		}
		

	}
