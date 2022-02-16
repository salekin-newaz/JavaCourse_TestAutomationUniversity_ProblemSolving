package chapter5_Method_VariableScope;

import java.util.Scanner;

public class InstantCreditCheck {
	static int requiredSalary= 25000;
	static int requiredCreditScore= 700;
	static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {

		double salary = getSalary();
		int creditScore = getCreditScore();
		scanner.close();
		boolean qualified = isUserQualified(creditScore, salary);

		// check if the user is qualified

		// Notify the user
		notifyUser(qualified);

	}

	public static double getSalary() {
		System.out.println("Enter your salary: ");
		double salary = scanner.nextDouble();
		return salary;
	}

	public static int getCreditScore() {

		System.out.println("Enter your credit score: ");
		int creditScore = scanner.nextInt();
		return creditScore;
	}

	public static void notifyUser(boolean isQualified) {
		if (isQualified) {
			System.out.println("Congrats! you have been selected");
		} else {
			System.out.println("Sorry. you have been declined");
		}
	}

	public static boolean isUserQualified(int creditScore, double salary) {
		if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
			return true;
		} else {
			return false;
		}
	}

}
