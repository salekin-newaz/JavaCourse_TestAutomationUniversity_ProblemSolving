package chapter6_ClassObjects;

public class PhoneBillCalculator {

	public static void main(String[] args) {
		PhoneBill bill= new PhoneBill();
	    bill.setAllottedMinutes(1000);
	    bill.printItemizedBill();

	}

}
