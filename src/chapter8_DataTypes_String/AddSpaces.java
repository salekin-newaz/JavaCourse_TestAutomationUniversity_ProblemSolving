package chapter8_DataTypes_String;
public class AddSpaces {

	public static void main(String[] args) {
	
		addSpaces("helloThisIsSami");
	}
	
	public static void addSpaces(String text) {
		var modifiesText= new StringBuilder(text);
		
		for(int i=0; i<modifiesText.length();i++) {
			if(i!=0 && Character.isUpperCase(modifiesText.charAt(i))) {
				modifiesText.insert(i, " ");
				i++;
			}
		}
		System.out.println(modifiesText);
	}

}
