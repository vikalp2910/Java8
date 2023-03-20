package com.edu.vikson.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


public class DuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,30,50,70,50,20,90,90,10,90);
		HashSet<Integer> hashSet=new HashSet<Integer>();
		list.stream().filter(i->!hashSet.add(i)).collect(Collectors.toSet()).forEach(i->System.out.println(i));
		
		System.out.println("===================");
		List<Integer> integerList=new ArrayList<Integer>(list.stream().filter(i->!hashSet.add(i))
				                                .collect(Collectors.toSet())
				                                .stream().sorted().collect(Collectors.toList()));
		System.out.println(integerList);
		
		HashSet<Integer> hashSet2=new HashSet<Integer>();
		System.out.println("===================");
		list.stream().filter(i->!hashSet2.add(i)).collect(Collectors.toSet()).stream().sorted().collect(Collectors.toList()).forEach(i->System.out.println(i));
		
	}
}
