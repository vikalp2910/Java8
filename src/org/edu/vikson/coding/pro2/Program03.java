package org.edu.vikson.coding.pro2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program03 {

	public static void main(String[] args) {

		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(29, "Vikalp"  ,90000, "Tech" , "Male"   , 2019));
		list.add(new Employee(28, "Anita"   ,80000, "Tech" , "Female" , 2022));
		list.add(new Employee(24, "Ankita"  ,50000, "HR"   , "Female" , 2014));
		list.add(new Employee(25, "Zen"     ,60000, "Ops"  , "Male"   , 2015));
		list.add(new Employee(34, "Denim"   ,85000, "HR"   , "Male"   , 2022));
		list.add(new Employee(26, "Sami"    ,40000, "Ops"  , "Female" , 2021));
		list.add(new Employee(23, "Lita"    ,55000, "HR"   , "Female" , 2023));
		
		System.out.println("=======Count of Male and Female=================");
		
		var genderCount=list.stream().collect( Collectors.groupingBy(Employee::getGender , Collectors.counting()));
		System.out.println(genderCount);
				             

	}

}
