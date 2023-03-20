package org.edu.vikson.stream;

import java.util.*;

public class StreamTest05 {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(10,2,30,4,50);
		
		list.stream().sorted().forEach(i->System.out.println(i));
		System.out.println("=====================");
		
		list.stream().sorted((i1,i2)->-i1.compareTo(i2)).forEach(i->System.out.println(i));
		
		

	}

}
