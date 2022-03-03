package chapter12_CollectionsFramework_Maps;

import java.util.Map;

public class GradeBook {

	public static void main(String[] args) {
		

		Map<String, Integer> gradebook= TestResults.getOriginalGrades();
		Map<String, Integer> test2= TestResults.getMakeUpGrades();
		
		for(var student: test2.entrySet()) {
		    Integer firstGrade= gradebook.get(student.getKey());
		    Integer secondGrade= test2.get(student.getKey());
		
		
		
		if(secondGrade>firstGrade) {
			gradebook.put(student.getKey(), secondGrade);
		}
		}
		
		System.out.println("Final Grade");
		
		gradebook.forEach(
				(k,v)->System.out.println("Student: " +k+", Grade: "+v));
		
		
	}

}
