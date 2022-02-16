package chapter4_Loop;

import java.util.Scanner;

public class LetterSearch {

	public static void main(String[] args) {
		System.out.println("Enter text");
		Scanner scanner= new Scanner(System.in);
		String text= scanner.next();
		
		boolean LetterFound= false;
		for(int i=0; i<text.length();i++) {
			char currentLetter= text.charAt(i);
			if(currentLetter=='A' || currentLetter=='a') {
				LetterFound= true;
				break;
			}
		}
		
		if(LetterFound) {
			System.out.println("This text contains the letter 'A");
		}
		else {
			System.out.println("This text doesn't contain the letter 'A");
		}
		

	}

}
