package org.edu.vikson.stream;

import java.util.*;

public class StreamTest04 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		Long count=list.stream().count();
		System.out.println(count);
		
		Long resultCount=list.stream().filter(i->i%2==0).count();
		System.out.println(resultCount);
		
		
	}
}
