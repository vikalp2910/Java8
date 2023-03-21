package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P09HighLowNumber {

	public static void main(String[] args) {
		
        List<Integer> list=Arrays.asList(5,2,1,3,4,10,7,9,8,6);
		
		System.out.println("=========Highest Number of number ==============");
		var result1=list.stream().sorted((i1,i2)->i2.compareTo(i1) )
				        .limit(1)
				        .collect(Collectors.toList());
		
		System.out.println(result1);
		
		System.out.println("=========Lowest Number of number ==============");
		var result2=list.stream().sorted((i1,i2)->i1.compareTo(i2) )
				        .limit(1)
				        .collect(Collectors.toList());
		
		System.out.println(result2);
		
		System.out.println("=========Second Highest Number of number ==============");
		var result3=list.stream().sorted((i1,i2)->i2.compareTo(i1) )
				        .skip(1)
				        .limit(1)
				        .collect(Collectors.toList());
		
		System.out.println(result3);
		
		System.out.println("=========Second Lowest Number of number ==============");
		var result4=list.stream().sorted((i1,i2)->i1.compareTo(i2) )
				        .skip(1)
				        .limit(1)
				        .collect(Collectors.toList());
		
		System.out.println(result4);
		
		System.out.println("=========Third Highest Number of number ==============");
		var result5=list.stream().sorted((i1,i2)->i2.compareTo(i1) )
				        .skip(2)
				        .limit(1)
				        .collect(Collectors.toList());
		
		System.out.println(result5);
		
		System.out.println("=========Third Lowest Number of number ==============");
		var result6=list.stream().sorted((i1,i2)->i1.compareTo(i2) )
				        .skip(2)
				        .limit(1)
				        .collect(Collectors.toList());
		
		System.out.println(result6);
		
		
		

	}

}
