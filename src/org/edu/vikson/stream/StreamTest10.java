package org.edu.vikson.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest10 {

	public static void main(String[] args) { 
		 List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 list.stream().filter(i->i%2==0).map(i->i+i).filter(i->i<5).forEach(i->System.out.println(i));		 
	}
}