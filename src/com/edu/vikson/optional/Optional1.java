package com.edu.vikson.optional;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {

		String name="vikalp";
		//String name=null;
		
		Optional<String> optional=Optional.ofNullable(name);
		
		if(optional.isPresent())
		{
			String result=optional.get();
			System.out.println(result);
		}
		

	}

}
