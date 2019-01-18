package com.cslb.objectdemo;

import java.util.HashMap;
import java.util.Map;

public class Test {




	@SuppressWarnings({ "unchecked", "static-access" })
	public static void main(String[] args) throws Exception {
 
		
		Cat cat = new Cat();

		cat.name = "ÈŸ√®";
		cat.age = 11;

		Map<String, Cat> map = new HashMap<String, Cat>();

	    map.put("cat", cat);
	    
	    Cat cat2 = map.get("cat");

		System.out.println(cat2.name+cat2.age);
		
		
		
		

	}

	


	
	
	
}
