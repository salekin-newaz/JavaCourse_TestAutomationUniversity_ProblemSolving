package chapter3_IfElse_Switch_LogicalOperator;

import java.util.Scanner;

/*
 * NESTED IFS: If a certain situation occurs, check for the next situation.
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */


public class LoanQualifier {
	public static void main(String args[]) {
		
	
	//Initialize what we know
	int requredSalary= 30000;
	int requiredYersEmployed= 2;
	
	//Get what we don't
	System.out.println("Enter your salary");
	Scanner scanner= new Scanner(System.in);
	double salary= scanner.nextDouble();
	System.out.println("Enter the number of years with current employer: ");
	double years= scanner.nextDouble();
	scanner.close();
	
	//Make decision
    if(salary>= requredSalary && years>= requiredYersEmployed) {
  
    		System.out.println("Congrats! you qualify for the loan");
    	}

    
    else {
    	System.out.println("Sorry, you must at least $" + requredSalary +  "To qualify for the loan");
    }
	}
}
