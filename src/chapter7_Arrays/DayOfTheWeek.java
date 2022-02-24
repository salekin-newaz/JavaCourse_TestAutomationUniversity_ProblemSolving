package chapter7_Arrays;

import java.util.Scanner;

public class DayOfTheWeek {

	
	public static void main(String[] args) {

	    String[] week= {"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.println("Enter a number for the day of week");
		 Scanner input= new Scanner(System.in);
		 int index= input.nextInt();
		
		input.close();
		System.out.println("Corresponding day: " +week[index-1]);
	}
}

		
		
	



