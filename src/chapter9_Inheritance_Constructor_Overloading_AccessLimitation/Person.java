package chapter9_Inheritance_Constructor_Overloading_AccessLimitation;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	 public Person() {
		 System.out.println("In Person defualt constructor");
	 }
	 
	 public Person(String name) {
		 System.out.println("In Person Second constructor. name also set");
	 }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}
