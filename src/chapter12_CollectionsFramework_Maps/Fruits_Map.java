package chapter12_CollectionsFramework_Maps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Fruits_Map {

	public static void main(String[] args) {
		
		
		// unordered unique key value pairs
		Map fruits = new HashMap();
		fruits.put("apple", 98);
		fruits.put("lemon", 87);
		fruits.put("banana", 67);
		fruits.put("orange", 75);
		fruits.put("lemon", 37);
		
		System.out.println(fruits.size());
		System.out.println(fruits);
		System.out.println(fruits.get("lemon"));
		
		System.out.println(fruits.entrySet());
		fruits.remove("orange");
		System.out.println(fruits);
		

	}

}
