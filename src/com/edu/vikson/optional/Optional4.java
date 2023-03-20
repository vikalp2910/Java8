package com.edu.vikson.optional;

import java.util.Optional;

public class Optional4 {



	public static void main(String[] args) {
		
		var optional1 = Optional.ofNullable("vik");
		var optional2 = Optional.empty();
		
		if(optional1.isPresent())
			System.out.println(optional1.orElse("no value"));
			System.out.println(optional2.orElse("no value"));
		

	}

}
