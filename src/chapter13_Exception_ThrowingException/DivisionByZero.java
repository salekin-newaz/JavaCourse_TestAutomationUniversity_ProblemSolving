package chapter13_Exception_ThrowingException;

import java.io.IOException;

public class DivisionByZero {

	public static void main(String[] args){
		
		
		try {
			int c = 30 / 0;

		} catch (ArithmeticException e) {

			System.out.println("Dividing by zero os not permitted");

		} finally {

			System.out.println("Division is Fun");
		}
	}

}
