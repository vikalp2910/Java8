package org.edu.vikson.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
      
		FlatMapPojo f1=new FlatMapPojo(29, "vikalp", Arrays.asList("Bangalore","Delhi"));
		FlatMapPojo f2=new FlatMapPojo(10, "sonkar", Arrays.asList("Bangalore","Pune"));
		FlatMapPojo f3=new FlatMapPojo(01, "vikson", Arrays.asList("Noida","Hyderabad","Pune"));
	    
		List<FlatMapPojo> list=new ArrayList<FlatMapPojo>();
		list.add(f1);list.add(f2);list.add(f3);
		
		System.out.println(list);
		
		List<Integer> idList= list.stream().map(e->e.getId()).collect(Collectors.toList());
		System.out.println(idList);
		
		List<List<String>> cityList= list.stream().map(e->e.getCity()).collect(Collectors.toList());
		System.out.println(cityList);
		
		Set<String> cityList2=list.stream().flatMap(e->e.getCity().stream()).collect(Collectors.toSet());
		System.out.println(cityList2);
		
		List<String> cityList3=cityList2.stream().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
		System.out.println(cityList3);
		
		cityList2.stream().collect(Collectors.toList()).stream().sorted().forEach(i->System.out.println(i));
	}

}
