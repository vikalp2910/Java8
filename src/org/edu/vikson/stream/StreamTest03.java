package org.edu.vikson.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTest03 {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(5,10,15,20);
		list.stream().map(i->i*i).forEach(i->System.out.println(i));
		
		System.out.println("===========");
		
		List<Integer>result=list.stream().map(i->i*i).collect(Collectors.toList());
		result.stream().forEach(i->System.out.println(i));

	}

}
