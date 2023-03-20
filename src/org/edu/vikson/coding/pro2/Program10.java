package org.edu.vikson.coding.pro2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Program10 {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(29, "Vikalp"  ,90000, "Tech" , "Male"   , 2019));
		list.add(new Employee(28, "Anita"   ,80000, "Tech" , "Female" , 2022));
		list.add(new Employee(24, "Ankita"  ,50000, "HR"   , "Female" , 2014));
		list.add(new Employee(25, "Zen"     ,60000, "Ops"  , "Male"   , 2015));
		list.add(new Employee(34, "Denim"   ,85000, "HR"   , "Male"   , 2022));
		list.add(new Employee(26, "Sami"    ,40000, "Ops"  , "Female" , 2021));
		
		System.out.println("=======Name of Tech & HR Employees=================");

		list.stream().filter( e-> e.getDepartment().equalsIgnoreCase("Tech") 
				                  || e.getDepartment().equalsIgnoreCase("HR") )
		             .map(Employee::getName)
		             .forEach(e->System.out.println(e));
		
		System.out.println("=======Record of Tech Employees=================");
		
		list.stream().filter( e-> e.getDepartment().equalsIgnoreCase("Tech") )
		             .collect(Collectors.toList())
		             .forEach(e->System.out.println(e));
		
		
	}

}
