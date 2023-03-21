package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P10DoubleOfNumber {

	public static void main(String[] args) {
		 
		    List<Integer> list=Arrays.asList(1,2,3,4,5);
			
			System.out.println("=========Double of number ==============");
			var result=list.stream().map(i->i*2).collect(Collectors.toList());
			System.out.println(result);

	}

}
