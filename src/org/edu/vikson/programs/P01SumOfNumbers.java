package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class P01SumOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		
		System.out.println("=========Way 1 sum of number ==============");
		
		
	    int result1=list.stream().mapToInt(i->i).sum();
	    System.out.println(result1);

		
	    System.out.println("=========Way 2 sum of number ==============");
	    Optional<Integer> result2=list.stream().reduce( (a, b)->a+b);
	    System.out.println(result2.get());
	    
	    System.out.println("=========Way 3 sum of number =============="); 
	    var result3=list.stream().collect(Collectors.summingInt(Integer::intValue));
	    System.out.println(result3);
	    
	}

}
