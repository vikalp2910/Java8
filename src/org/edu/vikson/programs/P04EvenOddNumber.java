package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P04EvenOddNumber {

	public static void main(String[] args) {
		
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("=========Even number ==============");
		var result1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(result1);
		
		System.out.println("=========Odd number ==============");
		var result2=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(result2);

	}

}
