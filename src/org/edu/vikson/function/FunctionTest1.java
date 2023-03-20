package org.edu.vikson.function;

import java.util.function.Function;

public class FunctionTest1 {

	public static void main(String[] args) {
	 
		Function<Integer, Integer> function= i-> i*i;
		System.out.println(function.apply(5));
		
		Function<Integer,Integer> function2= i-> i*2;
		System.out.println(function2.apply(2));
		
		System.out.println(function.andThen(function2).apply(2));
		
		System.out.println(function.compose(function2).apply(2));
		
		
	}
	
	    

}
