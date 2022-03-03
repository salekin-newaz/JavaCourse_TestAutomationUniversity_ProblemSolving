package chapter9_Inheritance_Constructor_Overloading_AccessLimitation;

public class InheritanceTest {

	public static void main(String[] args) {
		//Person person= new Person();
		//Employee emp= new Employee();
		
		Rectangle rect= new Rectangle();
		rect.print();
		
		
		Square sqr= new Square();
		sqr.print("square");
	}
	
	public static void testSquareOverride() {
		Rectangle rect= new Rectangle();
		rect.setLength(4);
		rect.setWidth(8);
		System.out.println(rect.calculatePerimeter());
		
		Square sqr= new Square();
		sqr.setLength(4);
		sqr.setWidth(8);
		System.out.println(sqr.calculatePerimeter());
		
		
	}

}
