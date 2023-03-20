package org.edu.vikson.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest09 {

	public static void main(String[] args) {
			 
		 List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
		 System.out.println(list.stream().findFirst());
		 System.out.println(list.stream().findAny());
		 
		 System.out.println(list.stream().anyMatch(i->i>4));
		 System.out.println(list.stream().allMatch(i->i%2==0));
		 
		 System.out.println("==================");
		 
		 list.stream().filter(i->i%2==0).limit(4).forEach(i->System.out.println(i));
		 System.out.println("==================");
		 list.stream().filter(i->i%2==0).limit(4).sorted((i1,i2)->-i1.compareTo(i2)).forEach(i->System.out.println(i));

	}

}
