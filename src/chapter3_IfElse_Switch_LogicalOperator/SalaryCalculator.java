package chapter3_IfElse_Switch_LogicalOperator;

import java.util.Scanner;

/*
 If Statement
 All salesperson get a payment of $1000 a week
 Salespeople who exceed 10 sales get an additional bonus of $250
 */

public class SalaryCalculator {
	public static void main(String args[]) {
		
		//Initialize known values
		int salary= 1000;
		int bonous= 250;
		int quota= 10;
		
		//Get values for the Unknown
		System.out.println("how manny sales did the employeee make this week?");
		Scanner scanner= new Scanner(System.in);
		int sales= scanner.nextInt();
		scanner.close();
		
		//Quick detour for the bonus earners
		if(sales>quota) {
			salary+=bonous;
		}
		//output
		System.out.println("The employee's pay is : $" +salary);
	}

}
