package org.edu.vikson.coding.pro1;

import java.util.*;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee("Vikalp" , 29, "male"   , "IT"));
		list.add(new Employee("Anita"  , 28, "female" , "IT"));
		list.add(new Employee("Vikson" , 25, "male"   , "HR"));
		list.add(new Employee("Ankita" , 24, "female" , "HR"));
		
		//Print department name 
		System.out.println("=======print department name===========");
	  //list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		list.stream().map(Employee::getDepartment).distinct().forEach(e->System.out.println(e));
		

		//Print each department with number
		System.out.println("======Print each department with number============");
		Map<String,Long> departmentMap=list.stream().
				collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));		
		System.out.println(departmentMap);
		
		//average age of male and female employee
		System.out.println("=======average age of male and female employee===========");
		Map<String, Double> averageMap =list.stream().collect(Collectors.groupingBy(Employee::getGender
				                                      ,Collectors.averagingInt(Employee::getAge)));
		System.out.println(averageMap);

	}

}
