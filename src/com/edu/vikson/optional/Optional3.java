package com.edu.vikson.optional;

import java.util.Optional;

public class Optional3 {

	public static Optional<String> getName() {
	  //String name="vikson";
	  String name=null;
		return Optional.ofNullable(name);
	}
	public static void main(String[] args) {
		
		
		Optional<String> name=getName();
		if(name.isPresent())
			System.out.println(name.get());
		else
		System.out.println(name.orElse("this is test value"));

	}
	  

}
