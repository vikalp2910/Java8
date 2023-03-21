package org.edu.vikson.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P05NumberStartWith {

	public static void main(String[] args) {


		 List<Integer> list=Arrays.asList(22,2,3,2222,5,22222,7);
			
			System.out.println("=========Number Starts With==============");
			var result1=list.stream().map(e->e.toString())
			                .filter(e->e.startsWith("2"))
			              //.map(e->Integer.valueOf(e))
			                .collect(Collectors.toList());
			System.out.println(result1);

	}

}
