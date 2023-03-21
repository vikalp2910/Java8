package org.edu.vikson.coding.pro2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program11 {

	public static void main(String[] args) {
		

		
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(20);
		l.add(10);
		l.add(10);
		l.add(50);
		l.add(100);
				
		HashSet hs=new HashSet();
		l.stream().filter( i->!hs.add(i)).distinct().forEach(i->System.out.println(i));
			
	}
}
