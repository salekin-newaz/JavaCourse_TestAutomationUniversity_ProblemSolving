package chapter8_DataTypes_String;

public class ReverseString {

	public static void main(String[] args) {

		reverseString("Hello Sami");
	}

	
	public static void reverseString(String text) {
		for(int i= text.length()-1; i>=0;i--) {
			System.out.println(text.charAt(i));
		}
	}

}
