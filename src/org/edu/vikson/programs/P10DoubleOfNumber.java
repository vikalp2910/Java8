package org.edu.vikson.programs;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public  class  P10DoubleOfNumber {

	

	public static void main(String[] args) {
		 
		List<Integer> list=Arrays.asList(1,2,3,4,5,5,4);
	    HashSet hs=new HashSet<>();
		
	    list.stream().sorted( (i1,i2)->i2.compareTo(i1)).distinct().forEach(System.out::println);
		
		
		
		
		    		
	}

}
