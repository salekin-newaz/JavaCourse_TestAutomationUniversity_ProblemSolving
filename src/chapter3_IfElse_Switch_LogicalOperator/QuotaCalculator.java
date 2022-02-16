package chapter3_IfElse_Switch_LogicalOperator;

import java.util.Scanner;

/*
 * The If-Else Statement
 * If a certain situation occurs, do something. Otherwise, do something else.
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulations message.
 * For those who don't, they are informed of how many sales they were short.
 */

public class QuotaCalculator {
	public static void main(String args[]) {
		//Initialize values
		 int quota= 10;
		
		//Get unknown values
		 System.out.println("Enter the number of sales you made this week");
		 Scanner scanner= new Scanner(System.in);
		 int sales= scanner.nextInt();
		 scanner.close();
		//Make a decision  on the path ro take-Output
		if(sales>=quota) {
			System.out.println("Congratulations! ");
		}
		
		else {
			int salesShort= quota-sales;
			System.out.println("You did not make your quota. You were: " +salesShort);
		}
		
		
		
	}
	
	
	
	
	

}
