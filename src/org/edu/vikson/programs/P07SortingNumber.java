package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P07SortingNumber {

	public static void main(String[] args) {

        List<Integer> list=Arrays.asList(5,2,1,3,4);
		
		System.out.println("=========Ascending sorting of number ==============");
		var result1=list.stream().sorted().collect(Collectors.toList());
		System.out.println(result1);
		
		System.out.println("=========Desending sorting of number ==============");
		var result2=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(result2);
	}

}
