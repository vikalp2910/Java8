package org.edu.vikson.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest01 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		List<Integer> result=list.stream().filter( i-> i<=15 ).collect(Collectors.toList());
		
		result.stream().forEach(x->System.out.println(x));
		
		System.out.println(result);
		
		

	}

}
