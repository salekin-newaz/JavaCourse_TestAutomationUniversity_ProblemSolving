package chapter10_Polymorphism;

public class Apple extends Fruit{

	
	public Apple() {
		setCalories(95);
	}
	public void removeSeeds() {
		System.out.println("Apple seeds removed");
	}
	
	
	@Override
	public void makeJuice() {
		System.out.println("Apple Juice is my favourite");
	}
}
