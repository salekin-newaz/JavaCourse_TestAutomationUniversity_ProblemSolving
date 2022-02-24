package chapter5_Method_VariableScope;

/*So, what you're going to do is allow the user to input the plan fee and the number of overage minutes. And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.

I want you to create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.

Please print this as an itemized bill. I have an example of the output expected down below.

Good luck.
*/



import java.util.Scanner;

public class PhoneBillCalculator {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter base cost of the plan");
		double baseCost= scanner.nextDouble();
		
		
		System.out.println("Enter Overage minutes");
		double overage= scanner.nextDouble();
		scanner.close();
		
		double overCharge= calculateOverages(overage);
		double tax= calculateTax(baseCost+overCharge);
		
		calculateAndPrintBill(baseCost, overCharge, tax);
	}
	
	public static double calculateOverages(double extraMinutes) {
		double rate= 0.25;
		double overage= rate*extraMinutes;
		return overage;
	}
	
	public static double calculateTax(double subtotal) {
		double rate= 0.15;
		double tax= rate*subtotal;
		return tax;
	}
	
	public static void calculateAndPrintBill(double base, double overage, double tax) {
		double finalTotal= base+ overage+tax;
		
		System.out.println("Phone Bill Statement");
		System.out.println("Plan: $" + String.format("%.2f", base));
		System.out.println("Overage: $" + String.format("%.2f", overage));
		System.out.println("Tax: $" + String.format("%.2f", tax));
		System.out.println("Total: $" + String.format("%.2f", finalTotal));
	}
	
	

}
