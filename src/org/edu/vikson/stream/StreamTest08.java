package org.edu.vikson.stream;

import java.util.stream.Stream;

public class StreamTest08 {

	public static void main(String[] args) {

       Integer[] intArray= {1,2,3,4,5,6,7,8,9,10};
       
       for(Integer i :intArray) {
    	   System.out.println(i);
       }
       
       System.out.println("================");   
       String[] stringArray= {"vikalp","sonkar","2910","29"};
       
       Stream.of(intArray).filter(i->i%2==0).forEach(i->System.out.println(i));
       System.out.println("====================");
       Stream.of(stringArray).forEach(s->System.out.println(s));
       
       System.out.println("==================");
       Stream.of("sonkar",29,10,"vikalp").forEach(i->System.out.println(i));

	}

}
