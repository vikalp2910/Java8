package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class P02AvgOfNumber {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5);
		
		     
        System.out.println("=========Way 1 avg of number ==============");
	    var result1=list.stream().mapToInt(i->i).average();
	    System.out.println(result1.getAsDouble());

		
	    System.out.println("=========Way 2 avg of number ==============");
	    Optional<Integer> result2=list.stream().reduce( (a, b)->a+b);
	    System.out.println(result2.get()/list.size());
	    
	    System.out.println("=========Way 3 avg of number =============="); 
	    var result3=list.stream().collect(Collectors.averagingInt(Integer::intValue));
	    System.out.println(result3);
        
        
	}

}
