package chapter4_Loop;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		
		//Get the number of items to scan
		System.out.println("Enter the number of item you would like to scan");
		Scanner scanner= new Scanner(System.in);
		int quantity= scanner.nextInt();
	
		
		
		double total= 0;
		
		for(int i=0; i<quantity;i++) {
			double price= scanner.nextDouble();
			total= total+price;
			
		}
		scanner.close();
		System.out.println("your total is: $" + total);
		

	}

}
