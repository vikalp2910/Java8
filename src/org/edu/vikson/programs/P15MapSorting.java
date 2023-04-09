package org.edu.vikson.programs;

import java.util.HashMap;
import java.util.Map;

public class P15MapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 10);
        map.put("b", 30);
        map.put("e", 20);
        map.put("c", 50);
        map.put("d", 40);
      

        map.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())  
        .forEach(System.out::println);
        
        System.out.println("==============");
        
        map.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByKey())  
        .forEach(System.out::println);
        
        System.out.println("==============");
		
        map.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())  
        .forEach(System.out::println);
        
       
        
       
	}

}
