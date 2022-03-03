package chapter12_CollectionsFramework_Maps;

import java.util.ArrayList;
import java.util.List;

public class Fruits_List {

	public static void main(String[] args) {
		// Ordered elements which can be accessed by position
		
		List fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("lemon");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("lemon");
		
		
		System.out.println(fruits.get(2));
		System.out.println(fruits.size());
		System.out.println(fruits);
		
		
		

	}

}
