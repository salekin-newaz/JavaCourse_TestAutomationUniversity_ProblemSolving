package chapter10_Polymorphism;

public class Bananna extends Fruit{

	
	public Bananna() {
		setCalories(105);
	}
	
	public void peel() {
		System.out.println("Bananna has been peeled");
	}
	
	
	public void makeJuice() {
		System.out.println("Bananna juice is gross");
	}
}
