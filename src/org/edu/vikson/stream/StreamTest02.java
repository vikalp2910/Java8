package org.edu.vikson.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest02 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4);
		
		Stream s=list.stream().filter( x->x%2==0);		
		s.forEach(x->System.out.println(x));
		
		

	}

}
