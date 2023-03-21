package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P08LimitSkipNumber {

	public static void main(String[] args) {
      
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("=========Limit number ==============");
		var result1=list.stream().limit(5).collect(Collectors.toList());
		System.out.println(result1);
		
		System.out.println("=========Skip number ==============");
		var result2=list.stream().skip(5).collect(Collectors.toList());
		System.out.println(result2);

	}

}
