package chapter8_DataTypes_String;

public class ConvertDecimalToInt {

	public static void main(String[] args) {
		
		double[] numbers= {1.4,5.7,3.3,66.755,22.66};
		
		for(Double number : numbers) {
			System.out.println(number.intValue());
		}

	}

}
