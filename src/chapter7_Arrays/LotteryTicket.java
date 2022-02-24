package chapter7_Arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
	private static final int length=6;
	private static final int maxTicketNumber=6;

	public static void main(String[] args) {
		int[] ticket= generateNumbers();
		
		Arrays.sort(ticket);
		printTicket(ticket);
		

	}
	
	public static int[] generateNumbers() {
		int [] ticket= new int[length];
		Random random= new Random();
		for(int i=0; i<length; i++) {
			int randomNumber;
			do {
				randomNumber = random.nextInt(maxTicketNumber)+1;
			}
			
			while(search(ticket, randomNumber));
			
			ticket[i]=randomNumber;
			
		}
		
		return ticket;
		
	}
	public static boolean search(int [] array, int numberToSearchFor) {
		for(int value: array) {
			if(value== numberToSearchFor) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean binarySearch(int[] array, int numberToSearch) {
		Arrays.sort(array);
		int index= Arrays.binarySearch(array, numberToSearch);
		if(index>=0) {
			return true;
		}
		else return false;
	}
	
	public static void printTicket(int ticket[]) {
		for(int i=0; i<length; i++) {
			System.out.print(ticket[i]+ " | ");
		}
		
	}

}
