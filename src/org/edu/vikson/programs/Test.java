package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> list =Arrays.asList(2,4,0,1,5,9,8,6,10,2,4);
         
         System.out.println(list);
         HashSet hs=new HashSet<>();
         var result =list.stream().sorted( (i1,i2)->-i1.compareTo(i2) ).collect(Collectors.toList());
         
         System.out.println(result);

	}

}
