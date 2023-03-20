package org.edu.vikson.stream;

import java.util.*;

public class StreamTest06 {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,2,3,4,5);
		
		int min=list.stream().min( (i1,i2)->i1.compareTo(i2) ).get();
		System.out.println("minimum is "+min);
		
		int max=list.stream().max( (i1,i2)->i1.compareTo(i2)).get();
		System.out.println("maximum is "+max);
		
		System.out.println("====================");
		
		list.stream().sorted( (i1,i2)->i2.compareTo(i1)).forEach(i->System.out.println(i));
		
		

	}

}
