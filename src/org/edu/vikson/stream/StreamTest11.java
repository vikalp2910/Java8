package org.edu.vikson.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest11 {

	public static void main(String[] args) {
		//List list=Arrays.asList(1,2,3,4,5,6,7);
		List list=List.of(1,2,3,4,5,6,7);
		list.stream().limit(5).forEach(i->System.out.println(i));
		System.out.println("=========================");
		list.stream().skip(5).forEach(i->System.out.println(i));		

	}

}
