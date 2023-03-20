package org.edu.vikson.optional;

import java.util.Optional;

public class Optional2 {
	
	

	public static void main(String[] args) {
		
		//String name ="vikalp";
		String name =null;
		
		Optional<String> optional1=Optional.empty();
		Optional<String> optional2=Optional.ofNullable(name);
		
		System.out.println(optional1.isEmpty());
		System.out.println(optional2.isEmpty());
		
		System.out.println(optional1.orElse("this is dummy value"));
		System.out.println(optional2.orElse("this is dummy value"));
	}

}
