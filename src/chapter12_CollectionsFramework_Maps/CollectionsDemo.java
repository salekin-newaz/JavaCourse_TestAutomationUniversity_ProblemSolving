package chapter12_CollectionsFramework_Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    //setDemo();
	        //listDemo();
	        //queueDemo();
	        mapDemo();
		    
	}
		
		    public static void setDemo(){
		        Set<String> fruit = new HashSet();
		        fruit.add("apple");
		        fruit.add("lemon");
		        fruit.add("banana");
		        fruit.add("orange");
		        fruit.add("lemon");

//		        var i = fruit.iterator();
//		        while(i.hasNext()) {
//		            System.out.println(i.next());
//		        System.out.println(i.next());
//		        }
////		    
//		    
//		    for(String item:fruit) {
//		    	System.out.println(item);
//		    }
//		    
		        fruit.forEach(x -> System.out.println(x));
		        //aisalekinnewSystem.out.println("Hello, this is Md s;aelo Newaz ");
		    
		    
		    
		    }

			public static void mapDemo(){
				Map<String, Integer > fruits =new HashMap();
				fruits.put("apple", 87);
				fruits.put("lemon", 43);
				fruits.put("banana", 55);
				fruits.put("orange", 84);
				fruits.put("lemon", 98);


//				for(var entry: fruits.entrySet()){
//					System.out.println(entry.getValue());
//				}
				
				fruits.forEach(
				       (k,v) -> System.out.println("Fruits: " + k+ ", Calories: " + v));


			}
}

			
			
	
