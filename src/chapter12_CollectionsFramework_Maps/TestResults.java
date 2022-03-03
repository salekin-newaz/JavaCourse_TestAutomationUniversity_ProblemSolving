package chapter12_CollectionsFramework_Maps;

import java.util.HashMap;
import java.util.Map;

public class TestResults {
	
	public static Map getOriginalGrades() {
		Map grades= new HashMap();
		grades.put("fdh", 64);
		grades.put("gf", 55);
		grades.put("hg", 43);
		grades.put("gfb", 66);
		grades.put("bvbv", 23);
		grades.put("gff", 32);
		grades.put("dfd", 77);
		grades.put("wer", 87);
		grades.put("yts", 99);
		grades.put("ids", 54);
		grades.put("whr", 21);
		
		
		return grades;
		
	}
	
	public static Map getMakeUpGrades() {
		Map grades= new HashMap();
		grades.put("fdh", 90);
		grades.put("gf", 91);
		grades.put("hg", 92);
		grades.put("gfb", 93);
		grades.put("bvbv", 94);
		grades.put("gff", 95);
		grades.put("dfd", 96);
		grades.put("wer", 97);
		grades.put("yts", 87);
		grades.put("ids", 98);
		grades.put("whr", 99);
		
		return grades;
	}

}
