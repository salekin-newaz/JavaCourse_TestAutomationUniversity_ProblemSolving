package chapter4_Loop;

import java.util.Scanner;

public class GrossPayInputValidation {

	public static void main(String[] args) {
		//Initilize known variables 
		int rate= 15;
		int maxHours= 40;
		
		//Get input for unknown variables
		System.out.println("How many hours did you work this week!");
		Scanner scanner= new Scanner(System.in);
		double hoursWorked= scanner.nextDouble(); 
		
		//validate input
		while(hoursWorked>maxHours || hoursWorked<1) {
			System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again");
			hoursWorked= scanner.nextDouble();
			
		}
		scanner.close();
		
		
		//calculate gross
		double gross= rate*hoursWorked;
		System.out.println("Gross pay: $" +gross);

	}

}
