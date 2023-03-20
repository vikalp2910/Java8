package org.edu.vikson.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest07 {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Object[] array=list.stream().filter(i->i%2==0).toArray();
		
		for(Object o : array) {
			System.out.println(o);
		}

	}

}
