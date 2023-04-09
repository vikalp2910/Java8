package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.List;

public class P06MaxMinNumber {

	public static void main(String[] args) {
		
        List<Integer> list=Arrays.asList(1,3,2,5,4);
		
		System.out.println("=========Max of number ==============");
		
		var result1=list.stream().max((i1,i2)->i1.compareTo(i2));  //12345  //54321
		System.out.println(result1.get());
		
        System.out.println("=========Min of number ==============");
		
		var result2=list.stream().min((i1,i2)->i1.compareTo(i2));
		System.out.println(result2.get());

	}

}
