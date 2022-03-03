package chapter10_Polymorphism;

public class Market {

	public static void main(String[] args) {
		
		Fruit apple = new Apple();
		 ((Apple) apple).removeSeeds();
		 
		 Apple apple2= new Apple();
		 apple2.removeSeeds();
		 
		 
		 Bananna banana= new Bananna();
		 banana.peel();
		 
		 
		 Fruit banana2= new Bananna();
		 ((Bananna) banana2).peel();
		 
		 Fruit orange = new Fruit();
		 squeeze(apple);
		 squeeze(banana);
		 squeeze(banana2);
		 squeeze(orange);
		 
		 
		 
		 
	}
	
	public static void squeeze(Fruit fruit) {
		System.out.println("Squeezing........");
		fruit.makeJuice();
	}

}
