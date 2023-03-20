package org.edu.vikson.coding.pro2;

import java.util.ArrayList;
import java.util.List;

public class Program08 {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(29, "Vikalp"  ,90000, "Tech" , "Male"   , 2019));
		list.add(new Employee(28, "Anita"   ,80000, "Tech" , "Female" , 2022));
		list.add(new Employee(24, "Ankita"  ,50000, "HR"   , "Female" , 2014));
		list.add(new Employee(25, "Zen"     ,60000, "Ops"  , "Male"   , 2015));
		list.add(new Employee(34, "Denim"   ,85000, "HR"   , "Male"   , 2022));
		list.add(new Employee(26, "Sami"    ,40000, "Ops"  , "Female" , 2021));
		list.add(new Employee(23, "Lita"    ,55000, "HR"   , "Female" , 2023));
		
		System.out.println("=======Youngest Female Employee record of HR=================");
		
		list.stream().filter( e->e.getDepartment().equalsIgnoreCase("HR") )
		             .sorted( (e1,e2)->(int)e1.getAge() -e2.getAge() )
		             .limit(1)
		             .forEach(e->System.out.println(e));
		
		System.out.println("=======Youngest Female Employee name of HR=================");
		
		list.stream().filter(e->e.getDepartment().equalsIgnoreCase("HR"))
		             .sorted( (e1,e2)-> (int) e1.getAge()-e2.getAge()  )
		             .limit(1)
		             .forEach(e->System.out.println(e));
		
        System.out.println("=======Second Youngest Female Employee name of HR=================");
		
		list.stream().filter(e->e.getDepartment().equalsIgnoreCase("HR"))
		             .sorted( (e1,e2)-> (int) e1.getAge()-e2.getAge()  )
		             .skip(1)
		             .limit(1)
		             .forEach(e->System.out.println(e));

	}

}
