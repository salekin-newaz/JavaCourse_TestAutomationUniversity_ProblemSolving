package chapter12_CollectionsFramework_Maps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Fruits_Queue {

	public static void main(String[] args) {
		
		
		// Ordered elements for processing. Access in the order elements were added. FIFO: First in First Out
		Queue fruits = new LinkedList();
		fruits.add("apple");
		fruits.add("lemon");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("lemon");
		
		System.out.println(fruits.size());
		System.out.println(fruits);
		fruits.remove();
		System.out.println(fruits);
		System.out.println(fruits.peek());
		
		
		
}
}
